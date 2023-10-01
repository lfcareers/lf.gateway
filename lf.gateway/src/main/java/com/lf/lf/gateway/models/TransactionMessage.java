package com.lf.lf.gateway.models;


import jdk.jfr.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionMessage {

    private Long transactionId;
    private Event event;
    private Double amount;
    private Status status;

    public enum Events{
        WITHDRAW, DEPOSIT
    }

    public enum Status {
        SUBMITTED, STARTED, PENDING, FINISHED, TERMINATING
    }
}
