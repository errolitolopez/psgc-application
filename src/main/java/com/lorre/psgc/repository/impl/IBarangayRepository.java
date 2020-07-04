package com.lorre.psgc.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lorre.psgc.mapper.BarangayMapper;
import com.lorre.psgc.model.Barangay;
import com.lorre.psgc.repository.BarangayRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class IBarangayRepository implements BarangayRepository {

	private final JdbcTemplate jdbcTemplate;

	@Override
	public List<Barangay> findAllByMunicipalityCode(String municipalityCode) {
		String sql = "SELECT * FROM BARANGAY WHERE MUNICIPALITY_CODE = ? ORDER BY NAME ASC";
		return jdbcTemplate.query(sql, new Object[] { municipalityCode }, new BarangayMapper());
	}
}
