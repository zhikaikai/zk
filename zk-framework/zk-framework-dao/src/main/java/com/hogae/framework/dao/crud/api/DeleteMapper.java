package com.hogae.framework.dao.crud.api;

import com.hogae.framework.dao.base.IMapper;

import java.util.Collection;

public interface DeleteMapper extends IMapper {

    <ID> int deleteById(ID id);

    <ID> int deleteByIds(Collection<ID> ids);

}
