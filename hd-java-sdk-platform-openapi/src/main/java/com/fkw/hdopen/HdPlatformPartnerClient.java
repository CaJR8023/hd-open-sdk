package com.fkw.hdopen;

import com.fkw.hdopen.auth.CredentialsProvider;
import com.fkw.hdopen.model.HdOpenActivityVO;
import com.fkw.hdopen.model.PageResult;
import com.fkw.hdopen.model.Result;
import com.fkw.hdopen.model.TestOperation;
import com.fkw.hdopen.operation.IHdOpenActivityOperation;
import com.fkw.hdopen.operation.IHdOpenActivitySpreadStatOperation;
import com.fkw.hdopen.operation.IHdOpenActivityUserOperation;
import com.fkw.hdopen.operation.IHdOpenConsumeRecordOperation;
import com.fkw.hdopen.operation.impl.HdOpenActivityOperation;
import com.fkw.hdopen.operation.impl.HdOpenActivitySpreadStatOperation;
import com.fkw.hdopen.operation.impl.HdOpenActivityUserOperation;
import com.fkw.hdopen.operation.impl.HdOpenConsumeRecordOperation;

/**
 * @author CAJR
 * @Description 平台类合作方客户端
 * @date 2021/9/9 14:00
 */
public class HdPlatformPartnerClient extends HdPartnerClient{

    private TestOperation testOperation;
    private IHdOpenActivityOperation hdOpenActivityOperation;
    private IHdOpenActivityUserOperation hdOpenActivityUserOperation;
    private IHdOpenActivitySpreadStatOperation hdOpenActivitySpreadStatOperation;
    private IHdOpenConsumeRecordOperation hdOpenConsumeRecordOperation;

    public HdPlatformPartnerClient(CredentialsProvider credentialsProvider, ClientConfiguration configuration) {
        super(credentialsProvider, configuration);
    }

    @Override
    public void initOperations() {
        this.testOperation = new TestOperation(endpoint, serviceClient, credentialsProvider);
        this.hdOpenActivityOperation = new HdOpenActivityOperation(endpoint, serviceClient, credentialsProvider);
        this.hdOpenActivityUserOperation = new HdOpenActivityUserOperation(endpoint, serviceClient, credentialsProvider);
        this.hdOpenActivitySpreadStatOperation = new HdOpenActivitySpreadStatOperation(endpoint, serviceClient, credentialsProvider);
        this.hdOpenConsumeRecordOperation = new HdOpenConsumeRecordOperation(endpoint, serviceClient, credentialsProvider);
    }

    @Override
    public Result<String> test() {
        return testOperation.test();
    }

    public Result<HdOpenActivityVO> getOneHdActivityInfo(int aid, int activityId){
        return hdOpenActivityOperation.getOneHdActivityInfo(aid, activityId);
    }

    public PageResult<HdOpenActivityVO> getOneHdActivityInfoByPage(int aid, Integer pageNo, Integer pageSize){
        return hdOpenActivityOperation.getOneHdActivityInfoByPage(aid, pageNo, pageSize);
    }

    public PageResult<HdOpenActivityVO> getOneHdActivityInfoByPage(int aid, Integer activityType, String sort, Integer pageNo, Integer pageSize){
        return hdOpenActivityOperation.getOneHdActivityInfoByPage(aid, activityType, sort, pageNo, pageSize);
    }
}
