package org.hodge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by QusayHe on 2017/5/12.
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String hello()
    {
        return "Hello World";
    }
}
