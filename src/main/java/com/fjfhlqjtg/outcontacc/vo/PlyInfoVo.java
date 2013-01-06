package com.fjfhlqjtg.outcontacc.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fjfhlqjtg.validator.annotation.ContExistCheck;
import com.fjfhlqjtg.validator.annotation.ContReadyCheck;
import com.fjfhlqjtg.validator.annotation.DeptCodeCheck;
import com.fjfhlqjtg.validator.annotation.ExcludeCheck;

public class PlyInfoVo {

	private Date crtTime=null;
	private String crtCode=null;
	private Date updTime=null;
	private String updCode=null;
	private String plyAppNo=null;
	private String plyNo=null;
	private String edrAppNo=null;
	private String edrNo=null;
	private String docNo=null;
	private String docType=null;
	private String serialNo=null;
	@NotNull(message="险种编号不能为空")
	private String insuCode=null;
	@NotNull(message="部门编号不能为空")
	@DeptCodeCheck(message="部门编号错误")
	private String deptNo=null;
	private String insuName=null;
	private String agentCode=null;
	private String agentComPrt=null;
	@NotNull(message="起保时间不能为空.")
	@ContReadyCheck(message="合同未就绪")
	@ContExistCheck(message="没有可进入的合同")
	private Date insuBegTime=null;
	private Date insuEndTime=null;
	private Date payBegTime=null;
	private Date payEndTime=null;
	private String payMode=null;
	private String insuCurr=null;
	private String insuAmt=null;
	private String insuAmtVar=null;
	private String prmCurr=null;
	private String prmAmt=null;
	private String prmAmtVar=null;
	private String showAmt=null;
	private String showAmtVar=null;
	private String commisonAmt=null;
	private String commisonAmtVar=null;
	private String brokerAmt=null;
	private String brokerAmtVar=null;
	private Date insuTime=null;
	private Date payBeforeInsuTime=null;
	private Date maxTime=null;
	private String remark=null;
	private String saleSys=null;
	private String persistMark=null;
	@ExcludeCheck(message="除外标的不正确")
	private String exclude=null;
	private String riskLev=null;
	
	public Date getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	public String getCrtCode() {
		return crtCode;
	}
	public void setCrtCode(String crtCode) {
		this.crtCode = crtCode;
	}
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	public String getUpdCode() {
		return updCode;
	}
	public void setUpdCode(String updCode) {
		this.updCode = updCode;
	}
	public String getPlyAppNo() {
		return plyAppNo;
	}
	public void setPlyAppNo(String plyAppNo) {
		this.plyAppNo = plyAppNo;
	}
	public String getPlyNo() {
		return plyNo;
	}
	public void setPlyNo(String plyNo) {
		this.plyNo = plyNo;
	}
	public String getEdrAppNo() {
		return edrAppNo;
	}
	public void setEdrAppNo(String edrAppNo) {
		this.edrAppNo = edrAppNo;
	}
	public String getEdrNo() {
		return edrNo;
	}
	public void setEdrNo(String edrNo) {
		this.edrNo = edrNo;
	}
	public String getDocNo() {
		return docNo;
	}
	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getInsuCode() {
		return insuCode;
	}
	public void setInsuCode(String insuCode) {
		this.insuCode = insuCode;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getInsuName() {
		return insuName;
	}
	public void setInsuName(String insuName) {
		this.insuName = insuName;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentComPrt() {
		return agentComPrt;
	}
	public void setAgentComPrt(String agentComPrt) {
		this.agentComPrt = agentComPrt;
	}
	public Date getInsuBegTime() {
		return insuBegTime;
	}
	public void setInsuBegTime(Date insuBegTime) {
		this.insuBegTime = insuBegTime;
	}
	public Date getInsuEndTime() {
		return insuEndTime;
	}
	public void setInsuEndTime(Date insuEndTime) {
		this.insuEndTime = insuEndTime;
	}
	public Date getPayBegTime() {
		return payBegTime;
	}
	public void setPayBegTime(Date payBegTime) {
		this.payBegTime = payBegTime;
	}
	public Date getPayEndTime() {
		return payEndTime;
	}
	public void setPayEndTime(Date payEndTime) {
		this.payEndTime = payEndTime;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getInsuCurr() {
		return insuCurr;
	}
	public void setInsuCurr(String insuCurr) {
		this.insuCurr = insuCurr;
	}
	public String getInsuAmt() {
		return insuAmt;
	}
	public void setInsuAmt(String insuAmt) {
		this.insuAmt = insuAmt;
	}
	public String getInsuAmtVar() {
		return insuAmtVar;
	}
	public void setInsuAmtVar(String insuAmtVar) {
		this.insuAmtVar = insuAmtVar;
	}
	public String getPrmCurr() {
		return prmCurr;
	}
	public void setPrmCurr(String prmCurr) {
		this.prmCurr = prmCurr;
	}
	public String getPrmAmt() {
		return prmAmt;
	}
	public void setPrmAmt(String prmAmt) {
		this.prmAmt = prmAmt;
	}
	public String getPrmAmtVar() {
		return prmAmtVar;
	}
	public void setPrmAmtVar(String prmAmtVar) {
		this.prmAmtVar = prmAmtVar;
	}
	public String getShowAmt() {
		return showAmt;
	}
	public void setShowAmt(String showAmt) {
		this.showAmt = showAmt;
	}
	public String getShowAmtVar() {
		return showAmtVar;
	}
	public void setShowAmtVar(String showAmtVar) {
		this.showAmtVar = showAmtVar;
	}
	public String getCommisonAmt() {
		return commisonAmt;
	}
	public void setCommisonAmt(String commisonAmt) {
		this.commisonAmt = commisonAmt;
	}
	public String getCommisonAmtVar() {
		return commisonAmtVar;
	}
	public void setCommisonAmtVar(String commisonAmtVar) {
		this.commisonAmtVar = commisonAmtVar;
	}
	public String getBrokerAmt() {
		return brokerAmt;
	}
	public void setBrokerAmt(String brokerAmt) {
		this.brokerAmt = brokerAmt;
	}
	public String getBrokerAmtVar() {
		return brokerAmtVar;
	}
	public void setBrokerAmtVar(String brokerAmtVar) {
		this.brokerAmtVar = brokerAmtVar;
	}
	public Date getInsuTime() {
		return insuTime;
	}
	public void setInsuTime(Date insuTime) {
		this.insuTime = insuTime;
	}
	public Date getPayBeforeInsuTime() {
		return payBeforeInsuTime;
	}
	public void setPayBeforeInsuTime(Date payBeforeInsuTime) {
		this.payBeforeInsuTime = payBeforeInsuTime;
	}
	public Date getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(Date maxTime) {
		this.maxTime = maxTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSaleSys() {
		return saleSys;
	}
	public void setSaleSys(String saleSys) {
		this.saleSys = saleSys;
	}
	public String getPersistMark() {
		return persistMark;
	}
	public void setPersistMark(String persistMark) {
		this.persistMark = persistMark;
	}
	public String getExclude() {
		return exclude;
	}
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	public String getRiskLev() {
		return riskLev;
	}
	public void setRiskLev(String riskLev) {
		this.riskLev = riskLev;
	}
	
	
}
