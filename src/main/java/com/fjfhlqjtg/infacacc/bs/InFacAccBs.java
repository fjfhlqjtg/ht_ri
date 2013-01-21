package com.fjfhlqjtg.infacacc.bs;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import javax.validation.Validator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.infacacc.dao.InFacAccDao;
import com.fjfhlqjtg.infacacc.vo.BaseVo;
import com.fjfhlqjtg.infacacc.vo.ExpenseVo;
import com.fjfhlqjtg.infacacc.vo.InFacAccVo;
import com.fjfhlqjtg.infacacc.vo.PlanVo;
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
	@Autowired
	private InFacAccDao dao;

	public String infacacc(String xmlStr) {
		String msg = null;
		if (StringUtil.isNotNull(xmlStr)) {
			try {
				// 1、 转换xml
				Object obj = XMLUtil.parseXml2JavaBean("INFACACC", xmlStr);
				InFacAccVo vo = null;
				if (obj != null)
					vo = (InFacAccVo) obj;
				// 2、保存日志
				logBs.saveLog(vo, xmlStr);
				// 3、 校验入参
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
				// TODO 3、保存入参
				saveInfo(vo);
			} catch (ConversionException e) {
				log.error(e.getMessage());
				msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1002",
						"入参转换失败.");
			} catch (ValidationException e) {// Validation校验异常
				log.error(e.getMessage());
				msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1003",
						"入参校验失败.");
			} catch (SQLException e) {
				log.error(e.getMessage());
				msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1004",
						"数据保存失败." + e.getMessage());
			} catch (Exception e) {
				log.error(e.getMessage());
				msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1900", "其它错误."
						+ e.getMessage());
			}
		} else {
			msg = MsgUtil.buildReturnMsg("INFACACC", "1", "-1001", "入参xml为空.");
		}
		return msg;
	}

	/**
	 * 保存入参信息
	 * 
	 * @param vo
	 *            入参XML转换的JavaBean
	 *            ，详细见<see>com.fjfhlqjtg.infacacc.vo.InFacAccVo</ see>
	 */
	private void saveInfo(InFacAccVo vo) throws Exception {
		// 3.1、保存基本信息
		BaseVo baseVo = vo.getBaseVo();
		saveBaseInfo(baseVo);
		// 3.2、保存费用信息
		List<ExpenseVo> expenList = vo.getExpenseList();
		saveExpenList(expenList);
		// TODO 3.3、保存账单信息
		List<PlanVo> planList = vo.getPlanList();
		saveMaAndSub(baseVo, expenList, planList);
	}

	/**
	 * 保存主子表信息
	 * 
	 * @param baseVo
	 *            基本信息JavaBean,详细见<see>com.fjfhlqjtg.infacacc.vo.BaseVo</see>
	 * @param expenList
	 *            费用信息JavaBean集合,详细见<see>com.fjfhlqjtg.infacacc.vo.ExpenseVo</
	 *            see>
	 * @param planList
	 *            付款计划JavaBean集合,详细见<see>com.fjfhlqjtg.infacacc.vo.PlanVo</see>
	 */
	private void saveMaAndSub(BaseVo baseVo, List<ExpenseVo> expenList,
			List<PlanVo> planList) {
		if(baseVo!=null&&expenList!=null&&planList!=null){
			
		}

	}

	/**
	 * 保存分入临分费用信息
	 * 
	 * @param expenList
	 *            费用信息JavaBean集合,详细见<see>com.fjfhlqjtg.infacacc.vo.ExpenseVo</
	 *            see>
	 */
	private void saveExpenList(List<ExpenseVo> expenList) throws Exception {
		if (expenList != null) {
			for (ExpenseVo vo : expenList) {
				if (vo == null)
					continue;
				dao.saveExpenInfo(vo);
			}
		}
	}

	/**
	 * 保存分入临分基本信息
	 * 
	 * @param baseVo
	 *            基本信息JavaBean，详细见<see>com.fjfhlqjtg.infacacc.vo.BaseVo</see>
	 */
	private void saveBaseInfo(BaseVo baseVo) throws Exception {
		if (baseVo != null) {
			dao.saveBaseInfo(baseVo);
		}
	}
}
