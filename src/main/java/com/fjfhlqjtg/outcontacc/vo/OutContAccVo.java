package com.fjfhlqjtg.outcontacc.vo;

import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * 分出合同XML字符串转换的JavaBean
 * @author fjfhlqjtg
 *
 */
public class OutContAccVo {
	private String serviceType=null;
	private String operateType=null;
	@NotNull
	private PlyInfoVo plyVo=null;
	@NotNull
	private TaskInfoVo taskVo=null;
	private List<PlyPayPlanVo> planList=null;
	
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
	public PlyInfoVo getPlyVo() {
		return plyVo;
	}
	public void setPlyVo(PlyInfoVo plyVo) {
		this.plyVo = plyVo;
	}
	public TaskInfoVo getTaskVo() {
		return taskVo;
	}
	public void setTaskVo(TaskInfoVo taskVo) {
		this.taskVo = taskVo;
	}
	public List<PlyPayPlanVo> getPlanList() {
		return planList;
	}
	public void setPlanList(List<PlyPayPlanVo> planList) {
		this.planList = planList;
	}
}
