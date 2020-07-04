package com.lorre.psgc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Barangay {
	
	private int id;
	private String barangayCode;
	private String name;
	private String regionCode;
	private String provinceCode;
	private String municipalityCode;
}
