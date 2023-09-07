package com.gali.common.service;

import com.gali.common.model.entity.User;

/**
 * InnerUserService:
 *
 * @author gali
 * @date 2023/09/07
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}

