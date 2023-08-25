package com.gali.api.model.dto.interfaceInfo;

import lombok.Data;

/**
 * InterfaceInfoInvokeRequest:
 *
 * @author gali
 * @date 2023/08/25
 */
@Data
public class InterfaceInfoInvokeRequest {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;

}
