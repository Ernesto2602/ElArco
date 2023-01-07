package com.ElArco.ElArcoWeb.Model;
import lombok.*;
import java.util.Date;
import jakarta.persistence.*;
//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name="ventasgen")
public class VentasGenerales{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vg_folio")
    int vg_folio;
    @Column(name = "vg_total", nullable = false)
    float vg_total;
    @Column(name = "vg_fecha")
    Date vg_fecha;
    //Constructor sin parametros
    public VentasGenerales() {
    }
    //Constructor con parametros
    public VentasGenerales(int vg_id, float vg_total, Date vg_fecha) {
        this.vg_folio = vg_id;
        this.vg_total = vg_total;
        this.vg_fecha = vg_fecha;
    }
    
}