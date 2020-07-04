package com.lorre.psgc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lorre.psgc.model.Municipality;
import com.lorre.psgc.model.Province;
import com.lorre.psgc.repository.MunicipalityRepository;
import com.lorre.psgc.repository.ProvinceRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class ApiController {

	private final ProvinceRepository provinceRepository;
	private final MunicipalityRepository municipalityRepository;

	@GetMapping("/psgc/provinces")
	private List<Province> findAllProvinces() {
		return provinceRepository.findAll();
	};

	@GetMapping("/psgc/municipalities/province-id/{provinceId}")
	private List<Municipality> findAllMunicipalitiesByProvinceId(@PathVariable(name = "provinceId") int provinceId) {
		return municipalityRepository.findAllByProvinceId(provinceId);
	}
}
