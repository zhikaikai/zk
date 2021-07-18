package com.hogae.framework.dao.crud.api;

import com.hogae.framework.dao.IMapper;

import java.util.Collection;

public interface SelectMapper extends IMapper {

    <M,K> M selectModelById(K id);

    <M,K> Collection<M> selectModelsByIds(Collection<K> ids);

    <M> Collection<M> selectModels(M model);

    <M> Collection<M> selectPaging(M model);

    <M> long selectCount(M model);

}
