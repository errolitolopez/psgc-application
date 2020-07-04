package com.lorre.psgc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lorre.psgc.model.Barangay;

public class BarangayMapper implements RowMapper<Barangay> {

	@Override
	public Barangay mapRow(ResultSet rs, int rowNum) throws SQLException {
		Barangay barangay = new Barangay();
		barangay.setId(rs.getInt("id"));
		barangay.setBarangayCode(rs.getString("barangay_code"));
		barangay.setName(rs.getString("name"));
		barangay.setRegionCode(rs.getString("region_code"));
		barangay.setMunicipalityCode(rs.getString("municipality_code"));
		return barangay;
	}
}
