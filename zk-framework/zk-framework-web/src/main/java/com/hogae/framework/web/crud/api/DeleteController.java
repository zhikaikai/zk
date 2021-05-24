package com.hogae.framework.web.crud.api;

import com.hogae.framework.web.crud.IController;
import com.hogae.framework.web.model.AppResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public interface DeleteController<K>  extends IController {

    @Operation(summary = "删除",description = "ID删除")
    @DeleteMapping("/delete/{id}")
    default AppResponse deleteById(@Parameter(name = "id",description = "主键值",example = "1") @PathVariable @NotNull K id) {
        getService().deleteById(id);
        return AppResponse.success();
    }

    @Operation(summary = "删除",description = "ID删除")
    @PostMapping(value = "/delete",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse deleteByIds(@RequestBody @Size(min = 1,message = "ID集合长度应大于0") ArrayList<@NotNull K> ids){
        getService().deleteByIds(ids);
        return AppResponse.success();
    }

}
