package com.sysu.goingpub.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageDTO<E>  implements Serializable {

    private static final long serialVersionUID = -5143271052585573989L;

    private Integer totalCount;

    private Integer pageSize;

    private Integer pageNo;

    private List<E> content;

}