package com.lorre.psgc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lorre.psgc.model.Province;

public class ProvinceMapper implements RowMapper<Province> {

	@Override
	public Province mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Province(rs.getInt("id"), rs.getString("name"));
	}
}
