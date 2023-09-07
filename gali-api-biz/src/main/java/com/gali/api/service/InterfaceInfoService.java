package com.gali.api.service;

import com.gali.common.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author gali
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-16 23:32:56
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
