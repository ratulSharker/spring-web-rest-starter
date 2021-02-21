package com.project.projectstarter.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginModel {
    // TODO: Introduce validation here
    private String phoneOrEmail;
    private String password;

}
