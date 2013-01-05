package com.fjfhlqjtg.outcontacc.bs;

import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.utils.MsgUtil;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.utils.XMLUtil;

public class OutContAccBs {

	/**
	 * 分出合同计算服务
	 * @author fjfhlqjtg
	 * @param xmlStr
	 * @return
	 */
	public String outcontacc(String xmlStr){
		String msg=null;
		// 1、校验传入xml字符串是否为空或规范
		if(StringUtil.isNotNull(xmlStr)){
			//TODO 2、转换xml字符串为JavaBean
			OutContAccVo vo= null;
			Object obj=null;
			try {
				obj = XMLUtil.parseXml2JavaBean("OUTCONTACC",xmlStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(obj!=null)vo=(OutContAccVo) obj;
			
		}else {
			msg=MsgUtil.buildReturnMsg("OUTCONTACC","4","-4001","入参xml为空");
		}
		//TODO 3、校验JavaBean和字段是否符合业务条件
		//TODO 4、分别保存日志信息、基本信息、离线任务信息和缴费计划信息
		return msg;
	}
}
