package com.hogae.framework.dao.crud.api;


import com.hogae.framework.dao.base.IMapper;

public interface InsertMapper extends IMapper {

    <MODEL> int insert(MODEL model);

}
