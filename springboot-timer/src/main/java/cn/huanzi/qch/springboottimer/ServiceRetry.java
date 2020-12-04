package cn.huanzi.qch.springboottimer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @Author wenbaoxie
 * @Date 2020/11/26
 */
@Service
@EnableRetry
@Slf4j
public class ServiceRetry {
    int i = 0;
    @Retryable(value = RuntimeException.class)
    //必须是void方法才生效
    public void retry(){
        System.out.println("i :" + i ++);
        throw new RuntimeException();
    }

    @Recover()
    public void recover(RuntimeException e ) {
        log.info("eeeeeeee:{}",e);
        System.out.println("eeeeeeeeeeeeeeeeeeeeee");
    }
}
