package com.SWE645.SWE645.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SWE645.SWE645.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, String> {

}
