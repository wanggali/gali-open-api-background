package com.gali.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gali.common.model.entity.UserInterfaceInfo;

/**
 * UserInterfaceInfoService:
 *
 * @author gali
 * @date 2023/09/07
 */
public interface InnerUserInterfaceInfoService {

    boolean invokeCount(long interfaceInfoId, long userId);
}

