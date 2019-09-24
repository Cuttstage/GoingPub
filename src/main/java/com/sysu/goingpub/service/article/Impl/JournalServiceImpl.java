package com.sysu.goingpub.service.article.Impl;

import com.sysu.goingpub.dao.JournalInfoMapper;
import com.sysu.goingpub.dto.request.QueryJournalListRequest;
import com.sysu.goingpub.dto.response.PageDTO;
import com.sysu.goingpub.exception.BusinessException;
import com.sysu.goingpub.exception.enums.code.BaseExceptionCode;
import com.sysu.goingpub.model.JournalInfo;
import com.sysu.goingpub.model.JournalInfoExample;
import com.sysu.goingpub.service.article.JournalService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class JournalServiceImpl implements JournalService {

    @Autowired
    private JournalInfoMapper journalInfoMapper;

    @Override
    public PageDTO<JournalInfo> getJournal(QueryJournalListRequest request) {
        JournalInfoExample example = new JournalInfoExample();
        example.setDistinct(true);
        long total = journalInfoMapper.countByExample(example);

        example.setLimitStart(request.getLimitStart());
        example.setLimitEnd(request.getLimitSize());
        List<JournalInfo> journalInfos = journalInfoMapper.selectByExample(example);

        PageDTO<JournalInfo> pageDTO = new PageDTO<>();
        pageDTO.setContent(journalInfos);
        pageDTO.setTotalCount((int) total);
        pageDTO.setPageNo(request.getPageNo());
        pageDTO.setPageSize(request.getPageSize());
        return pageDTO;
    }

    @Override
    public JournalInfo getSingleJournal(String ISSN) {
        if(StringUtils.isBlank(ISSN)) {
            throw new BusinessException(BaseExceptionCode.WRONG_ISSN_NUMBER.code, BaseExceptionCode.WRONG_ISSN_NUMBER.msg);
        }
        JournalInfoExample example = new JournalInfoExample();
        example.createCriteria().andIssnEqualTo(ISSN);
        List<JournalInfo> journalInfos = journalInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(journalInfos)) {
            throw new BusinessException(BaseExceptionCode.WRONG_ISSN_NUMBER.code, BaseExceptionCode.WRONG_ISSN_NUMBER.msg);
        }
        return journalInfos.get(0);
    }
}
