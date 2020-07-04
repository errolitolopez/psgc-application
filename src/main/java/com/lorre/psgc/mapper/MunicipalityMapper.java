package com.lorre.psgc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lorre.psgc.model.Municipality;

public class MunicipalityMapper implements RowMapper<Municipality> {

	@Override
	public Municipality mapRow(ResultSet rs, int rowNum) throws SQLException {
		Municipality municipality = new Municipality();
		municipality.setId(rs.getInt("id"));
		municipality.setPsgcCode(rs.getString("psgc_code"));
		municipality.setName(rs.getString("name"));
		municipality.setRegionCode(rs.getString("region_code"));
		municipality.setMunicipalityCode(rs.getString("municipality_code"));
		return municipality;
	}
}
