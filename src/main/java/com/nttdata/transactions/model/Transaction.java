package com.nttdata.transactions.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id = UUID.randomUUID().toString();
    private String productId;
    private String userId;
    private double transactionAmount;
    private Date transactionDate=new Date();
}
