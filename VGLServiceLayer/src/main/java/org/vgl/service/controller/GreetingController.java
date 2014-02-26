package org.vgl.service.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.vgl.service.data.trans.Greeting;

@Controller
public class GreetingController {

	Logger log = Logger.getLogger(getClass());
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    public GreetingController() {
    	log.info("create greeting controller");
    }

    @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
