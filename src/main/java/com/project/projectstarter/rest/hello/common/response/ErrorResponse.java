package com.project.projectstarter.rest.hello.common.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private AppErrorCode errorCode;
    private String message;
}
