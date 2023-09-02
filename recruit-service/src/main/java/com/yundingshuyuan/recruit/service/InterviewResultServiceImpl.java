package com.yundingshuyuan.recruit.service;

import com.yundingshuyuan.recruit.api.InterviewResultService;
import com.yundingshuyuan.recruit.dao.InterviewRecordMapper;
import com.yundingshuyuan.recruit.dao.UserInfoMapper;
import com.yundingshuyuan.recruit.domain.vo.InterviewRecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author cr
 * @Date 2023/7/27 16:09
 */
@Service
public class InterviewResultServiceImpl implements InterviewResultService {

    @Autowired
    InterviewRecordMapper interviewRecordMapper;
    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * 数据库InterviewRecord中所有的记录
     *
     * @return
     */
    @Override
    public List<InterviewRecordVo> showAllRecord() {
        return interviewRecordMapper.selectVoList();
    }

    /**
     * 传入groupId，查找到它的该面试官对应的记录
     *
     * @param groupId
     * @return
     */
    @Override
    public List<InterviewRecordVo> showAdminRecord(Integer groupId) {
        return interviewRecordMapper.adminRecord(groupId);
    }
}
