package com.tobeto.DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tobeto.DataAccess.Abstract.LanguageRepository;
import com.tobeto.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> language;

	public InMemoryLanguageRepository() {

		language = new ArrayList<Language>();
		language.add(new Language(1, "JAVA"));
		language.add(new Language(2, "C#"));
		language.add(new Language(3, "Pyton"));

	}

	@Override
	public List<Language> getAll() {

		return language;
	}

	@Override
	public Language getById(int id) {
		for (Language language : language) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(Language language) {
		this.language.add(language);

	}

	@Override
	public void update(int id, String newName) {
		Language newLanguage = getById(id);
		newLanguage.setName(newName);

	}

	@Override
	public void delete(int id) {
		for (Language lang : language) {
			if (lang.getId() == id) {
				language.remove(lang);
			}
		}

	}

}
