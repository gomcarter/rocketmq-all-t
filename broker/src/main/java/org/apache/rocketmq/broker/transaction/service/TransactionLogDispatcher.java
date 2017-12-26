package org.apache.rocketmq.broker.transaction.service;

import org.apache.rocketmq.store.CommitLogDispatcher;
import org.apache.rocketmq.store.DispatchRequest;

public class TransactionLogDispatcher implements CommitLogDispatcher {

    private TransactionDispatchService transactionDispatchService;

    public TransactionLogDispatcher(TransactionDispatchService transactionDispatchService) {
        this.transactionDispatchService = transactionDispatchService;
    }

    @Override
    public void dispatch(DispatchRequest request) {
        this.transactionDispatchService.putRequest(request);
    }
}
