package com.fjfhlqjtg.infacacc.dao;

import org.apache.ibatis.annotations.Param;

public interface InFacAccDao {

	String queryForSaleSys(@Param(value="saleSys")String saleSys);

}
