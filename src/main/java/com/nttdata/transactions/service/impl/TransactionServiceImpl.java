package com.nttdata.transactions.service.impl;

import com.nttdata.transactions.model.Transaction;
import com.nttdata.transactions.repository.TransactionRepository;
import com.nttdata.transactions.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

    Logger log = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    WebClient webClientAccount;

    @Override
    public Flux<Transaction> listByProductId(String id) {
        return transactionRepository.findTransactionByProductId(id);
    }

    @Override
    public Mono<Transaction> listById(String id) {
        return transactionRepository.findById(id);
    }

    @Override
    public Flux<Transaction> listByUserId(String id) {
        return transactionRepository.findTransactionByUserId(id);
    }

    @Override
    public Flux<Transaction> listTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Mono<Transaction> saveTransaction(Transaction transaction) {
        return transactionRepository.insert(transaction);
    }

    @Override
    public Mono<Transaction> updateTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Mono<Void> removeTransaction(String id) {
        return transactionRepository.deleteById(id);
    }

    @Override
    public Mono<Transaction> transference(String idOrigin, String idDestiny) {
        Mono<BankAccount>
        Mono<BankAccount>

        return ;
    }

    @Override
    public Mono<Transaction> operation(String idOrigin) {
        return
    }
}
