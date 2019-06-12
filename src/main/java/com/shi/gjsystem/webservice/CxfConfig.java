package com.shi.gjsystem.webservice;

import javax.xml.ws.Endpoint;

import com.shi.gjsystem.service.Tb_OrdersService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * cxf配置
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月19日 下午9:38:24
 */
@Configuration
public class CxfConfig {
    
    @Autowired
    private Bus bus;
    
    @Autowired
    private Tb_OrdersService tb_ordersService;
    
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, tb_ordersService);
        endpoint.publish("/Tb_OrdersServices");
        return endpoint;
    }
}
