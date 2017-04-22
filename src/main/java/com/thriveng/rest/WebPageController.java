package com.thriveng.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Allen on 4/22/2017.
 */
@Controller
@RequestMapping("thriveng-service")
public class WebPageController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}
