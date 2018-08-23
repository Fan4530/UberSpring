package com.fanzhang;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    @RequestMapping("/")
    public String welcome() {
        return "Hi, your first pring application here";
    }
    @RequestMapping(value = "/msg/{key}", method = RequestMethod.GET)
    public Message showMessage(String key) {
        Message msg = new Message(key, "you are so aswsome");
        return msg;
    }
}
