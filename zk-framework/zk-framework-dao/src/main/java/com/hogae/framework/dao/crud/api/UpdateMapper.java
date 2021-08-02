package com.hogae.framework.dao.crud.api;


import com.hogae.framework.dao.base.IMapper;

import java.util.Collection;

public interface UpdateMapper extends IMapper {

    <MODEL> int update(MODEL model);

    <ID> int enableById(ID id);

    <ID> int disableById(ID id);

    <ID> int enableByIds(Collection<ID> ids);

    <ID> int disableByIds(Collection<ID> ids);
}
