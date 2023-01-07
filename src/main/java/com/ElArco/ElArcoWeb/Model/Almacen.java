package com.ElArco.ElArcoWeb.Model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name = "almacen")
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "al_id")
    int al_id;
    @ManyToOne
    @JoinColumn(name = "al_articulo")
    Articulos al_articulo;
    @Column(name = "al_cantidad", nullable = false)
    int al_cantidad;
    @Column(name="al_fecha", nullable = false)
    Date al_fecha;
    //Constructor sin parametros
    public Almacen() {
    }
    //Constructor con parametros
    public Almacen(int al_id, Articulos al_articulo, int al_cantidad, Date al_fecha) {
        this.al_id = al_id;
        this.al_articulo = al_articulo;
        this.al_cantidad = al_cantidad;
        this.al_fecha = al_fecha;
    }
    
}
