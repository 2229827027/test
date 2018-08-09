package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.entity.TbDetail;
import com.accp.mapper.SanCiMapper;

@Service
public class SanCiSrevice  {
		
	@Autowired
	private SanCiMapper sanci;
	
	
	public List<TbDetail> selectAll(){
		return sanci.selectAll();
	}
}
