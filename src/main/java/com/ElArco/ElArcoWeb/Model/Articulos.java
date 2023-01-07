package com.ElArco.ElArcoWeb.Model;

import jakarta.persistence.*;
import lombok.*;
//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name="articulos")
public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ar_id")
    int ar_id;
    @Column(name="ar_codigo",nullable = false ,unique = true, length = 20)
    int ar_codigo;
    @Column(name="ar_nombre", nullable = false, unique = true, length = 80)
    String ar_nombre;
    @Column(name="ar_marca", nullable = false, length = 50)
    String ar_marca;
    @Column(name="ar_precio", nullable = false)
    float ar_precio; 
    @ManyToOne
    @JoinColumn(name="ar_proveedor")
    Proveedores ar_proveedores;
    @ManyToOne
    @JoinColumn(name = "ar_categoria")
    Categorias ar_categorias;
    @Column(name="ar_estatus")
    Boolean ar_estatus;
    //Constructor sin parametros 
    public Articulos() {
    }
    //Constructor con parametros 
    public Articulos(int ar_id, int ar_codigo, String ar_nombre, String ar_marca, float ar_precio,
            Proveedores ar_proveedores, Categorias ar_categorias, Boolean ar_estatus) {
        this.ar_id = ar_id;
        this.ar_codigo = ar_codigo;
        this.ar_nombre = ar_nombre;
        this.ar_marca = ar_marca;
        this.ar_precio = ar_precio;
        this.ar_proveedores = ar_proveedores;
        this.ar_categorias = ar_categorias;
        this.ar_estatus = ar_estatus;
    }
}
