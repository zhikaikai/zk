package com.hogae.framework.service.crud.api;

import com.hogae.framework.dao.crud.CrudMapper;
import com.hogae.framework.model.Page;
import com.hogae.framework.service.base.IService;

import java.util.Collection;

public interface SelectService extends IService<CrudMapper>  {

    default <DTO,ID> DTO selectModelById(ID id){
        return getMapper().selectModelById(id);
    }

    default <DTO,ID> Collection<DTO> selectModelsByIds(Collection<ID> ids){
        return getMapper().selectModelsByIds(ids);
    }

    default <DTO> Collection<DTO> selectModels(DTO modelDTO){
        return getMapper().selectModels(modelDTO);
    }

    default <DTO> Collection<DTO> selectPaging(DTO modelDTO, Page page){
        return getMapper().selectPaging(modelDTO,page.getPageNum(),page.getPageSize());
    }

    default <DTO> long selectCount(DTO modelDTO){
        return getMapper().selectCount(modelDTO);
    }

}
