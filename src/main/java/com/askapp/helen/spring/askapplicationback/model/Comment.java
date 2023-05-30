package com.askapp.helen.spring.askapplicationback.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 25/05/2023
 */
@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "comment_text")
    private String commentText;

    @Column(name = "date")
    private LocalDateTime date;

    //FK to Survey Table because we can have a comment or not at all
    //@Column(name = "questionID")
    @ManyToOne
    @JoinColumn(name = "question_id") // TODO check fetchType in Comment entity
    private Survey survey;

}
