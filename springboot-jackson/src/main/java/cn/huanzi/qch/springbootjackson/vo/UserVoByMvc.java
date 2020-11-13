package cn.huanzi.qch.springbootjackson.vo;

import javax.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVoByMvc implements Serializable {
    @NotNull
    private String username;
    @NotNull(message = "password is not null")
    private String password;
    private Date createDate;
    private String captcha;
}