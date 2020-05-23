package com.javaczh.admin.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName indexController
 * @Description
 * @Author CaiZiHao
 * @Date 2020/5/21 20:38
 * @Version 1.0
 */
@Controller
public class IndexController {

    
   @Autowired
    private SimpMessagingTemplate messagingTemplate;
    
   /* @RequestMapping("/update")
    @ResponseBody
    public Map<String, String> update(@RequestParam("value") String value) {
        Map<String, String> map = new HashMap<>();
        map.put("v", value);
        return map;
    }
*/

    @MessageMapping("/hello")
    @SendTo("/topic/echarts") //发送给/topic/echarts
    public String hello(Message message) {
        byte[] bytes = (byte[]) message.getPayload();
        String str = new String(bytes);
        System.out.println(str);

        return str;
    }

    @PostMapping("/update")
    @ResponseBody
    public String update(@RequestBody Map<String, Object> param) throws JsonProcessingException {
        System.out.println(param);
        byte[] bytes = "{\"name\":\"200\"}".getBytes();
        messagingTemplate.convertAndSend("/topic/echarts",new ObjectMapper().writeValueAsString(param));
        return "{\"name\":\"200\"}";
    }
}
