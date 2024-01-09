package com.bezkoder.spring.jpa.h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.jpa.h2.model.Tutorial;

/**
 * Interface representing a Spring Data JPA repository for managing Tutorial entities.
 * Extends JpaRepository, providing CRUD operations for the Tutorial entity.
 */
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    /**
     * Retrieve tutorials based on their published status.
     *
     * @param published Published status to filter tutorials.
     * @return List of tutorials with the specified published status.
     */
    List<Tutorial> findByPublished(boolean published);

    /**
     * Retrieve tutorials based on a case-insensitive partial match of their title.
     *
     * @param title Title (partially matching) to filter tutorials.
     * @return List of tutorials with titles containing the specified substring.
     */
    List<Tutorial> findByTitleContainingIgnoreCase(String title);
}
