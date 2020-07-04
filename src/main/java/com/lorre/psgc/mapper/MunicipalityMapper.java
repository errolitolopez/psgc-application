package com.lorre.psgc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lorre.psgc.model.Municipality;

public class MunicipalityMapper implements RowMapper<Municipality> {

	@Override
	public Municipality mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Municipality(rs.getInt("id"), rs.getString("name"), rs.getInt("province_id"), rs.getInt("zipcode"));
	}
}
