package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.DataAccess.Abstract.LanguageRepository;
import com.tobeto.business.Abstract.LanguageService;
import com.tobeto.entities.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public void add(Language language) {
		if (language.getName().equalsIgnoreCase(null) || language.getName().isEmpty()) {
			throw new RuntimeException("Data have to have a name");
		}
		for (Language language1 : languageRepository.getAll()) {
			if (language.getName().equalsIgnoreCase(language1.getName())) {
				throw new RuntimeException("Data is already exist");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public void update(int id, String newName) {
		languageRepository.update(id, newName);

	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);

	}

}
