package giulio_marra.s5_l5_be_esame.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "edifici")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String nome;
    private String città;

    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;

    public Edificio(String nome, String città) {
        this.nome = nome;
        this.città = città;
    }
}
