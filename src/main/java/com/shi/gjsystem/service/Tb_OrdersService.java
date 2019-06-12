package com.shi.gjsystem.service;


import com.shi.gjsystem.pojo.TbOrders;
import com.shi.gjsystem.pojo.User;
import org.springframework.core.annotation.Order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


/**
 * @author SXJ
 */
@WebService(name = "Tb_OrdersServices", // 暴露服务名称
        targetNamespace = "http://service.gjsystem.shi.com"// 命名空间,一般是接口的包名倒序
)
public interface Tb_OrdersService {

        @WebMethod
        @WebResult(name = "String", targetNamespace = "")
    public TbOrders checkNo(@WebParam(name = "code") String code,@WebParam(name = "data") String data) throws Exception;

}
