package com.lorre.psgc.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		return jdbcTemplate.query("SELECT * FROM PROVINCE", new ProvinceMapper());
	}

	@Override
	public Optional<Province> findById(int id) {
		String sql = "SELECT * FROM PROVINCE WHERE ID = ?";
		try {

			return Optional.of(jdbcTemplate.queryForObject(sql, new Object[] { id }, new ProvinceMapper()));

		} catch (EmptyResultDataAccessException e) {

			return Optional.empty();
		}
	}
}
