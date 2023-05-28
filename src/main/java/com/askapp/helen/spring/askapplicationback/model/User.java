package com.askapp.helen.spring.askapplicationback.model;

import jakarta.persistence.*;
import lombok.Data;


/**
 * @author elena
 * @project AskApplicationBack
 * @date 25/05/2023
 */
@Data
@Entity
@Table(name = "users")
public class User {
// stand alone table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "reset_password")
    private String resetPasswordCode;


}
