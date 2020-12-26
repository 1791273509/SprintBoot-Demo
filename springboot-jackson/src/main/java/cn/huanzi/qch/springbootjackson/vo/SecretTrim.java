package cn.huanzi.qch.springbootjackson.vo;

import com.fasterxml.jackson.databind.util.StdConverter;

/**
 * @Author wenbaoxie
 * @Date 2020/12/24
 */
public class SecretTrim extends StdConverter<String,String> {


    @Override public String convert(String s) {
        System.out.println("ddddd");
        return s.trim();
    }
}
