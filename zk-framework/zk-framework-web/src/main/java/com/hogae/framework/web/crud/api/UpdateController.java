package com.hogae.framework.web.crud.api;

import com.hogae.framework.model.BaseModel;
import com.hogae.framework.model.ValidatorGroup;
import com.hogae.framework.web.crud.IController;
import com.hogae.framework.web.model.AppResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

public interface UpdateController<K extends Serializable,M extends BaseModel> extends IController {

    @Operation(summary = "更新",description = "更新")
    @PutMapping(value = "/update",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse update(@Validated({ValidatorGroup.update.class}) @RequestBody M model) {
        getService().update(model);
        return AppResponse.success();
    }

    @Operation(summary = "启用",description = "启用数据")
    @GetMapping(value = "/enable/{id}")
    default AppResponse enableById(@Parameter(name = "id",description = "主键值",example = "1") @PathVariable @NotNull K id) {
        getService().enableById(id);
        return AppResponse.success();
    }

    @Operation(summary = "禁用",description = "禁用数据")
    @GetMapping(value = "/disable/{id}")
    default AppResponse disableById(@Parameter(name = "id",description = "主键值",example = "1") @PathVariable @NotNull K id) {
        getService().disableById(id);
        return AppResponse.success();
    }

    @Operation(summary = "启用",description = "启用数据")
    @PutMapping(value = "/enable",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse enableByIds(@RequestBody @Size(min = 1,message = "ID集合长度应大于0") Collection<@NotNull K> ids) {
        getService().enableByIds(ids);
        return AppResponse.success();
    }

    @Operation(summary = "禁用",description = "禁用数据")
    @PutMapping(value = "/disable",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse disableByIds(@RequestBody @Size(min = 1,message = "ID集合长度应大于0") Collection<@NotNull K> ids) {
        getService().disableByIds(ids);
        return AppResponse.success();
    }

}
