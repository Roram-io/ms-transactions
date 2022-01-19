package com.nttdata.transactions.repository;

import com.nttdata.transactions.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    Flux<Transaction> findTransactionByProductId(String id);

    Flux<Transaction> findTransactionByUserId(String id);
}
