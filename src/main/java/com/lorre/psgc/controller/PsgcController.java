package com.lorre.psgc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.lorre.psgc.model.Province;
import com.lorre.psgc.repository.MunicipalityRepository;
import com.lorre.psgc.repository.ProvinceRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class PsgcController {

	private final ProvinceRepository provinceRepository;

	@GetMapping
	public String showAllProvinces(Model model) {
		int provinceId = 0;
		int municipalityId = 0;
		model.addAttribute("provinceId", provinceId);
		model.addAttribute("municipalityId", municipalityId);
		model.addAttribute("provinces", provinceRepository.findAll());
		return "philippine-standard-geographic-code";
	}
}
