package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.model.*;
import com.fkw.hdopen.model.request.*;
import com.fkw.hdopen.operation.*;
import com.fkw.hdopen.operation.impl.*;

import java.util.List;

/**
 * @author CAJR
 * @Description 平台类合作方客户端
 * @date 2021/9/9 14:00
 */
public class HdPlatformPartnerClient extends HdPartnerClient {

    private IOpenSecurityOperation iOpenSecurityOperation;
    private IHdOpenAccountOperation iHdOpenAccountOperation;
    private IHdOpenActivityOperation iHdOpenActivityOperation;
    private IHdOpenActivityUserOperation iHdOpenActivityUserOperation;
    private IHdOpenActivitySpreadStatOperation iHdOpenActivitySpreadStatOperation;
    private IHdOpenConsumeRecordOperation iHdOpenConsumeRecordOperation;
    private IOpenToolOperation iOpenToolOperation;

    public HdPlatformPartnerClient(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        super(credentialsProvider, configuration);
    }

    @Override
    public void initOperations() {
        this.iOpenSecurityOperation = new OpenSecurityOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.iHdOpenAccountOperation = new HdOpenAccountOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.iHdOpenActivityOperation = new HdOpenActivityOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.iHdOpenActivityUserOperation = new HdOpenActivityUserOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.iHdOpenActivitySpreadStatOperation = new HdOpenActivitySpreadStatOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.iHdOpenConsumeRecordOperation = new HdOpenConsumeRecordOperation(getEndpoint(), serviceClient, credentialsProvider);
        this.iOpenToolOperation = new OpenToolOperation(getEndpoint(), serviceClient, credentialsProvider);
    }

    public Result<HdOpenActivityVO> getOneHdActivityInfo(int aid, int activityId) {
        return iHdOpenActivityOperation.getOneHdActivityInfo(aid, activityId);
    }

    public PageResult<HdOpenActivityVO> getHdActivityInfoByPage(int aid, Integer pageNo, Integer pageSize) {
        return iHdOpenActivityOperation.getHdActivityInfoByPage(aid, pageNo, pageSize);
    }

    public PageResult<HdOpenActivityVO> getHdActivityInfoByPage(int aid, Integer activityType, String sort, Integer pageNo, Integer pageSize) {
        CallHdOpenActivitiesPageApiVO vo = new CallHdOpenActivitiesPageApiVO().setAid(aid)
                .setActivityType(activityType).setSort(sort)
                .setPageNo(pageNo)
                .setPageSize(pageSize);
        return iHdOpenActivityOperation.getHdActivityInfoByPage(vo);
    }

    public String decryptByRsaPublicKey(String publicKey, String sign, String encryptedData) {
        return iOpenSecurityOperation.decryptByRsaPublicKey(publicKey, sign, encryptedData);
    }

    public Result<String> getPublicKey() {
        return iOpenSecurityOperation.getPublicKey();
    }

    public Result<List<HdActivitySpreadStatLevelVO>> getActivitySpreadStatLevel(int aid, int activityId) {
        return iHdOpenActivitySpreadStatOperation.getActivitySpreadStatLevel(aid, activityId);
    }

    public Result<HdActivityUserSpreadStatVO> getActivityUserSpreadStat(int aid, int activityId) {
        return iHdOpenActivitySpreadStatOperation.getActivityUserSpreadStat(aid, activityId);
    }

    public Result<Integer> updateActivityUserAchievement(CallHdActivityUserAchievementApiVO vo) {
        return iHdOpenActivityUserOperation.updateActivityUserAchievement(vo);
    }

    public Result<HdActivityUserVO> getOneHdActivityUserByFaiOpenId(int aid, int activityId, String faiOpenId) {
        return iHdOpenActivityUserOperation.getOneHdActivityUserByFaiOpenId(aid, activityId, faiOpenId);
    }

    public PageResult<HdActivityUserVO> getActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        return iHdOpenActivityUserOperation.getActivityUserByPage(vo);
    }

    public PageResult<HdActivityUserVO> getBlackActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        return iHdOpenActivityUserOperation.getBlackActivityUserByPage(vo);
    }

    public PageResult<HdActivityUserVO> getPrizeActivityUserByPage(CallHdOpenActivityUsersPageApiVO vo) {
        return iHdOpenActivityUserOperation.getPrizeActivityUserByPage(vo);
    }

    public PageResult<HdConsumeRecordVO> getConsumeRecordByPage(CallHdOpenConsumeRecordPageApiVO vo) {
        return iHdOpenConsumeRecordOperation.getConsumeRecordByPage(vo);
    }

    public Result<HdCodeStatusVO> getCodeStatus(int aid, String code) {
        return iHdOpenConsumeRecordOperation.getCodeStatus(aid, code);
    }

    public Result<Integer> consumeCode(CallHdOpenConsumeCodeApiVO vo) {
        return iHdOpenConsumeRecordOperation.consumeCode(vo);
    }

    public Result<HdRedPacketVO> getRedPacketRecord(Integer aid, Integer activityId, String cmCode) {
        return iHdOpenConsumeRecordOperation.getRedPacketRecord(aid, activityId, cmCode);
    }

    public Result<HdAccountRegisterVO> register(String partnerId) {
        return iHdOpenAccountOperation.register(partnerId);
    }

    public Result<HdAccountRegisterVO> registerOemAcct(String partnerId, Integer agentAid) {
        return iHdOpenAccountOperation.registerOemAcct(partnerId, agentAid);
    }

    public Result<HdAccountLoginVO> login(CallHdOpenLoginApiVO vo) {
        return iHdOpenAccountOperation.login(vo);
    }

    public Result<String> transformLongUrl(String key) {
        return iOpenToolOperation.transformLongUrl(key);
    }

    public Result<String> transformShortUrl(String url) {
        return iOpenToolOperation.transformShortUrl(url);
    }

}
