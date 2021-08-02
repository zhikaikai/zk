package com.hogae.framework.service.crud.api;

import com.hogae.framework.dao.crud.CrudMapper;
import com.hogae.framework.service.base.IService;

import java.util.Collection;

public interface DeleteService extends IService<CrudMapper>  {

    default <ID> int deleteById(ID id){
        return getMapper().deleteById(id);
    }

    default <ID> int deleteByIds(Collection<ID> ids){
        return getMapper().deleteByIds(ids);
    }

}
