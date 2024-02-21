package com.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.entities.SoftwareLanguage;

public interface SoftwareLanguageRepository
		extends JpaRepository<SoftwareLanguage, Integer> {

}
