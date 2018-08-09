package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.entity.TbDetail;

public interface SanCiMapper {
	
	@Select("select * from tb_detail")
	List<TbDetail> selectAll();
}
