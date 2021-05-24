package com.hogae.framework.web.model;

import com.hogae.framework.model.BaseModel;
import com.hogae.framework.model.Page;
import com.hogae.framework.model.ValidatorGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class BaseModelVO<M> extends BaseModel {

    @Schema(description = "模型")
    public M model;

    @Schema(description = "分页配置")
    @NotNull(message = "分页信息不能为空",groups = {ValidatorGroup.paging.class})
    public Page page;

    @Schema(description = "开始时间")
    public Date startDateTime;

    @Schema(description = "结束时间")
    public Date endtDateTime;

}
