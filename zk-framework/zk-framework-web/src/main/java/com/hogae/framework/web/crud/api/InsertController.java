package com.hogae.framework.web.crud.api;

import com.hogae.framework.model.BaseModel;
import com.hogae.framework.model.ValidatorGroup;
import com.hogae.framework.web.crud.IController;
import com.hogae.framework.web.model.AppResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface InsertController<M extends BaseModel>   extends IController {

    @Operation(summary = "新增",description = "新增用户")
    @PutMapping(value = "/insert",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse insert(@RequestBody @Validated({ValidatorGroup.insert.class}) M model) {
        getService().insert(model);
        return AppResponse.success();
    }

}
