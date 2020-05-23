package com.javaczh.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @ClassName WebSocketConfig
 * @Description
 * @Author CaiZiHao
 * @Date 2020/5/21 20:46
 * @Version 1.0
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {


    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //以topic开头会直接返回给前台
        registry.enableSimpleBroker("/topic");
        //以app开头会转发到自己定义的方法上处理逻辑,处理完会返回前台
        registry.setApplicationDestinationPrefixes("/app");
    }


    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //websocket 链接的后缀 例如: ws:ip/cai
        registry.addEndpoint("/cai").withSockJS();;
    }
}
