package com.nttdata.transactions.controller;

import com.nttdata.transactions.model.Transaction;
import com.nttdata.transactions.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    Logger log = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    TransactionService transactionService;

    @GetMapping
    public Flux<Transaction> getTransaction(){
        log.info("Listing all Transaction: ");
        return transactionService.listTransactions();
    }

    @GetMapping("/{id}")
    public Mono<Transaction> getTransactionById(@PathVariable("id") String id){
        log.info("Searching Transaction with Id "+id);
        return transactionService.listById(id);
    }

    @GetMapping("/product/{id}")
    public Mono<Transaction> getTransactionByProduct(@PathVariable("id") String id){
        log.info("Searching Transaction with product with Id "+id);
        return transactionService.listByProductId(id);
    }

    @GetMapping("/user/{id}")
    public Mono<Transaction> getTransactionByUser(@PathVariable("id") String id){
        log.info("Searching a transaction with user id "+id);
        return transactionService.listByUserId(id);
    }

    @PostMapping("/save")
    public Mono<Transaction> saveTransaction(@RequestBody Transaction transaction){
        log.info("Inserting a new transaction");
        return transactionService.saveTransaction(transaction);
    }

    @PutMapping("/update")
    public Mono<Transaction> updateTransaction(@RequestBody Transaction transaction){
        log.info("Updating the following Id: "+transaction.getId());
        return transactionService.updateTransaction(transaction);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> removeTransaction(@PathVariable("id") String id){
        log.info("Removing the following Transaction: "+ id);
        return transactionService.removeTransaction(id);
    }
}
