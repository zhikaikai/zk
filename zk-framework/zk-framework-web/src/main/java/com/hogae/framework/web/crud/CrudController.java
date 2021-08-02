package com.hogae.framework.web.crud;


import com.hogae.framework.web.crud.api.DeleteController;
import com.hogae.framework.web.crud.api.InsertController;
import com.hogae.framework.web.crud.api.SelectController;
import com.hogae.framework.web.crud.api.UpdateController;
import com.hogae.framework.web.model.BaseModelVO;

import java.io.Serializable;

public interface CrudController<ID extends Serializable,VO extends BaseModelVO> extends SelectController<ID,VO>, InsertController<VO>, UpdateController<ID,VO>, DeleteController<ID> {

}

