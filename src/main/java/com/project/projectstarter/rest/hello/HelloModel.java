package com.project.projectstarter.rest.hello;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloModel {
    private String name;
    private Date timestamp;
}
