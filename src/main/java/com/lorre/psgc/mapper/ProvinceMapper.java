package com.lorre.psgc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lorre.psgc.model.Province;

public class ProvinceMapper implements RowMapper<Province> {

	@Override
	public Province mapRow(ResultSet rs, int rowNum) throws SQLException {
		Province province = new Province();
		province.setId(rs.getInt("id"));
		province.setPsgcCode(rs.getString("psgc_code"));
		province.setName(rs.getString("name"));
		province.setRegionCode(rs.getString("region_code"));
		province.setProvinceCode(rs.getString("province_code"));
		return province;
	}
}
