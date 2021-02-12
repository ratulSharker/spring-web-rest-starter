package com.project.projectstarter.rest.hello;

import java.util.Date;
import com.project.projectstarter.rest.hello.common.RestRoutes;
import com.project.projectstarter.rest.hello.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {

    @GetMapping(value = RestRoutes.HELLO)
    public Response<HelloModel> hello(@RequestParam(name = "name", required = false) String name) {
        HelloModel model = HelloModel.builder().name(name != null ? name : "No Name")
                .timestamp(new Date()).build();
        return Response.<HelloModel>builder().data(model).build();
    }
}
