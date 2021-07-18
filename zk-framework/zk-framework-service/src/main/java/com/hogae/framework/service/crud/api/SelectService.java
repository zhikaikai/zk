package com.hogae.framework.service.crud.api;

import com.hogae.framework.service.crud.IService;

import java.util.Collection;

public interface SelectService extends IService {

    default <DTO,K> DTO selectModelById(K id){
        return getMapper().selectModelById(id);
    }

    default <DTO,K> Collection<DTO> selectModelsByIds(Collection<K> ids){
        return getMapper().selectModelsByIds(ids);
    }

    default <DTO> Collection<DTO> selectModels(DTO modelDTO){
        return getMapper().selectModels(modelDTO);
    }

    default <DTO> Collection<DTO> selectPaging(DTO modelDTO){
        return getMapper().selectPaging(modelDTO);
    }

    default <DTO> long selectCount(DTO modelDTO){
        return getMapper().selectCount(modelDTO);
    }

}
