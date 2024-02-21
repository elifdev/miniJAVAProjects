package com.software.business.manager;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.software.business.service.SoftwareLanguageService;
import com.software.dto.request.language.AddSoftwareLanguageRequest;
import com.software.dto.request.language.DeleteSoftwareLanguageRequest;
import com.software.dto.request.language.UpdateSoftwareLanguageRequest;
import com.software.dto.response.language.GetAllSoftwareLanguageResponse;
import com.software.dto.response.language.GetByIdSoftwareLanguageResponse;
import com.software.entities.SoftwareLanguage;
import com.software.repository.SoftwareLanguageRepository;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {

	@Autowired
	private SoftwareLanguageRepository languageRepository;

	@Autowired
	@Qualifier("requestMapper")
	private ModelMapper requestMapper;

	@Autowired
	@Qualifier("responseMapper")
	private ModelMapper responseMapper;

	@Override
	public List<GetAllSoftwareLanguageResponse> getAllSoftwareLanguage() {
//		List<SoftwareLanguage> softwareLanguge = languageRepository.findAll();
//		List<GetAllSoftwareLanguageResponse> softwareLangugeResponse = softwareLanguge
//				.stream().map(s -> responseMapper.map(s,
//						GetAllSoftwareLanguageResponse.class))
//				.toList();
		return languageRepository.findAll().stream().map(s -> responseMapper
				.map(s, GetAllSoftwareLanguageResponse.class)).toList();

	}

	@Override
	public GetByIdSoftwareLanguageResponse getByIdSoftwareLanguage(int id) {

		Optional<SoftwareLanguage> softwareLanguage = languageRepository
				.findById(id);

		return responseMapper.map(softwareLanguage,
				GetByIdSoftwareLanguageResponse.class);
	}

	@Override
	public void updateSoftwareLanguage(
			UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {
		SoftwareLanguage softwareLanguge = requestMapper
				.map(updateSoftwareLanguageRequest, SoftwareLanguage.class);
		languageRepository.save(softwareLanguge);

	}

	@Override
	public void addSoftwareLanguage(
			AddSoftwareLanguageRequest addSoftwareLanguageRequest) {
		SoftwareLanguage softwareLanguage = requestMapper
				.map(addSoftwareLanguageRequest, SoftwareLanguage.class);
		languageRepository.save(softwareLanguage);

	}

	@Override
	public void deleteSoftwareLanguage(
			DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {
		SoftwareLanguage softwareLanguage = requestMapper
				.map(deleteSoftwareLanguageRequest, SoftwareLanguage.class);
		languageRepository.delete(softwareLanguage);

	}

}
