package com.SWE645.SWE645.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SWE645.SWE645.model.*;

import com.SWE645.SWE645.repository.SurveyRepository;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
public class SurveyController {
	
	@Autowired
	private SurveyRepository surveyRepo;
	
	@GetMapping("/health")
	public String checkHealth() {
		return "Working...";
	}
	
	@GetMapping("/get_all_surveys")
	public ResponseEntity<List<Survey>> getAllSurveys() {
		List<Survey> surveys = surveyRepo.findAll();
		return ResponseEntity.ok(surveys);
	}
	
	@GetMapping("/get_survey/{id}")
	public ResponseEntity<Optional<Survey>> getSurveyById(@PathVariable String id) {
		Optional<Survey> survey = surveyRepo.findById(id);
		return ResponseEntity.ok(survey);
	}
	
	@PostMapping("/create_survey")
	public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey) {
		Survey newsurvey = surveyRepo.save(survey);
		return ResponseEntity.ok(newsurvey);
	}
	
	@PostMapping("/update_survey/{id}")
	public ResponseEntity<Survey> updateSurvey(@PathVariable String id, @RequestBody Survey survey) {
		return surveyRepo.findById(id).map(s -> {
			s.setId((long) Integer.parseInt(id));
			Survey updatedsurvey = surveyRepo.save(s);
			return ResponseEntity.ok(updatedsurvey);
		}).orElseGet(() -> {
			survey.setId((long) Integer.parseInt(id));
			Survey updatedsurvey = surveyRepo.save(survey);
			return ResponseEntity.ok(updatedsurvey);
		});
	}
	
	@DeleteMapping("/delete_survey/{id}")
	public ResponseEntity<?> deleteSurvey(@PathVariable String id) {
		if (surveyRepo.existsById(id)) {
			surveyRepo.deleteById(id);
			return ResponseEntity.ok(true);
		}
		return ResponseEntity.notFound().build();
	}

}
