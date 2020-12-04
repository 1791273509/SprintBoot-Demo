package cn.huanzi.qch.springboottimer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenbaoxie
 */
@EnableScheduling //启用定时器
@SpringBootApplication
public class SpringbootTimerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTimerApplication.class, args);
    }

}
