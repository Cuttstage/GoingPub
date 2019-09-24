package com.sysu.goingpub.service.article;

import com.sysu.goingpub.dto.request.QueryJournalListRequest;
import com.sysu.goingpub.dto.response.PageDTO;
import com.sysu.goingpub.model.JournalInfo;

public interface JournalService {

    /**
     *查询所有的论文并且分页
     */
    PageDTO<JournalInfo> getJournal(QueryJournalListRequest request);

    /**
     * 单一查询某一论文
     */
    JournalInfo getSingleJournal(String ISSN);
}
