package com.askapp.helen.spring.askapplicationback.repository;

import com.askapp.helen.spring.askapplicationback.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 26/05/2023
 */
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    Survey getSurveyByLink(String surveyLink);
    List<Survey> findAllByUser(String userEmail);
    void deleteSurvey(String surveyLink);

    void patchSurveyByLink(String surveyLink, Survey survey);
}
