package com.fjfhlqjtg.infacacc.dao;

import org.apache.ibatis.annotations.Param;

import com.fjfhlqjtg.infacacc.vo.BaseVo;
import com.fjfhlqjtg.infacacc.vo.ExpenseVo;

public interface InFacAccDao {

	String queryForSaleSys(@Param(value="saleSys")String saleSys);

	void saveBaseInfo(BaseVo baseVo);

	void saveExpenInfo(ExpenseVo vo);

}
