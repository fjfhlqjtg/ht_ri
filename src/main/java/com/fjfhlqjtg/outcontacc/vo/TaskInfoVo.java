package com.fjfhlqjtg.outcontacc.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class TaskInfoVo {

	private Date crtTime=null;
	private String crtCode=null;
	private Date updTime=null;
	private String updCode=null;
	private String plyAppNo=null;
	private String plyNo=null;
	private String edrAppNo=null;
	private String edrNo=null;
	private String isIssued=null;
	private String insuAmt=null;
	private String prmAmt=null;
	@NotNull
	private Date startTime=null;
	private String dptCode=null;
	
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
	public String getIsIssued() {
		return isIssued;
	}
	public void setIsIssued(String isIssued) {
		this.isIssued = isIssued;
	}
	public String getInsuAmt() {
		return insuAmt;
	}
	public void setInsuAmt(String insuAmt) {
		this.insuAmt = insuAmt;
	}
	public String getPrmAmt() {
		return prmAmt;
	}
	public void setPrmAmt(String prmAmt) {
		this.prmAmt = prmAmt;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getDptCode() {
		return dptCode;
	}
	public void setDptCode(String dptCode) {
		this.dptCode = dptCode;
	}
	
}
