package com.nttdata.transactions.service;

import com.nttdata.transactions.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {
    Mono<Transaction> listByProductId(String id);

    Mono<Transaction> listById(String id);

    Flux<Transaction> listTransactions();

    Mono<Transaction> listByUserId(String id);

    Mono<Transaction> saveTransaction(Transaction transaction);

    Mono<Transaction> updateTransaction(Transaction transaction);

    Mono<Void> removeTransaction(String id);
}
