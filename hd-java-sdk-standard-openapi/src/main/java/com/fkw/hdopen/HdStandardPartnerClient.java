package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.model.*;
import com.fkw.hdopen.model.request.*;
import com.fkw.hdopen.operation.IHdOpenActivityOperation;
import com.fkw.hdopen.operation.IHdOpenActivitySpreadStatOperation;
import com.fkw.hdopen.operation.IHdOpenActivityUserOperation;
import com.fkw.hdopen.operation.IHdOpenConsumeRecordOperation;
import com.fkw.hdopen.operation.impl.HdOpenActivityOperation;
import com.fkw.hdopen.operation.impl.HdOpenActivitySpreadStatOperation;
import com.fkw.hdopen.operation.impl.HdOpenActivityUserOperation;
import com.fkw.hdopen.operation.impl.HdOpenConsumeRecordOperation;

import java.util.List;

/**
 * @author CAJR
 * @Description 标准类合作方客户端
 * @date 2021/9/10 18:18
 */
public class HdStandardPartnerClient extends HdPartnerClient{
    private IHdOpenActivityOperation hdOpenActivityOperation;
    private IHdOpenActivityUserOperation hdOpenActivityUserOperation;
    private IHdOpenActivitySpreadStatOperation hdOpenActivitySpreadStatOperation;
    private IHdOpenConsumeRecordOperation hdOpenConsumeRecordOperation;

    public HdStandardPartnerClient(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        super(credentialsProvider, configuration);
    }

    @Override
    public void initOperations() {
        this.hdOpenActivityOperation = new HdOpenActivityOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.hdOpenActivityUserOperation = new HdOpenActivityUserOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.hdOpenActivitySpreadStatOperation = new HdOpenActivitySpreadStatOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.hdOpenConsumeRecordOperation = new HdOpenConsumeRecordOperation(getEndpoint(), serviceClient, credentialsProvider);
    }

    public Result<HdOpenActivityVO> getOneHdActivityInfo(int aid, int activityId) {
        return hdOpenActivityOperation.getOneHdActivityInfo(aid, activityId);
    }

    public PageResult<HdOpenActivityVO> getOneHdActivityInfoByPage(int aid, Integer pageNo, Integer pageSize) {
        return hdOpenActivityOperation.getHdActivityInfoByPage(aid, pageNo, pageSize);
    }

    public PageResult<HdOpenActivityVO> getOneHdActivityInfoByPage(int aid, Integer activityType, String sort, Integer pageNo, Integer pageSize) {
        CallHdOpenActivitiesPageApiVO vo = new CallHdOpenActivitiesPageApiVO().setAid(aid)
                .setActivityType(activityType).setSort(sort)
                .setPageNo(pageNo)
                .setPageSize(pageSize);
        return hdOpenActivityOperation.getHdActivityInfoByPage(vo);
    }

    public Result<List<HdActivitySpreadStatLevelVO>> getActivitySpreadStatLevel(int aid, int activityId) {
        return hdOpenActivitySpreadStatOperation.getActivitySpreadStatLevel(aid, activityId);
    }

    public Result<HdActivityUserSpreadStatVO> getActivityUserSpreadStat(int aid, int activityId) {
        return hdOpenActivitySpreadStatOperation.getActivityUserSpreadStat(aid, activityId);
    }

    public Result<Integer> updateActivityUserAchievement(CallHdActivityUserAchievementApiVO vo) {
        return hdOpenActivityUserOperation.updateActivityUserAchievement(vo);
    }

    public Result<HdActivityUserVO> getOneHdActivityUserByFaiOpenId(int aid, int activityId, String faiOpenId) {
        return hdOpenActivityUserOperation.getOneHdActivityUserByFaiOpenId(aid, activityId, faiOpenId);
    }

    public PageResult<HdActivityUserVO> getActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        return hdOpenActivityUserOperation.getActivityUserByPage(vo);
    }

    public PageResult<HdActivityUserVO> getBlackActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        return hdOpenActivityUserOperation.getBlackActivityUserByPage(vo);
    }

    public PageResult<HdActivityUserVO> getPrizeActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        return hdOpenActivityUserOperation.getPrizeActivityUserByPage(vo);
    }

    public PageResult<HdConsumeRecordVO> getConsumeRecordByPage(CallHdOpenConsumeRecordPageApiVO vo) {
        return hdOpenConsumeRecordOperation.getConsumeRecordByPage(vo);
    }

    public Result<HdCodeStatusVO> getCodeStatus(int aid, String code) {
        return hdOpenConsumeRecordOperation.getCodeStatus(aid, code);
    }

    public Result<Integer> consumeCode(CallHdOpenConsumeCodeApiVO vo) {
        return hdOpenConsumeRecordOperation.consumeCode(vo);
    }

    public Result<HdRedPacketVO> getRedPacketRecord(Integer aid, Integer activityId, String cmCode) {
        return hdOpenConsumeRecordOperation.getRedPacketRecord(aid, activityId, cmCode);
    }
}
