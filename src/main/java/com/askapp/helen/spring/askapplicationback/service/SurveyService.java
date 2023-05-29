package com.askapp.helen.spring.askapplicationback.service;

import com.askapp.helen.spring.askapplicationback.model.Survey;

import java.util.List;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 26/05/2023
 */

public interface SurveyService {

    public Survey  saveNewSurvey(Survey survey);
    public void deleteSurvey(String surveyLink);
    public Survey getSurveyByLink(String surveyLink);

    public List<Survey> findAllByUser(String userEmail);

    void patchSurveyByLink(String surveyLink, Survey survey);

}
