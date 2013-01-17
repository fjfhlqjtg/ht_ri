package com.fjfhlqjtg.log.bs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.infacacc.vo.BaseVo;
import com.fjfhlqjtg.infacacc.vo.InFacAccVo;
import com.fjfhlqjtg.log.dao.LogDao;
import com.fjfhlqjtg.log.vo.LogVo;
import com.fjfhlqjtg.outcontacc.vo.OutContAccVo;
import com.fjfhlqjtg.outcontacc.vo.PlyInfoVo;

public class LogBs {
	private final Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private LogDao dao;

	public void saveLog(Object obj, String xmlStr) {
		try {
			if (obj instanceof OutContAccVo) {
				OutContAccVo vo = (OutContAccVo) obj;
				saveOutContLog(vo, xmlStr);
			} else if (obj instanceof InFacAccVo) {
				InFacAccVo vo = (InFacAccVo) obj;
				saveInFacLog(vo, xmlStr);
			}
		} catch (Exception e) {
			log.error("保存日志信息失败,"+e.getMessage());
		}
	}

	private void saveInFacLog(InFacAccVo vo, String xmlStr) throws Exception {
		LogVo logVo = new LogVo();
		BaseVo baseVo = vo.getBaseVo();
		logVo.setT_crt_tm(baseVo.getCrtTime());
		logVo.setC_ply_app_no(baseVo.getPlyAppNo());
		logVo.setC_ply_no(baseVo.getPlyNo());
		logVo.setC_edr_app_no(baseVo.getEdrAppNo());
		logVo.setC_edr_no(baseVo.getEdrNo());
		logVo.setC_clm_no("");
		logVo.setC_undr_mrk("");
		logVo.setN_clm_tms("");
		logVo.setC_interface_nme("INFACACC");
		logVo.setC_interface_content(xmlStr);
		dao.saveLog(logVo);
	}

	private void saveOutContLog(OutContAccVo vo, String xmlStr)
			throws Exception {
		LogVo logVo = new LogVo();
		PlyInfoVo baseVo = vo.getPlyVo();
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
