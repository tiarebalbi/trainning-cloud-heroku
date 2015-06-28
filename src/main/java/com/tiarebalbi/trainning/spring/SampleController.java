package com.tiarebalbi.trainning.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Sample
 *
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    public String sample() {
        return "Running....";
    }
}
