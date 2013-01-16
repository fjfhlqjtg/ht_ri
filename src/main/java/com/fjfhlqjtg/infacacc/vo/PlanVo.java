package com.fjfhlqjtg.infacacc.vo;

import java.util.Date;

public class PlanVo {

	private String plyNo=null;
	private String edrNo=null;
	private long paySeq=0;
	private String partyCde=null;
	private String partyName=null;
	private double npi=0;
	private String expenseAmt=null;
	private String premAmt=null;
	private String paidPrmAmt=null;
	private Date payBegTime=null;
	private Date payEndTime=null;
	
	public String getPlyNo() {
		return plyNo;
	}
	public void setPlyNo(String plyNo) {
		this.plyNo = plyNo;
	}
	public String getEdrNo() {
		return edrNo;
	}
	public void setEdrNo(String edrNo) {
		this.edrNo = edrNo;
	}
	public long getPaySeq() {
		return paySeq;
	}
	public void setPaySeq(long paySeq) {
		this.paySeq = paySeq;
	}
	public String getPartyCde() {
		return partyCde;
	}
	public void setPartyCde(String partyCde) {
		this.partyCde = partyCde;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public double getNpi() {
		return npi;
	}
	public void setNpi(double npi) {
		this.npi = npi;
	}
	public String getExpenseAmt() {
		return expenseAmt;
	}
	public void setExpenseAmt(String expenseAmt) {
		this.expenseAmt = expenseAmt;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getPaidPrmAmt() {
		return paidPrmAmt;
	}
	public void setPaidPrmAmt(String paidPrmAmt) {
		this.paidPrmAmt = paidPrmAmt;
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
	
	
}
