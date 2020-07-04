package com.lorre.psgc.repository;

import java.util.List;

import com.lorre.psgc.model.Barangay;

public interface BarangayRepository {

	List<Barangay> findAllByMunicipalityCode(String municipalityCode);
}
