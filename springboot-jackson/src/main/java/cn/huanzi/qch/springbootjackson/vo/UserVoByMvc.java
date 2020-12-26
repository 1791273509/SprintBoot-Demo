package cn.huanzi.qch.springbootjackson.vo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import javax.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVoByMvc implements Serializable {
    @NotNull
    @JsonDeserialize(converter = SecretTrim.class)
    @JsonSerialize(converter = SecretTrim.class)
    @JsonAlias(value = {"UserName","name"})
    @JsonProperty(value = "UserName")
    private String username;
    @NotNull(message = "password is not null")
    private String password;
    private Date createDate;
    private String captcha;

    public static void main(String[] args) throws IOException {
        String json = "{\"password\":\"21\",\"createDate\":null,\"captcha\":null,\"UserName\":\"21  \"}";
        ObjectMapper s = new ObjectMapper();
        UserVoByMvc userVoByMvc = s.readValue(json, UserVoByMvc.class);
        System.out.println(userVoByMvc);
        System.out.println(s.writeValueAsString(userVoByMvc));
    }
}