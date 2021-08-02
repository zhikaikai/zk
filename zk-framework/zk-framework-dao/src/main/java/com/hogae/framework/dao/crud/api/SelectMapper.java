package com.hogae.framework.dao.crud.api;

import com.hogae.framework.dao.base.IMapper;

import java.util.Collection;

public interface SelectMapper extends IMapper {

    <MODEL,ID> MODEL selectModelById(ID id);

    <MODEL,ID> Collection<MODEL> selectModelsByIds(Collection<ID> ids);

    <MODEL> Collection<MODEL> selectModels(MODEL model);

    <MODEL> Collection<MODEL> selectPaging(MODEL model,int pageNum,int pageSize);

    <MODEL> long selectCount(MODEL model);

}
