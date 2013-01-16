package com.fjfhlqjtg.infacacc.vo;

import java.util.List;

import javax.validation.Valid;

/**
 * 分入临分入参XML转换的JavaBean
 * @author fjfhlqjtg
 *
 */
public class InFacAccVo {
	private String serviceType=null;
	private String operateType=null;
	@Valid
	private BaseVo baseVo=null;
	private List<ExpenseVo> expenseList=null;
	private List<PlanVo> planList=null;
	
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public BaseVo getBaseVo() {
		return baseVo;
	}
	public void setBaseVo(BaseVo baseVo) {
		this.baseVo = baseVo;
	}
	public List<ExpenseVo> getExpenseList() {
		return expenseList;
	}
	public void setExpenseList(List<ExpenseVo> expenseList) {
		this.expenseList = expenseList;
	}
	public List<PlanVo> getPlanList() {
		return planList;
	}
	public void setPlanList(List<PlanVo> planList) {
		this.planList = planList;
	}
	
	
}
