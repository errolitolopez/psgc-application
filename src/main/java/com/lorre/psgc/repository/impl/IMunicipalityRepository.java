package com.lorre.psgc.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		return jdbcTemplate.query("SELECT * FROM MUNICIPALITY", new MunicipalityMapper());
	}

	@Override
	public Optional<Municipality> findById(int id) {
		String sql = "SELECT * FROM MUNICIPALITY WHERE ID = ?";
		try {

			return Optional.of(jdbcTemplate.queryForObject(sql, new Object[] { id }, new MunicipalityMapper()));

		} catch (EmptyResultDataAccessException e) {

			return Optional.empty();
		}
	}

	@Override
	public List<Municipality> findAllByProvinceId(int id) {
		String sql = "SELECT * FROM MUNICIPALITY WHERE PROVINCE_ID = ?";
		return jdbcTemplate.query(sql, new Object[] { id }, new MunicipalityMapper());
	}
}
