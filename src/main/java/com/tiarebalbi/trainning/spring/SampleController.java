package com.tiarebalbi.trainning.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller Sample
 *
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@Controller
public class SampleController {

    @RequestMapping("/")
    public String sample() {
        return "Running....";
    }
}
