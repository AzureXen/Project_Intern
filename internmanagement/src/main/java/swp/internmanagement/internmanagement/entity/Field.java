package swp.internmanagement.internmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Field")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="field_id")
    private int field_id;

    @Column(name="field_name")
    private String field_name;

    public Field (String field_name){
        this.field_name = field_name;
    }
}
