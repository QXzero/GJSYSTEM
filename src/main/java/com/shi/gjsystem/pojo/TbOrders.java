package com.shi.gjsystem.pojo;

import java.util.Date;

public class TbOrders {
    private String ordersNo;

    private String cbename;

    private String cbecodeinsp;

    private Integer goodsNumber;

    private String userName;

    private Float totalMoney;

    private Date createTime;

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo == null ? null : ordersNo.trim();
    }

    public String getCbename() {
        return cbename;
    }

    public void setCbename(String cbename) {
        this.cbename = cbename == null ? null : cbename.trim();
    }

    public String getCbecodeinsp() {
        return cbecodeinsp;
    }

    public void setCbecodeinsp(String cbecodeinsp) {
        this.cbecodeinsp = cbecodeinsp == null ? null : cbecodeinsp.trim();
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TbOrders{" +
                "ordersNo='" + ordersNo + '\'' +
                ", cbename='" + cbename + '\'' +
                ", cbecodeinsp='" + cbecodeinsp + '\'' +
                ", goodsNumber=" + goodsNumber +
                ", userName='" + userName + '\'' +
                ", totalMoney=" + totalMoney +
                ", createTime=" + createTime +
                '}';
    }
}