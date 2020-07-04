package com.lorre.psgc.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lorre.psgc.mapper.MunicipalityMapper;
import com.lorre.psgc.model.Municipality;
import com.lorre.psgc.repository.MunicipalityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class IMunicipalityRepository implements MunicipalityRepository {

	private final JdbcTemplate jdbcTemplate;

	@Override
	public List<Municipality> findAll() {
		return jdbcTemplate.query("SELECT * FROM MUNICIPALITY ORDER BY NAME ASC", new MunicipalityMapper());
	}

	@Override
	public List<Municipality> findAllByProvinceCode(String provinceCode) {
		String sql = "SELECT * FROM MUNICIPALITY WHERE PROVINCE_CODE = ? ORDER BY NAME ASC";
		return jdbcTemplate.query(sql, new Object[] { provinceCode }, new MunicipalityMapper());
	}
}
