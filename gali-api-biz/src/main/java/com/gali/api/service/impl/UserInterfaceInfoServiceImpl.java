package com.gali.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gali.api.model.entity.UserInterfaceInfo;
import com.gali.api.service.UserInterfaceInfoService;
import com.gali.api.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author gali
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2023-08-16 23:34:01
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




