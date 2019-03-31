package com.hello.tms.web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alp.zxy
 * @date 2019/3/30
 */
@RestController
@RequestMapping("/app")
public class ApplicationController {

    @RequestMapping("/index")
    public String index(){
        return "This is test page!";
    }
}
