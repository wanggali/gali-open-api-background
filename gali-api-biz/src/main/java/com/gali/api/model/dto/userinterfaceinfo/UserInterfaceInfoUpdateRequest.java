package com.gali.api.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * UserInterfaceInfoUpdateRequest:
 *
 * @author gali
 * @date 2023/08/28
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 0-正常，1-禁用
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

