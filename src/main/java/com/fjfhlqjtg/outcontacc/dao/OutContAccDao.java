package com.fjfhlqjtg.outcontacc.dao;

import org.apache.ibatis.annotations.Param;

import com.fjfhlqjtg.outcontacc.vo.PlyInfoVo;
import com.fjfhlqjtg.outcontacc.vo.PlyPayPlanVo;
import com.fjfhlqjtg.outcontacc.vo.TaskInfoVo;

public interface OutContAccDao {

	void saveBaseInfo(PlyInfoVo baseVo);

	void saveTaskInfo(TaskInfoVo taskVo);

	void savePayPlan(PlyPayPlanVo planVo);

	String queryForDeptCode(@Param(value="deptCde")String deptCde);

	String queryForContIsReady(@Param(value="year")int year);

	int queryForContIsExist(@Param(value="year")int year);

	String queryForExcludeCode(@Param(value="exclude")String exclude);
}
