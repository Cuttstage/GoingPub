package com.sysu.goingpub.dto.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class QueryJournalListRequest extends PageBaseRequest {
    /**
     * 当前页
     */
    private Integer pageNo;

    private Integer pageSize;

    public Integer getLimitStart() {
        return Integer.valueOf(this.pageSize.intValue() * (this.pageNo.intValue() - 1));
    }


    public Integer getLimitSize() {
        return this.pageSize;
    }
}
