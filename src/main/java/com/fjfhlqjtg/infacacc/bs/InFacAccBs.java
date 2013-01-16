package com.fjfhlqjtg.infacacc.bs;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import javax.validation.Validator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.infacacc.vo.InFacAccVo;
import com.fjfhlqjtg.log.bs.LogBs;
import com.fjfhlqjtg.utils.MsgUtil;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.utils.XMLUtil;
import com.thoughtworks.xstream.converters.ConversionException;

/**
 * 分入临分服务
 * 
 * @author fjfhlqjtg
 * 
 */
public class InFacAccBs {
	private final Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private LogBs logBs;
	@Autowired
	private Validator validator;

	public String infacacc(String xmlStr) {
		String msg = null;
		if (StringUtil.isNotNull(xmlStr)) {
			try {
				// 1、 转换xml
				Object obj = XMLUtil.parseXml2JavaBean("INFACACC", xmlStr);
				InFacAccVo vo = null;
				if (obj != null)
					vo = (InFacAccVo) obj;
				// 2、 校验入参
				Set<ConstraintViolation<InFacAccVo>> constraintValidator = validator
						.validate(vo);
				log.error(constraintValidator.iterator().next().getMessage());
				if (constraintValidator.size() != 0) {
					StringBuffer sb = new StringBuffer();
					Iterator<ConstraintViolation<InFacAccVo>> it = constraintValidator
							.iterator();
					for (; it.hasNext();) {
						sb.append(it.next().getMessage()).append(";");
					}
					throw new ValidationException(sb.toString());
				}
				// 3、TODO 保存入参
			} catch (ConversionException e) {
				log.error(e.getMessage());
				msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1002",
						"入参转换失败.");
			} catch (ValidationException e) {// Validation校验异常
				log.error(e.getMessage());
				msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1003",
						"入参校验失败.");
			}
		} else {
			msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1001", "入参xml为空.");
		}
		return msg;
	}
}
