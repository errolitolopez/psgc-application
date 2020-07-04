package com.lorre.psgc.repository;

import java.util.List;

import com.lorre.psgc.model.Region;

public interface RegionRepository {

	List<Region> findAll();
}
