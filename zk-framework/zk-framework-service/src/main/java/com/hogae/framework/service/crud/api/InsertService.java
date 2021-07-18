package com.hogae.framework.service.crud.api;


import com.hogae.framework.service.crud.IService;

public interface InsertService extends IService {

    default <DTO> DTO insert(DTO modelDTO){
        return getMapper().insert(modelDTO);
    }

}
