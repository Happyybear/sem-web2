package com.sem.semprovider.common.api;

/**
 * 常用API返回对象接口
 *
 * @author abc
 * @date 2019/4/19
 */
public interface IErrorCode {

    /**
     * 获取代码
     *
     * @return long
     */
    long getCode();

    /**
     * 返回信息
     * @return {@link String}
     */
    String getMessage();
}
