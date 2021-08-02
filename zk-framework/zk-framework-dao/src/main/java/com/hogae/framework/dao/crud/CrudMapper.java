package com.hogae.framework.dao.crud;

import com.hogae.framework.dao.base.IMapper;
import com.hogae.framework.dao.crud.api.DeleteMapper;
import com.hogae.framework.dao.crud.api.InsertMapper;
import com.hogae.framework.dao.crud.api.SelectMapper;
import com.hogae.framework.dao.crud.api.UpdateMapper;

public interface CrudMapper extends SelectMapper, InsertMapper, UpdateMapper, DeleteMapper, IMapper {

}
