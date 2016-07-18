package com.cennac.ccfoundation.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Cennac on 2016/7/18.
 */

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "hello";
    }
    @RequestMapping("${web.view.index}")
    public String a(){
        return "index";
    }


}
