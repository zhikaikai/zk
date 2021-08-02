package com.hogae.admin.model;

import com.hogae.framework.model.BaseModel;
import com.hogae.framework.web.model.BaseModelVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户基本信息")
public class AdminUserVO extends BaseModelVO {

    @ApiModelProperty("用户ID")
    private Long id;

    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("用户年龄")
    private Integer age;

}
