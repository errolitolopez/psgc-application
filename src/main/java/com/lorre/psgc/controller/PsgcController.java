package com.lorre.psgc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lorre.psgc.repository.MunicipalityRepository;
import com.lorre.psgc.repository.ProvinceRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class PsgcController {

	private final ProvinceRepository provinceRepository;
	private final MunicipalityRepository municipalityRepository;

	@GetMapping
	public String showAllBooks(Model model) {
		model.addAttribute("provinces", provinceRepository.findAll());
		return "philippine-statistic-geographic-code";
	}
}
