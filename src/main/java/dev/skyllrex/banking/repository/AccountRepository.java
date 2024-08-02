package dev.skyllrex.banking.repository;

import dev.skyllrex.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
