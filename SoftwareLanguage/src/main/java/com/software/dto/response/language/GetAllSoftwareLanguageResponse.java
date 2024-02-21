package com.software.dto.response.language;

import java.util.List;

import com.software.dto.response.tech.GetNameLanguageTechResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllSoftwareLanguageResponse {

	private String name;
	private int languageTechId;
	private List<GetNameLanguageTechResponse> tech;

}
