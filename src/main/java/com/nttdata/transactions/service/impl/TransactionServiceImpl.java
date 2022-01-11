package com.nttdata.transactions.service.impl;

import com.nttdata.transactions.model.Transaction;
import com.nttdata.transactions.repository.TransactionRepository;
import com.nttdata.transactions.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

    Logger log = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Mono<Transaction> listByProductId(String id) {
        return null;
    }

    @Override
    public Mono<Transaction> listById(String id) {
        return null;
    }

    @Override
    public Flux<Transaction> listTransactions() {
        return null;
    }

    @Override
    public Mono<Transaction> listByUserId(String id) {
        return null;
    }

    @Override
    public Mono<Transaction> saveTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Mono<Transaction> updateTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Mono<Void> removeTransaction(String id) {
        return null;
    }
}
