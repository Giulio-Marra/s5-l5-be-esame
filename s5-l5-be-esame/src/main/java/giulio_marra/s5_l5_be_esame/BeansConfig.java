package giulio_marra.s5_l5_be_esame;

import giulio_marra.s5_l5_be_esame.entities.Edificio;
import giulio_marra.s5_l5_be_esame.entities.Postazione;
import giulio_marra.s5_l5_be_esame.enums.TipoPostazione;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public Edificio biblioteca() {
        return new Edificio("Biblioteca", "Napoli");
    }

    @Bean
    public Edificio palace() {
        return new Edificio("Palace", "Roma");
    }

    @Bean
    public Edificio grandBar() {
        return new Edificio("GrandBar", "Milano");
    }

    // POSTAZIONI

    @Bean
    public Postazione postazione1Biblioteca() {
        return new Postazione("postazione di fianco al balcone", 4, biblioteca(), TipoPostazione.OPENSPACE);
    }

    @Bean
    public Postazione postazione2Biblioteca() {
        return new Postazione("postazione al centro", 8, biblioteca(), TipoPostazione.SALA_RIUNIONI);
    }

    @Bean
    public Postazione postazione3Biblioteca() {
        return new Postazione("postazione di sotto", 2, biblioteca(), TipoPostazione.PRIVATO);
    }


    @Bean
    public Postazione postazione1palace() {
        return new Postazione("postazione di fianco al balcone", 4, palace(), TipoPostazione.OPENSPACE);
    }

    @Bean
    public Postazione postazione2palace() {
        return new Postazione("postazione al centro", 6, palace(), TipoPostazione.SALA_RIUNIONI);
    }

    @Bean
    public Postazione postazione3palace() {
        return new Postazione("postazione di sotto", 4, palace(), TipoPostazione.PRIVATO);
    }

    @Bean
    public Postazione postazione1GrandBar() {
        return new Postazione("postazione di fianco al balcone", 4, grandBar(), TipoPostazione.OPENSPACE);
    }

    @Bean
    public Postazione postazione2GrandBar() {
        return new Postazione("postazione al centro", 8, grandBar(), TipoPostazione.SALA_RIUNIONI);
    }

    @Bean
    public Postazione postazione3GrandBar() {
        return new Postazione("postazione non lo so", 8, grandBar(), TipoPostazione.OPENSPACE);
    }

    @Bean
    public Postazione postazione4GrandBar() {
        return new Postazione("postazione per forza", 4, grandBar(), TipoPostazione.SALA_RIUNIONI);
    }

    @Bean
    public Postazione postazione5GrandBar() {
        return new Postazione("postazione in alto a destra", 2, grandBar(), TipoPostazione.PRIVATO);
    }
}
