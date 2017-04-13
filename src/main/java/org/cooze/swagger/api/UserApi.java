package org.cooze.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.cooze.swagger.common.ResponseData;
import org.cooze.swagger.dto.UserDTO;
import org.cooze.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "用户", description = "spring-boot Swagger2 测试API")
@RestController
public class UserApi {
    private static final String PRODUCES_JSON_UTF8="application/json;charset=utf-8";
    private static final String CONSUMES_JSON_UTF8="application/json;charset=utf-8";
    //访问swaggerUI路径：http://localhost:8081/swagger-ui.html

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户", notes = "根据用户id和名称查询用户")
    @ApiImplicitParams( value = {
            @ApiImplicitParam(paramType = "path",name = "id", dataType = "int",value = "用户id",required = true),
            @ApiImplicitParam(paramType = "query",name = "name", dataType = "string",value = "用户名称")
    })
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET,produces = PRODUCES_JSON_UTF8)
    public ResponseData<UserDTO> getUserByName(@RequestParam(value = "name",required = false) String name,
                                               @PathVariable("id") Integer id ){
        ResponseData<UserDTO> responseData = new ResponseData<>();
        responseData.setResult(this.userService.getUserByNameAndId(name,id));
        return responseData;
    }

    @ApiOperation(value = "创建用户", notes = "创建一个新用户")
    @ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "UserDTO")
    @RequestMapping(value = "/user",method = RequestMethod.POST,consumes = CONSUMES_JSON_UTF8,produces = PRODUCES_JSON_UTF8)
    public ResponseData<UserDTO> createUser(@RequestBody UserDTO user){
        ResponseData<UserDTO> responseData = new ResponseData<>();

        responseData.setResult(user);
        return responseData;
    }

    @ApiOperation(value = "批量创建用户", notes = "创建多个新用户")
    @RequestMapping(value = "/users",method = RequestMethod.POST,consumes = CONSUMES_JSON_UTF8,produces = PRODUCES_JSON_UTF8)
    public ResponseData<List<UserDTO>> createUsers(@RequestBody List<UserDTO> users){
        ResponseData<List<UserDTO>> responseData = new ResponseData<>();
        //注意List包别引错应该是import java.util.List;而不是import com.sun.tools.javac.util.List;
        responseData.setResult(users);
        return responseData;
    }

}
