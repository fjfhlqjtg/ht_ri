package com.fjfhlqjtg.infacacc.vo;

import java.util.Date;

public class ExpenseVo {

	private Date crtTime=null;
	private String crtCode=null;
	private Date updTime=null;
	private String updCode=null;
	private String plyNo=null;
	private String expType=null;
	private double expRate=0;
	private String amount=null;
	
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
	public String getPlyNo() {
		return plyNo;
	}
	public void setPlyNo(String plyNo) {
		this.plyNo = plyNo;
	}
	public String getExpType() {
		return expType;
	}
	public void setExpType(String expType) {
		this.expType = expType;
	}
	public double getExpRate() {
		return expRate;
	}
	public void setExpRate(double expRate) {
		this.expRate = expRate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
