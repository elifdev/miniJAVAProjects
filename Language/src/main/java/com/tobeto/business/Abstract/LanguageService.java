package com.tobeto.business.Abstract;

import java.util.List;

import com.tobeto.entities.Language;

public interface LanguageService {

	List<Language> getAll();

	Language getById(int id);

	void add(Language language);

	void update(int id, String newName);

	void delete(int id);

}
