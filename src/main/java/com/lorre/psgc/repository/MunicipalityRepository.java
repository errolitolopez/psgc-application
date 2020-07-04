package com.lorre.psgc.repository;

import java.util.List;

import com.lorre.psgc.model.Municipality;

public interface MunicipalityRepository {

	List<Municipality> findAll();

	List<Municipality> findAllByProvinceCode(String provinceCode);
}
