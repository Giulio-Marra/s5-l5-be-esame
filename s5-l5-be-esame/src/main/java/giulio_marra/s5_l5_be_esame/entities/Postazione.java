package giulio_marra.s5_l5_be_esame.entities;

import giulio_marra.s5_l5_be_esame.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, int numero_occupanti, Edificio edificio, TipoPostazione tipo) {
        this.descrizione = descrizione;
        this.numero_occupanti = numero_occupanti;
        this.edificio = edificio;
        this.tipo = tipo;
    }
}
