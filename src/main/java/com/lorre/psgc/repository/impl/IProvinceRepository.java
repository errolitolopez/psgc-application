package com.lorre.psgc.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lorre.psgc.mapper.ProvinceMapper;
import com.lorre.psgc.model.Province;
import com.lorre.psgc.repository.ProvinceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class IProvinceRepository implements ProvinceRepository {

	private final JdbcTemplate jdbcTemplate;

	@Override
	public List<Province> findAll() {
		return jdbcTemplate.query("SELECT * FROM PROVINCE ORDER BY NAME ASC", new ProvinceMapper());
	}

	@Override
	public List<Province> findAllByRegionCode(String regionCode) {
		String sql = "SELECT * FROM PROVINCES WHERE REGION_CODE = ? ORDER BY NAME ASC";
		return jdbcTemplate.query(sql, new Object[] { regionCode }, new ProvinceMapper());
	}
}
