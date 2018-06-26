package com.ultimatesoftware.banking.account.cmd.domain.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.UUID;

public class AcquireSourceAccountCommand extends TransactionCommand implements ICommand {
    @TargetAggregateIdentifier
    private UUID id;

    public AcquireSourceAccountCommand(UUID id, String transactionId) {
        super(transactionId);
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}