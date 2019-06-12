package com.shi.gjsystem.pojo;

import java.util.Date;

public class TbPay {
    private String payNo;

    private String ordersNo;

    private String zfcodeinsp;

    private String zfname;

    private String payName;

    private Float payMoney;

    private String payType;

    private Date createTime;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo == null ? null : ordersNo.trim();
    }

    public String getZfcodeinsp() {
        return zfcodeinsp;
    }

    public void setZfcodeinsp(String zfcodeinsp) {
        this.zfcodeinsp = zfcodeinsp == null ? null : zfcodeinsp.trim();
    }

    public String getZfname() {
        return zfname;
    }

    public void setZfname(String zfname) {
        this.zfname = zfname == null ? null : zfname.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public Float getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Float payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}