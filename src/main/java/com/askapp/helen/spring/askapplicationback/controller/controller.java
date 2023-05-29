package com.askapp.helen.spring.askapplicationback.controller;

import com.askapp.helen.spring.askapplicationback.model.Survey;
import com.askapp.helen.spring.askapplicationback.service.SurveyService;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 25/05/2023
 */

@AllArgsConstructor
@RestController
@RequestMapping("/api/mysurvey")
public class controller {

    //@PersistenceContext
    //@Autowired
    private SurveyService surveyService;

    @RequestMapping(value = "{userEmail}", method = RequestMethod.GET)
    public List<Survey> showAllSurveyByUserEmail(@PathVariable("userEmail") String userEmail) {
        List<Survey> allSurveys = surveyService.findAllByUser(userEmail);
        return allSurveys;
    }

    @DeleteMapping("{surveyLink}")
    public ResponseEntity deleteSurveyBySurveyLink(@PathVariable("surveyLink") String surveyLink) {
        surveyService.deleteSurvey(surveyLink);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity createSurvey(@RequestBody Survey survey) {

        Survey savedSurvey = surveyService.saveNewSurvey(survey);

        HttpHeaders headers = new HttpHeaders();

        // change headers
        headers.add("Location", "/api/mysurvey/" + savedSurvey.getSurveyLink().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

    //patch methods


}
