package com.shi.gjsystem.pojo;

import java.io.Serializable;

/**
 * @description:
 * @author: SXJ
 * @date: 2019-05-31 8:36
 */
public class TbChDi {
    private String code;
    private  String data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TbChDi{" +
                "code='" + code + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
