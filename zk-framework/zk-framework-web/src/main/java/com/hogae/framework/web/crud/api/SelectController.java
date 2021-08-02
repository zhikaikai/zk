package com.hogae.framework.web.crud.api;

import com.hogae.framework.model.ValidatorGroup;
import com.hogae.framework.service.crud.CrudService;
import com.hogae.framework.web.base.IController;
import com.hogae.framework.web.model.AppResponse;
import com.hogae.framework.web.model.BaseModelVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

public interface SelectController<ID extends Serializable,VO extends BaseModelVO> extends IController<CrudService> {

    @Operation(summary = "单条查询",description = "id查询")
    @GetMapping(value = "/query/{id}")
    default AppResponse selectModelById(@Parameter(name = "id",description = "主键值",example = "1") @PathVariable @NotNull ID id) {
        return AppResponse.success(getService().selectModelById(id));
    }

    @Operation(summary = "多条查询",description = "id查询")
    @PostMapping(value = "/query",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse selectModelsByIds(@RequestBody @Size(min = 1,message = "ID集合长度应大于0") Collection<@NotNull ID> ids) {
        return AppResponse.success(getService().selectModelsByIds(ids));
    }

    @Operation(summary = "多条查询",description = "条件查询")
    @PostMapping(value = "/select",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse selectModels(@Validated({ValidatorGroup.select.class}) @RequestBody VO modelVO) {
        return AppResponse.success(getService().selectModels(modelVO));
    }

    @Operation(summary = "分页查询",description = "条件查询")
    @PostMapping(value = "/paging",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse selectPaging(@Validated({ValidatorGroup.paging.class}) @RequestBody VO modelVO) {
        return AppResponse.success(getService().selectPaging(modelVO.getModel(),modelVO.getPage()));
    }

    @Operation(summary = "总数查询",description = "条件查询")
    @PostMapping(value = "/count",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    default AppResponse selectCount(@Validated({ValidatorGroup.select.class}) @RequestBody VO modelVO) {
        return AppResponse.success(getService().selectCount(modelVO.getModel()));
    }

}
