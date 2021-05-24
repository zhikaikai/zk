package com.hogae.framework.dao.crud.api;

import com.hogae.framework.dao.crud.IMapper;

import java.util.Collection;

public interface SelectMapper extends IMapper {

    <M,K> M selectModel(K id);

    <M,K> Collection<M> selectModelsByIds(Collection<K> ids);

    <M,VO> Collection<M> selectModels(VO modelVO);

    <M,VO> Collection<M> selectPaging(VO modelVO);

    <M,VO> long selectCount(VO modelVO);

}
