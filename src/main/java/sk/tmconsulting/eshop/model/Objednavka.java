package sk.tmconsulting.eshop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@Data  // Autogenerate getters and setters cez lombok
@Entity //inštrukcia aby tuto triedu bral ako tabulku v DB
@Table(name="objednavky")
public class Objednavka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name= "nazov_produktu", nullable = false)
    private String nazovProduktu;
    @Column(name= "farba", nullable = false)
    private String farba;
    @Column(name= "znacka", nullable = false)
    private String znacka;
    @Column(name= "velkost", nullable = false)
    private String velkost;
    @Column(name= "objednane_mnozstvo", nullable = false)
    private int objednaneMnozstvo;
    @Column(name= "datum", nullable = false)
    private Date datum;
    @Column(name= "meno_zakaznika", nullable = false)
    private String menoZakaznika;
    @Column(name= "priezvisko_zakaznika", nullable = false)
    private String priezviskoZakaznika;
}
