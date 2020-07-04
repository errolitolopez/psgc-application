package com.lorre.psgc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lorre.psgc.model.Region;

public class RegionMapper implements RowMapper<Region> {

	@Override
	public Region mapRow(ResultSet rs, int rowNum) throws SQLException {
		Region region = new Region();
		region.setId(rs.getInt("id"));
		region.setPsgcCode(rs.getString("psgc_code"));
		region.setName(rs.getString("name"));
		region.setRegionCode(rs.getString("region_code"));
		return region;
	}
}
