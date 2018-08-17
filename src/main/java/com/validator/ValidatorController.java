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

    @PostMapping("/isPalindrome")
    public ModelAndView isPalindrome(@RequestParam String str2) {
        Validator vali = new Validator();
        String result2 = vali.isPalindrome(str2);

        return new ModelAndView("index").addObject("result2", result2);
    }
    @PostMapping("/isSquare")
    public ModelAndView isSquare(@RequestParam String str3) {
        Validator vali = new Validator();
        String[] parts = str3.split(",");
        String result3 = vali.isSquare(new Rectangle(Integer.parseInt(parts[0]),Integer.parseInt(parts[1])));


        return new ModelAndView("index").addObject("result3", result3);
    }

}
