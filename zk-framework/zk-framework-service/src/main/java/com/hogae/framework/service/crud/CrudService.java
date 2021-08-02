package com.hogae.framework.service.crud;

import com.hogae.framework.service.crud.api.DeleteService;
import com.hogae.framework.service.crud.api.InsertService;
import com.hogae.framework.service.crud.api.SelectService;
import com.hogae.framework.service.crud.api.UpdateService;

public interface CrudService extends SelectService, InsertService, UpdateService, DeleteService {

}
