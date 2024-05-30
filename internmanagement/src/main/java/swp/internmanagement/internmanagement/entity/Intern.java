package swp.internmanagement.internmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intern_id", nullable = false)
    private Integer id;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserAccount user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @NotNull
    @Nationalized
    @Lob
    @Column(name = "work_history", nullable = false)
    private String workHistory;

    @NotNull
    @Nationalized
    @Lob
    @Column(name = "education_background", nullable = false)
    private String educationBackground;

    @Column(name = "task_result")
    private Integer taskResult;

    public Intern(UserAccount user, Company company, String fullName, LocalDate dateOfBirth,
                  String workHistory, String educationBackground) {
        this.user = user;
        this.company = company;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.workHistory = workHistory;
        this.educationBackground = educationBackground;
    }

}