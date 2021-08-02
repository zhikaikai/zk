package com.hogae.framework.service.crud.api;

import com.hogae.framework.dao.crud.CrudMapper;
import com.hogae.framework.service.base.IService;

import java.util.Collection;

public interface UpdateService extends IService<CrudMapper> {

    default <DTO> int update(DTO modelDTO){
        return getMapper().update(modelDTO);
    }

    default <ID> int enableById(ID id){
        return getMapper().enableById(id);
    }

    default <ID> int disableById(ID id){
        return getMapper().disableById(id);
    }

    default <ID> int enableByIds(Collection<ID> ids){
        return getMapper().enableByIds(ids);
    }

    default <ID> int disableByIds(Collection<ID> ids){
        return getMapper().disableByIds(ids);
    }
}
