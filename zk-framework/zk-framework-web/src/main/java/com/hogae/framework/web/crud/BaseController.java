package com.hogae.framework.web.crud;


import com.hogae.framework.model.BaseModel;
import com.hogae.framework.web.crud.api.DeleteController;
import com.hogae.framework.web.crud.api.InsertController;
import com.hogae.framework.web.crud.api.SelectController;
import com.hogae.framework.web.crud.api.UpdateController;
import com.hogae.framework.web.model.BaseModelVO;

import java.io.Serializable;

public abstract class BaseController<K extends Serializable,M extends BaseModel,VO extends BaseModelVO<M>> implements SelectController, InsertController, UpdateController, DeleteController {

}

