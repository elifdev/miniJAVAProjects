package com.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.entities.LanguageTech;

public interface LanguageTechRepository
		extends JpaRepository<LanguageTech, Integer> {
}
