package kirecaproject.models.entities;


import jakarta.persistence.*;
import kirecaproject.models.entities.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column(nullable = false, name = "full_name")
    private String fullName;

    @Column(nullable = false)
    private String password;
}
