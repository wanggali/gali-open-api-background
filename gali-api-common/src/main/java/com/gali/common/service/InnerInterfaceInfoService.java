package com.gali.common.service;

import com.gali.common.model.entity.InterfaceInfo;

/**
 * InnerInterfaceInfoService:
 *
 * @author gali
 * @date 2023/09/07
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}

