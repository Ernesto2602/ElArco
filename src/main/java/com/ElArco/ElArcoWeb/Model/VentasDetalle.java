package com.ElArco.ElArcoWeb.Model;
import lombok.*;
import jakarta.persistence.*;
//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name = "ventasdet")
public class VentasDetalle {
    @ManyToOne
    @JoinColumn(name = "vd_folio")
    VentasGenerales vd_folio;
    @ManyToOne
    @JoinColumn(name = "vd_articulos")
    Articulos vd_articulos;
    @Column(name="vd_vendedor", nullable = false, length = 80)
    String vd_vendedor;
    @Column(name = "vd_total", nullable = false)
    float vd_total;
    //Constructor sin parametros
    public VentasDetalle() {
    }
    //Constructor con parametros
    public VentasDetalle(VentasGenerales vd_folio, Articulos vd_articulos, String vd_vendedor, float vd_total) {
        this.vd_folio = vd_folio;
        this.vd_articulos = vd_articulos;
        this.vd_vendedor = vd_vendedor;
        this.vd_total = vd_total;
    } 
}
