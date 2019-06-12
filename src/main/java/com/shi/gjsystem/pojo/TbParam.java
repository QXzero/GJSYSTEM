package com.shi.gjsystem.pojo;

import java.util.Date;

public class TbParam {
    private String id;

    private String pid;

    private String paramType;

    private String paramCode;

    private String paramValue;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode == null ? null : paramCode.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TbParam{" +
                "id='" + id + '\'' +
                ", pid='" + pid + '\'' +
                ", paramType='" + paramType + '\'' +
                ", paramCode='" + paramCode + '\'' +
                ", paramValue='" + paramValue + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}