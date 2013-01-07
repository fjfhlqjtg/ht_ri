package com.fjfhlqjtg.outcontacc.bs;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.outcontacc.dao.OutContAccDao;
import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.outcontacc.vo.PlyInfoVo;
import com.fjfhlqjtg.outcontacc.vo.PlyPayPlanVo;
import com.fjfhlqjtg.outcontacc.vo.TaskInfoVo;
import com.fjfhlqjtg.utils.MsgUtil;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.utils.XMLUtil;

public class OutContAccBs {
	private final Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private OutContAccDao dao;
	@Autowired
	private Validator validator;
	/**
	 * 分出合同计算服务
	 * 
	 * @author fjfhlqjtg
	 * @param xmlStr
	 * @return
	 */
	public String outcontacc(String xmlStr) {
		String msg = null;
		// 1、校验传入xml字符串是否为空或规范
		if (StringUtil.isNotNull(xmlStr)) {
			// 2、转换xml字符串为JavaBean
			try {
				OutContAccVo vo = null;
				Object obj = XMLUtil.parseXml2JavaBean("OUTCONTACC", xmlStr);
				if (obj != null)
					vo = (OutContAccVo) obj;
				// TODO 3、校验JavaBean和字段是否符合业务条件
				Set<ConstraintViolation<OutContAccVo>> constraintValidator = validator
						.validate(vo);
				log.error(constraintValidator.iterator().next().getMessage());
				// TODO 4、分别保存日志信息、基本信息、离线任务信息和缴费计划信息
				save(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			msg = MsgUtil.buildReturnMsg("OUTCONTACC", "4", "-4001", "入参xml为空");
		}
		return msg;
	}

	/**
	 * 保存xml信息到数据库
	 * 
	 * @param vo
	 */
	private void save(OutContAccVo vo) throws Exception{
		if (vo != null) {
			PlyInfoVo baseVo = vo.getPlyVo();
			TaskInfoVo taskVo = vo.getTaskVo();
			List<PlyPayPlanVo> planList = vo.getPlanList();
			saveBaseInfo(baseVo);
			saveTaskInfo(taskVo);
			savePayPlan(planList);
		}
	}

	/**
	 * 保存付款计划信息
	 * 
	 * @param planList
	 *            付款计划
	 */
	private void savePayPlan(List<PlyPayPlanVo> planList) throws Exception{
		for(PlyPayPlanVo vo:planList){
			dao.savePayPlan(vo);
		}
	}

	/**
	 * 保存离线任务信息
	 * 
	 * @param taskVo
	 *            离线任务
	 */
	private void saveTaskInfo(TaskInfoVo taskVo) throws Exception{
		dao.saveTaskInfo(taskVo);
	}

	/**
	 * 保存基本信息
	 * 
	 * @param baseVo
	 *            基本信息
	 */
	private void saveBaseInfo(PlyInfoVo baseVo) throws Exception{
		dao.saveBaseInfo(baseVo);
	}
}
