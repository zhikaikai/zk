package com.hogae.framework.dao.crud.api;


import com.hogae.framework.dao.IMapper;

public interface InsertMapper extends IMapper {

    <M> M insert(M model);

}
