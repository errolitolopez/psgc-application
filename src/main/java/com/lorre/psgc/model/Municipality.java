package com.lorre.psgc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Municipality {

	private int id;
	private String name;
	private int provinceId;
	private int zipcode;
}
