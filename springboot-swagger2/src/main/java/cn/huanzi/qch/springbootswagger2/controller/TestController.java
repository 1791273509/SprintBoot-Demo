package cn.huanzi.qch.springbootswagger2.controller;

import cn.huanzi.qch.springbootswagger2.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wenbaoxie
 * @Date 2020/10/29
 */

@RestController
@Api(tags="test模块")
public class TestController {
    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true)
    @GetMapping("get/{id}")
    public String getUserById(@PathVariable int id) {
        if(id == 0){
            return "查无此人";
        }else{
            return "{\"id\":\""+id+"\",\"userName\":\"张三\"}";
        }
    }

    @ApiOperation(value = "根据UserVo对象查询用户信息", notes = "查询数据库中符合条件的用户信息")
    @ApiImplicitParam(name = "userVo", value = "UserVo对象", paramType = "UserVo")
    @PostMapping("list")
    public String getUserByUser(UserVo userVo) {
        if(userVo.getId() == 0){
            return "查无此人";
        }else{
            return userVo.toString();
        }
    }
}
