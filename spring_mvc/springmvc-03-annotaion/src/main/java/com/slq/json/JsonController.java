package com.slq.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.slq.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-08-22:09
 */

@RestController
public class JsonController {

    @RequestMapping("/j1")
    public String j1(){
        Date date = new Date();
        String json = JsonUtils.ToJson(date);
        return json;
    }


}
