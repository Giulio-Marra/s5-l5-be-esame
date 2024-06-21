package giulio_marra.s5_l5_be_esame.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String descrizione;
    private int numero_occupanti;

    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    public Postazione(String descrizione, int numero_occupanti) {
        this.descrizione = descrizione;
        this.numero_occupanti = numero_occupanti;
    }
}
