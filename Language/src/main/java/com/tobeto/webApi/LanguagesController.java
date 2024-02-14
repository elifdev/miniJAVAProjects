package com.tobeto.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.Abstract.LanguageService;
import com.tobeto.entities.Language;

@RestController
@RequestMapping("/api/language")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@GetMapping("/getbyid")
	public Language getById(int id) {
		return languageService.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody Language language) {
		languageService.add(language);
	}

	@PostMapping("/update")
	public void update(@RequestBody int id, String newName) {
		languageService.update(id, newName);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody int id) {
		languageService.delete(id);
	}

}
