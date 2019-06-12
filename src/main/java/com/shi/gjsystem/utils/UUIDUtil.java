package com.shi.gjsystem.utils;

import java.util.UUID;
/**
 * @description: UUID工具类
 * @author: SXJ
 * @date: 2019-06-03 14:56
 */
public class UUIDUtil {
        /**
         * 产生全球唯一的字符串
         * @return
         */
        public static String getUUid() {
            return UUID.randomUUID().toString().replace("-", "").toUpperCase();
        }
}
