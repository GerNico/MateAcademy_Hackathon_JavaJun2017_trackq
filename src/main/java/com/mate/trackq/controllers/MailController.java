package com.mate.trackq.controllers;

import com.mate.trackq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/confirm-registration", method = RequestMethod.GET)
    public ModelAndView confirmEmailGet(@RequestParam("u_id") String id) {
        ModelAndView mv = new ModelAndView();
        userService.confirmEmail(id);
        mv.setViewName("home");
        return mv;
    }
}