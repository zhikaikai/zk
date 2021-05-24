package com.hogae.framework.dao.crud.api;


import com.hogae.framework.dao.crud.IMapper;

public interface InsertMapper extends IMapper {

    <M> int insert(M model);

}
