package com.shi.gjsystem.pojo;

import java.util.Date;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-06-04 20:37
 */
public class TbZong {
    String id;
    TbOrdersdetails ordersdetails;
    TbWaybill tbWaybill;
    TbPay tbPay;
    String Status;
    Date Create_Time;

    @Override
    public String toString() {
        return "TbZong{" +
                "id='" + id + '\'' +
                ", ordersdetails=" + ordersdetails +
                ", tbWaybill=" + tbWaybill +
                ", tbPay=" + tbPay +
                ", Status='" + Status + '\'' +
                ", Create_Time=" + Create_Time +
                '}';
    }

    public String getGoodsName() {
        return ordersdetails.getGoodsName();
    }

    public Float getGoodsPrice() {

        return ordersdetails.getGoodsPrice();
    }

    public String getZfname(){
        return tbPay.getZfname();
    }

    public String getSender(){
        return tbWaybill.getSender();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TbOrdersdetails getOrdersdetails() {

        return ordersdetails;
    }
    public void setOrdersdetails(TbOrdersdetails ordersdetails) {

        this.ordersdetails = ordersdetails;
    }

    public TbWaybill getTbWaybill() {
        return tbWaybill;
    }

    public void setTbWaybill(TbWaybill tbWaybill) {
        this.tbWaybill = tbWaybill;
    }

    public TbPay getTbPay() {
        return tbPay;
    }

    public void setTbPay(TbPay tbPay) {
        this.tbPay = tbPay;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getCreate_Time() {
        return Create_Time;
    }

    public void setCreate_Time(Date create_Time) {
        Create_Time = create_Time;
    }
}
