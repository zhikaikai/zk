package com.hogae.framework.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class Page {
    private final static String ASC = " ASC ";
    /**
     * 当前记录起始索引
     */
    @Min(value = 0,message = "pageNum 不能小于0",groups = ValidatorGroup.paging.class)
    private Integer pageNum;

    /**
     * 每页显示记录数
     */
    @Min(value = 0,message = "pageSize 不能小于0",groups = ValidatorGroup.paging.class)
    private Integer pageSize;

    /**
     * 排序列
     */
    @NotBlank(message = "orderByColumn 不能为空",groups = ValidatorGroup.paging.class)
    private String orderByColumn;

    /**
     * 排序的方向desc或者asc
     */
    @NotEmpty(message = "isAsc 不能为空",groups = ValidatorGroup.paging.class)
    private String isAsc = ASC;


}
