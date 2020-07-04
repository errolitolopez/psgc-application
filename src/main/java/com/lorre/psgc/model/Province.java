package com.lorre.psgc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Province {
	
	private int id;
	private String psgcCode;
	private String name;
	private String regionCode;
	private String provinceCode;
}
