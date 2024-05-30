package swp.internmanagement.internmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp.internmanagement.internmanagement.entity.Intern;

public interface InternRepository extends JpaRepository<Intern,Integer> {
}
