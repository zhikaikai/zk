package com.hogae.framework.web.base;


import com.hogae.framework.service.base.IService;

public interface IController<SERVICE extends IService> {

     SERVICE getService();

}
