package com.software.business.service;

import java.util.List;

import com.software.dto.request.tech.AddLanguageTechRequest;
import com.software.dto.request.tech.DeleteLanguageTechRequest;
import com.software.dto.request.tech.UpdateLanguageTechRequest;
import com.software.dto.response.tech.GetAllLanguageTechResponse;
import com.software.dto.response.tech.GetByIdLanguageTechResponse;

public interface LanguageTechService {
	List<GetAllLanguageTechResponse> getAllLanguageTech();

	GetByIdLanguageTechResponse getByIdLanguageTech(int id);

	void updateLanguageTech(
			UpdateLanguageTechRequest updateLanguageTechRequest);

	void addLanguageTech(AddLanguageTechRequest addLanguageTechRequest);

	void deleteLanguageTech(
			DeleteLanguageTechRequest deleteLanguageTechRequest);

}
