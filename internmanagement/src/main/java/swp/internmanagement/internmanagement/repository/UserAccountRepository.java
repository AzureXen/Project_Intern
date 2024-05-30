package swp.internmanagement.internmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp.internmanagement.internmanagement.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
}