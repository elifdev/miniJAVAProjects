package com.tobeto.DataAccess.Abstract;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tobeto.entities.Language;

@Repository
public interface LanguageRepository {

	List<Language> getAll();

	Language getById(int id);

	void add(Language language);

	void update(int id, String newName);

	void delete(int id);

}
