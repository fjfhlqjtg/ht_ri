package com.fjfhlqjtg.outcontacc.dao;

import java.util.List;

import com.fjfhlqjtg.outcontacc.vo.PlyInfoVo;
import com.fjfhlqjtg.outcontacc.vo.PlyPayPlanVo;
import com.fjfhlqjtg.outcontacc.vo.TaskInfoVo;

public interface OutContAccDao {

	void saveBaseInfo(PlyInfoVo baseVo);

	void saveTaskInfo(TaskInfoVo taskVo);

	void savePayPlan(PlyPayPlanVo planVo);

}
