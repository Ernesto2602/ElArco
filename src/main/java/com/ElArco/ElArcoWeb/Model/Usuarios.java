package com.ElArco.ElArcoWeb.Model;

import jakarta.persistence.*;
import lombok.*;

    //Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter 
@Setter
@Entity
@Table(name="usuarios")
public class Usuarios 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="us_id")
    int us_id;
    @Column(name= "us_usuario", nullable = false, unique = true,length = 50)
    String us_usuario;
    @Column(name="us_contraseña", nullable = false, length = 20)
    String us_contraseña;
    @ManyToOne
    @JoinColumn(name = "us_nivel")
    Niveles us_nivel;
    //Constructor sin parametros 
    public Usuarios()
    {
    }
    //Constructor con parametros 
    public Usuarios(int us_id, String us_usuario, String us_contraseña, Niveles us_nivel) {
        this.us_id = us_id;
        this.us_usuario = us_usuario;
        this.us_contraseña = us_contraseña;
        this.us_nivel = us_nivel;
    }
}
