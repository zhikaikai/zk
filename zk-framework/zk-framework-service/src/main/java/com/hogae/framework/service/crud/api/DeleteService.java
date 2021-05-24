package com.hogae.framework.service.crud.api;

import com.hogae.framework.service.crud.IService;

import java.util.Collection;

public interface DeleteService extends IService {

    default <K> int deleteById(K id){
        return getMapper().deleteById(id);
    }

    default <K> int deleteByIds(Collection<K> ids){
        return getMapper().deleteByIds(ids);
    }

}
