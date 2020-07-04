package com.lorre.psgc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lorre.psgc.repository.RegionRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class PsgcController {

	private final RegionRepository regionRepository;

	@GetMapping
	public String showAllProvinces(Model model) {
		int regionCode = 0;
		int provinceCode = 0;
		int municipalityCode = 0;
		model.addAttribute("regionCode", regionCode);
		model.addAttribute("provinceCode", provinceCode);
		model.addAttribute("municipalityCode", municipalityCode);
		model.addAttribute("regions", regionRepository.findAll());
		return "philippine-standard-geographic-code";
	}
}
