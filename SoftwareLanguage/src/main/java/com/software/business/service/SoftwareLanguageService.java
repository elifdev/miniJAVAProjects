package com.software.business.service;

import java.util.List;

import com.software.dto.request.language.AddSoftwareLanguageRequest;
import com.software.dto.request.language.DeleteSoftwareLanguageRequest;
import com.software.dto.request.language.UpdateSoftwareLanguageRequest;
import com.software.dto.response.language.GetAllSoftwareLanguageResponse;
import com.software.dto.response.language.GetByIdSoftwareLanguageResponse;

public interface SoftwareLanguageService {
	public List<GetAllSoftwareLanguageResponse> getAllSoftwareLanguage();

	public GetByIdSoftwareLanguageResponse getByIdSoftwareLanguage(int id);

	void updateSoftwareLanguage(
			UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest);

	void addSoftwareLanguage(
			AddSoftwareLanguageRequest addSoftwareLanguageRequest);

	void deleteSoftwareLanguage(
			DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest);

}
