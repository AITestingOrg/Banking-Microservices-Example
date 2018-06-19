package ultimatesoftware.banking.transactions.service.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ultimatesoftware.banking.transactions.domain.models.BankTransaction;

import java.util.List;
import java.util.UUID;

public interface BankTransactionRepository extends MongoRepository<BankTransaction, UUID> {
    List<BankTransaction> findByCustomerId(UUID customerId);
}