package com.shi.gjsystem.service.impl;

import com.shi.gjsystem.mapper.*;
import com.shi.gjsystem.pojo.*;
import com.shi.gjsystem.service.Tb_OrdersService;
import com.shi.gjsystem.utils.GsonUtil;

import com.shi.gjsystem.utils.UUIDUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-05-31 10:54
 */
@WebService(serviceName = "Tb_OrdersServices", // 与接口中指定的name一致
        targetNamespace = "http://service.gjsystem.shi.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.shi.gjsystem.service.Tb_OrdersService"// 接口地址
)
@Service
@Component
public class Tb_OrdersServiceImpl implements Tb_OrdersService {

    @Resource
    private TbQingMapper tbQingMapper;

    @Resource
    private TbOrdersdetailsMapper tbOrdersdetailsMapper;

    @Resource
    private TbParamMapper tbParamMapper;

    @Resource
    private TbGoodsMapper tbGoodsMapper;

    @Resource
    private TbOrdersMapper tbOrdersMapper;

    @Override
    public TbOrders checkNo(String code, String data) throws Exception {
        TbOrders tbOrders = new TbOrders();
        if (code.equals("1003")){
            //清单
            TbQing tbQing = GsonUtil.gsonToBean(data,TbQing.class);
            //得到清单中的订单编号
            String ordersNo=tbQing.getOrdersNo();
            TbOrders orders =  tbOrdersMapper.findByOrderNo(ordersNo);
            System.out.println(orders);
            //根据订单号查询订单明细
            List<TbOrdersdetails> ordersDetailsList= tbOrdersdetailsMapper.findByOrderdetails(ordersNo);
            System.out.println(ordersDetailsList);
            //查询所有的校验规则
            String paramtype="负面清单";
            List<TbParam> paramList = tbParamMapper.findByType(paramtype);
            System.out.println(paramList);
            boolean falg=false;
            for (TbOrdersdetails tbOrdersdetails : ordersDetailsList) {
                for (TbParam tbParam : paramList) {
                    //商品名字和负面清单维护的值作比较
                    if (tbOrdersdetails.getGoodsName().contains(tbParam.getParamValue())) {
                        //被负面清单规则命中
                        falg=true;
                        break;
                    }
                }
                if (falg) {
                    //被负面清单规则命中
                    break;
                }
            }
            if(falg){
                //被负面清单规则命中
                tbQing.setStauts("2");
            }
            else
                {
                //没有命中走自动审单
                //查询自动审单基数
                List<TbParam> tbParamList=tbParamMapper.findByType("自动放行");
                int jishu=Integer.parseInt(tbParamList.get(0).getParamCode());
                //生成1-100随机数
                int suijishu= (int) (Math.random()*100+1);
                if(suijishu>jishu)
                {
                    //需要人工审单
                    tbQing.setStauts("1");
                }
                else
                {
                    //自动放行
                    tbQing.setStauts("7");
                    for (TbOrdersdetails tbOrdersdetails : ordersDetailsList)
                    {
                        //
                        TbGoods tbGoods=new TbGoods();
                        tbGoods.setCbename(orders.getCbename());
                        tbGoods.setGoodsinsp("GOjy001");
                        tbGoods.setCbename("广东省塔寨海鲜生产公司");
                        tbGoods.setAuditType("新增");
                        tbGoods.setCbecodeinsp("QYJY001");
                        tbGoods.setGoodsName("罗非鱼");
                        tbGoods.setGoodsNo(UUIDUtil.getUUid());
                        tbGoods.setSatus("1");
                        tbGoods.setCreateTime(new Date());
                        //添加之前先查询
                        tbGoodsMapper.insert(tbGoods);
                    }

                }
            }
            // 清单入库
            tbQingMapper.addqing(tbQing);
        }
        return tbOrders;
    }
}
