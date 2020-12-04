package cn.huanzi.qch.springboottimer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wenbaoxie
 * @Date 2020/11/26
 */
@RestController
public class Controller {
    @Autowired
    private ServiceRetry serviceRetry;
    @RequestMapping("/retry")
    @ResponseBody
    public String get() {
         serviceRetry.retry();
         return "";
    }
}
