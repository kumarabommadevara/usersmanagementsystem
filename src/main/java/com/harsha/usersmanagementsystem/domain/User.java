package com.harsha.usersmanagementsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String profileImageUrl;
    private String email;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joinedDate;
    private String roles;
    private String[] authorities;
    private boolean isActive;
    private boolean isAccountNonLocked;
}
