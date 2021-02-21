package com.project.projectstarter.web.login;

import com.project.projectstarter.common.dto.LoginModel;
import com.project.projectstarter.web.common.WebRoutes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebLoginController {

    private final Logger logger = LoggerFactory.getLogger(WebLoginController.class);

    @GetMapping(value = WebRoutes.LOGIN)
    public String getLogin(Model model) {
        model.addAttribute("loginModel", LoginModel.builder().build());
        return "login/login";
    }

    @PostMapping(value = WebRoutes.LOGIN)
    public String postLogin(@ModelAttribute LoginModel loginModel) { // TODO: Add validation

        logger.info("Username : " + loginModel.getPhoneOrEmail());
        logger.info("Password : " + loginModel.getPassword());

        return "login/login";
    }
}
