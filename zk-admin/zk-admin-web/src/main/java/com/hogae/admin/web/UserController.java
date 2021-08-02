package com.hogae.admin.web;

import com.hogae.admin.api.IUserService;
import com.hogae.admin.model.AdminUser;
import com.hogae.admin.model.AdminUserVO;
import com.hogae.framework.web.crud.CrudController;
import com.hogae.framework.web.model.BaseModelVO;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags="用户管理")
public class UserController implements CrudController<Integer, BaseModelVO<AdminUser>> {


    @DubboReference
    IUserService userService;

    @Override
    public IUserService getService() {
        return userService;
    }
}
