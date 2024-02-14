package com.tobeto.entities;

import lombok.Data;

@Data
public class Language {

	private int id;
	private String name;

	public Language(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
