package com.hogae.framework.dao.crud.api;


import com.hogae.framework.dao.crud.IMapper;

import java.util.Collection;

public interface UpdateMapper extends IMapper {

    <M> int update(M model);

    <K> int enableById(K id);

    <K> int disableById(K id);

    <K> int enableByIds(Collection<K> ids);

    <K> int disableByIds(Collection<K> ids);
}
