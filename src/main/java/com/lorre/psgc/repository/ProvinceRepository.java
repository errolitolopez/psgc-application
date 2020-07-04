package com.lorre.psgc.repository;

import java.util.List;

import com.lorre.psgc.model.Province;

public interface ProvinceRepository {

	List<Province> findAll();

	List<Province> findAllByRegionCode(String regionCode);
}
