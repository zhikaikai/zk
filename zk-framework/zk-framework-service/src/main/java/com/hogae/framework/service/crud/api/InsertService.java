package com.hogae.framework.service.crud.api;


import com.hogae.framework.dao.crud.CrudMapper;
import com.hogae.framework.service.base.IService;

public interface InsertService extends IService<CrudMapper>  {

    default <DTO> int insert(DTO modelDTO){
        return getMapper().insert(modelDTO);
    }

}
