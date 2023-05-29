package com.askapp.helen.spring.askapplicationback.service;

import com.askapp.helen.spring.askapplicationback.model.Survey;
import com.askapp.helen.spring.askapplicationback.repository.SurveyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 29/05/2023
 */

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public Survey saveNewSurvey(Survey survey) {
        Survey newSurvey = surveyRepository.save(survey);
        return newSurvey;
    }

    @Override
    public void deleteSurvey(String surveyLink) {
        surveyRepository.deleteSurvey(surveyLink);
        System.out.println("Survey " + surveyLink + " deleted");

    }

    @Override
    public Survey getSurveyByLink(String surveyLink) {
        return surveyRepository.getSurveyByLink(surveyLink);
    }

    @Override
    public List<Survey> findAllByUser(String userEmail) {
        List<Survey> surveys = surveyRepository.findAllByUser(userEmail);
        return surveys;
    }

    @Override
    public void patchSurveyByLink(String surveyLink, Survey survey) {
        Survey existing = surveyRepository.getSurveyByLink(surveyLink);

        Integer yesCounter = existing.getYes();
        Integer noCounter = existing.getNo();
        Integer reportCounter = existing.getReportCounter();

        if (survey.getYes() != null) {
            existing.setYes(yesCounter + 1);
        }
        if (survey.getNo() != null) {
            existing.setNo(noCounter + 1);
        }
        if (survey.getReportCounter() != null) {
            existing.setReportCounter(reportCounter + 1);
        }
        if (survey.getActive() != null) {
            existing.setActive(survey.getActive());
        }
        if (survey.getDeleted() != null) {
            existing.setDeleted(survey.getDeleted());
        }


    }


}
