package com.lorre.psgc.repository;

import java.util.List;
import java.util.Optional;

import com.lorre.psgc.model.Municipality;

public interface MunicipalityRepository {

	List<Municipality> findAll();

	Optional<Municipality> findById(int id);

	List<Municipality> findAllByProvinceId(int id);
}
