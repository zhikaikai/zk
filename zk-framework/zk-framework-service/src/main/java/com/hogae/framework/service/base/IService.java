package com.hogae.framework.service.base;


import com.hogae.framework.dao.base.IMapper;

public interface IService<MAPPER extends IMapper> {

     MAPPER getMapper();

}
