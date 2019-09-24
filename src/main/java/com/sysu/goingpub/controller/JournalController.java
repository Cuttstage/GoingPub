package com.sysu.goingpub.controller;

import com.sysu.goingpub.dto.request.QueryJournalListRequest;
import com.sysu.goingpub.dto.response.BaseResponse;
import com.sysu.goingpub.dto.response.PageDTO;

import com.sysu.goingpub.model.JournalInfo;
import com.sysu.goingpub.service.article.JournalService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/v1/journal")
public class JournalController {

    @Autowired
    JournalService journalService;

    /**
     * 论文分页查询
     */
    @RequestMapping(value = "/queryJournalList", method = RequestMethod.GET)
    public BaseResponse<PageDTO<JournalInfo>> getJournal(QueryJournalListRequest request) {
        BaseResponse<PageDTO<JournalInfo>> baseResponse = new BaseResponse<>();
        PageDTO<JournalInfo> pageDTO = journalService.getJournal(request);
        baseResponse.setData(pageDTO);
        return baseResponse;
    }

    /**
     * 论文单个查询
     */
    @RequestMapping(value = "/querJournal", method = RequestMethod.GET)
    public BaseResponse<JournalInfo> queryJournal(@Param("ISSN") String ISSN) {
        BaseResponse<JournalInfo> baseResponse = new BaseResponse<>();
        JournalInfo journalInfo = journalService.getSingleJournal(ISSN);
        baseResponse.setData(journalInfo);
        return baseResponse;
    }
}
