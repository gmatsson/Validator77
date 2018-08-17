package com.validator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//by Gustaf Matsson
//2018-08-17
@Controller
public class ValidatorController {


    @PostMapping("/isNumber")
    public ModelAndView isNumber(@RequestParam String str) {
        Validator vali = new Validator();
        String result = vali.isNumber(str);

        return new ModelAndView("index").addObject("result", result);
    }

}