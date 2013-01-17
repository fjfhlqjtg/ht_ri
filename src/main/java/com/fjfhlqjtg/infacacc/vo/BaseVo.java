package com.fjfhlqjtg.infacacc.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fjfhlqjtg.validator.annotation.DeptCodeCheck;
import com.fjfhlqjtg.validator.annotation.SaleSysCheck;

public class BaseVo {

	private Date crtTime=null;
	private String crtCode=null;
	private Date updTime=null;
	private String updCode=null;
	private String plyAppNo=null;
	private String plyNo=null;
	private String edrAppNo=null;
	private String edrNo=null;
	private String facNo=null;
	private String oriPlyNo=null;
	private String oriInsuAmt=null;
	private String oriPrmAmt=null;
	private String curr=null;
	private double shareRate=0;
	private double acceptRate=0;
	private String prmAmt=null;
	private double npi=0;
	private String sumExpense=null;
	private String cedIngComCode=null;
	private String cedEdComCode=null;
	private String insuCode=null;
	private String brokeCode=null;
	private Date accountTime=null;
	private long sumPay=0;
	@NotNull(message="部门编号不能为空")
	@NotEmpty(message="部门编号不能为空")
	@DeptCodeCheck(message="部门编号错误")
	private String deptCode=null;
	@NotNull(message="销售体系不能为空")
	@NotEmpty(message="销售体系不能为空")
	@SaleSysCheck(message="销售体系错误")
	private String saleSys=null;
	private Date startTime=null;
	private Date issueTime=null;
	private String insuNme=null;
	
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
	public String getFacNo() {
		return facNo;
	}
	public void setFacNo(String facNo) {
		this.facNo = facNo;
	}
	public String getOriPlyNo() {
		return oriPlyNo;
	}
	public void setOriPlyNo(String oriPlyNo) {
		this.oriPlyNo = oriPlyNo;
	}
	public String getOriInsuAmt() {
		return oriInsuAmt;
	}
	public void setOriInsuAmt(String oriInsuAmt) {
		this.oriInsuAmt = oriInsuAmt;
	}
	public String getOriPrmAmt() {
		return oriPrmAmt;
	}
	public void setOriPrmAmt(String oriPrmAmt) {
		this.oriPrmAmt = oriPrmAmt;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public double getShareRate() {
		return shareRate;
	}
	public void setShareRate(double shareRate) {
		this.shareRate = shareRate;
	}
	public double getAcceptRate() {
		return acceptRate;
	}
	public void setAcceptRate(double acceptRate) {
		this.acceptRate = acceptRate;
	}
	public String getPrmAmt() {
		return prmAmt;
	}
	public void setPrmAmt(String prmAmt) {
		this.prmAmt = prmAmt;
	}
	public double getNpi() {
		return npi;
	}
	public void setNpi(double npi) {
		this.npi = npi;
	}
	public String getSumExpense() {
		return sumExpense;
	}
	public void setSumExpense(String sumExpense) {
		this.sumExpense = sumExpense;
	}
	public String getCedIngComCode() {
		return cedIngComCode;
	}
	public void setCedIngComCode(String cedIngComCode) {
		this.cedIngComCode = cedIngComCode;
	}
	public String getCedEdComCode() {
		return cedEdComCode;
	}
	public void setCedEdComCode(String cedEdComCode) {
		this.cedEdComCode = cedEdComCode;
	}
	public String getInsuCode() {
		return insuCode;
	}
	public void setInsuCode(String insuCode) {
		this.insuCode = insuCode;
	}
	public String getBrokeCode() {
		return brokeCode;
	}
	public void setBrokeCode(String brokeCode) {
		this.brokeCode = brokeCode;
	}
	public Date getAccountTime() {
		return accountTime;
	}
	public void setAccountTime(Date accountTime) {
		this.accountTime = accountTime;
	}
	public long getSumPay() {
		return sumPay;
	}
	public void setSumPay(long sumPay) {
		this.sumPay = sumPay;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getSaleSys() {
		return saleSys;
	}
	public void setSaleSys(String saleSys) {
		this.saleSys = saleSys;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getIssueTime() {
		return issueTime;
	}
	public void setIssueTime(Date issueTime) {
		this.issueTime = issueTime;
	}
	public String getInsuNme() {
		return insuNme;
	}
	public void setInsuNme(String insuNme) {
		this.insuNme = insuNme;
	}
	
	
}
