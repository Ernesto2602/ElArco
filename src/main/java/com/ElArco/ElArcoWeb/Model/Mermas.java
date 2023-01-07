package com.ElArco.ElArcoWeb.Model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "mermas")
public class Mermas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "me_id")
    int al_id;
    @ManyToOne
    @JoinColumn(name = "me_articulo")
    Articulos al_articulo;
    @Column(name = "me_cantidad", nullable = false)
    int al_cantidad;
    @Column(name="me_fecha", nullable = false)
    Date al_fecha;
    //Constructor sin parametros
    public Mermas() {
    }
    //Constructor con parametros
    public Mermas(int al_id, Articulos al_articulo, int al_cantidad, Date al_fecha) {
        this.al_id = al_id;
        this.al_articulo = al_articulo;
        this.al_cantidad = al_cantidad;
        this.al_fecha = al_fecha;
    }
}
