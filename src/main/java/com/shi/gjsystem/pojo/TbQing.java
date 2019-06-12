package com.shi.gjsystem.pojo;

import java.util.Date;

public class TbQing {
    private String qingNo;

    private String ordersNo;

    private String waybillNo;

    private String payNo;

    private String stauts;

    private Date createTime;

    public String getQingNo() {
        return qingNo;
    }

    public void setQingNo(String qingNo) {
        this.qingNo = qingNo == null ? null : qingNo.trim();
    }

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo == null ? null : ordersNo.trim();
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TbQing{" +
                "qingNo='" + qingNo + '\'' +
                ", ordersNo='" + ordersNo + '\'' +
                ", waybillNo='" + waybillNo + '\'' +
                ", payNo='" + payNo + '\'' +
                ", stauts='" + stauts + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}