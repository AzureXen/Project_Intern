package swp.internmanagement.internmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "User_account")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @NotNull
    @Nationalized
    @Lob
    @Column(name = "password", nullable = false)
    private String password;

    @Size(max = 50)
    @Nationalized
    @Column(name = "email", length = 50)
    private String email;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @Size(max = 50)
    @Nationalized
    @Column(name = "verification code", length = 50)
    private String verificationCode;

    public UserAccount(String userName, String password, String email, String role) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}