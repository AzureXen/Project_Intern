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
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "company_name", nullable = false, length = 50)
    private String companyName;

    @NotNull
    @Nationalized
    @Lob
    @Column(name = "desciption", nullable = false)
    private String desciption;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "location", nullable = false, length = 50)
    private String location;

    public Company(String companyName, String location, String desciption) {
        this.companyName = companyName;
        this.location = location;
        this.desciption = desciption;
    }
}