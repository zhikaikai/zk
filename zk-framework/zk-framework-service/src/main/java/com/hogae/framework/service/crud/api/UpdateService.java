package com.hogae.framework.service.crud.api;

import com.hogae.framework.service.crud.IService;

import java.util.Collection;

public interface UpdateService extends IService {

    default <DTO> int update(DTO modelDTO){
        return getMapper().update(modelDTO);
    }

    default <K> int enableById(K id){
        return getMapper().enableById(id);
    }

    default <K> int disableById(K id){
        return getMapper().disableById(id);
    }

    default <K> int enableByIds(Collection<K> ids){
        return getMapper().enableByIds(ids);
    }

    default <K> int disableByIds(Collection<K> ids){
        return getMapper().disableByIds(ids);
    }
}
