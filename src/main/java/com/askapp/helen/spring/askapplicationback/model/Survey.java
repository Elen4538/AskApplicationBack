package com.askapp.helen.spring.askapplicationback.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 25/05/2023
 */

@Data
@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long questionId;


    // relation ManyToOne lots of question by 1 user -> 1 email!!!
//    @Column(name = "email")
//    String email;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "survey_link")
    private String surveyLink;

    @Column(name = "image_link")
    private String imageLink;

    @Column(name = "active")
    private int active;

    @Column(name = "deleted")
    private int deleted;

    @Column(name = "yes")
    private int yes;

    @Column(name = "no")
    private int no;

    @Column(name = "report_counter")
    private int reportCounter;

    @Column(name = "user_email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "commentSurvey")// TODO check fetchType in Survey
    private List<Comment> commentList;

}
