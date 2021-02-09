package com.project.projectstarter.rest.hello.common.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response<T> {
    private MetaResponse meta;
    private T data;
}
