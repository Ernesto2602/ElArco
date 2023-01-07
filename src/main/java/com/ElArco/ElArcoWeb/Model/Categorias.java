package com.ElArco.ElArcoWeb.Model;
import lombok.*;
import jakarta.persistence.*;
//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name="categorias")
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cat_id")
    int cat_id;
    @Column(name="cat_nombre", nullable = false, unique = true, length = 50)
    String cat_nombre;
    @Column(name="cat_estatus")
    Boolean cat_estatus;
    //Constructor sin parametros 
    public Categorias() {
    }
    //Constructor con parametros 
    public Categorias(int cat_id, String cat_nombre, Boolean cat_estatus) {
        this.cat_id = cat_id;
        this.cat_nombre = cat_nombre;
        this.cat_estatus = cat_estatus;
    }
    
}
