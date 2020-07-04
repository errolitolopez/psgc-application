package com.lorre.psgc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lorre.psgc.model.Barangay;
import com.lorre.psgc.model.Municipality;
import com.lorre.psgc.model.Province;
import com.lorre.psgc.repository.BarangayRepository;
import com.lorre.psgc.repository.MunicipalityRepository;
import com.lorre.psgc.repository.ProvinceRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class ApiController {

	private final ProvinceRepository provinceRepository;
	private final MunicipalityRepository municipalityRepository;
	private final BarangayRepository barangayRepository;

	@Cacheable(value = "provinces", sync = true)
	@GetMapping("/psgc/provinces/region-code/{regionCode}")
	private List<Province> findAllProvincesByRegionCode(@PathVariable(name = "regionCode") String regionCode) {
		return provinceRepository.findAllByRegionCode(regionCode);
	}

	@Cacheable(value = "municipalities", sync = true)
	@GetMapping("/psgc/municipalities/province-code/{provinceCode}")
	private List<Municipality> findAllMunicipalitiesByProvinceCode(
			@PathVariable(name = "provinceCode") String provinceCode) {
		return municipalityRepository.findAllByProvinceCode(provinceCode);
	}
	
	@Cacheable(value = "barangays", sync = true)
	@GetMapping("/psgc/barangays/municipality-code/{municipalityCode}")
	private List<Barangay> findAllBarangaysByMunicipalityCode(
			@PathVariable(name = "municipalityCode") String municipalityCode) {
		return barangayRepository.findAllByMunicipalityCode(municipalityCode);
	}
}
