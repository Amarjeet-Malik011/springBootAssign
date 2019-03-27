package com.ttn.springBootAssign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    //Ques.6
    Logger logger= LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/logging")
    public String index(){
        logger.trace("A TRACE message");
        logger.debug("B DEBUG message");
        logger.info("A INFO message");
        logger.warn("A WARN message");
        logger.error("A ERROR message");
        return "Logs.. printed";
    }
}
