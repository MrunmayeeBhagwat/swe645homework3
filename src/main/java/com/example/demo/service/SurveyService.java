package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Survey;
import com.example.demo.repository.SurveyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {
	
	

    private final SurveyRepository surveyRepository;

    @Autowired
    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Optional<Survey> getSurveyById(Long id) {
        return surveyRepository.findById(id);
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public Survey updateSurvey(Long id, Survey updatedSurvey) {
    	updatedSurvey.setId(id);
        return surveyRepository.save(updatedSurvey);
    }

    public void deleteSurvey(Long id) {
        surveyRepository.deleteById(id);
    }
}

