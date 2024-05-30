package swp.internmanagement.internmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swp.internmanagement.internmanagement.entity.Mentor;

public interface MentorRepository extends JpaRepository<Mentor,Integer> {
}
