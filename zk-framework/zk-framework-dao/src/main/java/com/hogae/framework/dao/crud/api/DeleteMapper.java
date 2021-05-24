package com.hogae.framework.dao.crud.api;

import com.hogae.framework.dao.crud.IMapper;

import java.util.Collection;

public interface DeleteMapper extends IMapper {

    <K> int deleteById(K id);

    <K> int deleteByIds(Collection<K> ids);

}
