package com.lorre.psgc.repository;

import java.util.List;
import java.util.Optional;

import com.lorre.psgc.model.Province;

public interface ProvinceRepository {

	List<Province> findAll();

	Optional<Province> findById(int id);
}
