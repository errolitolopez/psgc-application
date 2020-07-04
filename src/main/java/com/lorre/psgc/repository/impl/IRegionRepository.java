package com.lorre.psgc.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lorre.psgc.mapper.RegionMapper;
import com.lorre.psgc.model.Region;
import com.lorre.psgc.repository.RegionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class IRegionRepository implements RegionRepository {

	private final JdbcTemplate jdbcTemplate;

	@Override
	public List<Region> findAll() {
		return jdbcTemplate.query("SELECT * FROM REGION", new RegionMapper());
	}

}
