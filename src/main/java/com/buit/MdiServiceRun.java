package com.buit;

import com.buit.config.EnableMessage;
import com.buit.utill.SpringContextUtil;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description
 * @Author yueyu
 * @Date 2021/1/19 14:35
 */
@SpringBootApplication
@EnableRabbit
@EnableMessage
public class MdiServiceRun {

    public static void main(String[] args){
        ConfigurableApplicationContext con= SpringApplication.run(MdiServiceRun.class, args);
        SpringContextUtil.setApplicationContext(con);
    }
}
