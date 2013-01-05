package com.fjfhlqjtg.outcontacc.vo;

import java.util.Date;

public class PlyPayPlanVo {

	private String plyAppNo=null;
	private String plyNo=null;
	private String edrAppNo=null;
	private String edrNo=null;
	private String paySeq=null;
	private Date payBegTime=null;
	private Date payEndTime=null;
	private String prmAmt=null;
	private String curr=null;
	private String state=null;
	
	
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
	public String getPaySeq() {
		return paySeq;
	}
	public void setPaySeq(String paySeq) {
		this.paySeq = paySeq;
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
	public String getPrmAmt() {
		return prmAmt;
	}
	public void setPrmAmt(String prmAmt) {
		this.prmAmt = prmAmt;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
