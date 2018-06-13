package pers.liceyo.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liceyo
 * @version 2018/6/13
 */
@RestController
@RequestMapping("/config")
public class TestConfigController {
    @Autowired
    private Environment evn;

    @RequestMapping("/{field}")
    public String evn(@PathVariable String field){
        return evn.getProperty(field);
    }

}
