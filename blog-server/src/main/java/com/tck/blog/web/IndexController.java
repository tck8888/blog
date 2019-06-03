package com.tck.blog.web;

import com.tck.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 *
 * @author:tck
 * @date:2019/6/2
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
