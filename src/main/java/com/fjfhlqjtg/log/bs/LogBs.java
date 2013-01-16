package com.fjfhlqjtg.log.bs;

import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.log.dao.LogDao;
import com.fjfhlqjtg.log.vo.LogVo;
import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.outcontacc.vo.PlyInfoVo;

public class LogBs {
	@Autowired
	private LogDao dao;

	public void saveLog(Object obj, String xmlStr) {
		if(obj instanceof OutContAccVo){
			OutContAccVo vo=(OutContAccVo) obj;
			saveOutContLog(vo,xmlStr);
		}
	}

	@SuppressWarnings("unused")
	private void saveInFacLog(OutContAccVo vo, String xmlStr) {
		
	}

	private void saveOutContLog(OutContAccVo vo, String xmlStr) {
		LogVo logVo=new LogVo();
		PlyInfoVo baseVo=vo.getPlyVo();
		logVo.setT_crt_tm(baseVo.getCrtTime());
		logVo.setC_ply_app_no(baseVo.getPlyAppNo());
		logVo.setC_ply_no(baseVo.getPlyNo());
		logVo.setC_edr_app_no(baseVo.getEdrAppNo());
		logVo.setC_edr_no(baseVo.getEdrNo());
		logVo.setC_clm_no("");
		logVo.setC_undr_mrk("");
		logVo.setN_clm_tms("");
		logVo.setC_interface_nme("OUTCONTACC");
		logVo.setC_interface_content(xmlStr);
		dao.saveLog(logVo);
	}


}
