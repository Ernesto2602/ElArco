package com.ElArco.ElArcoWeb.Model;
import lombok.*;
import jakarta.persistence.*;
//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name="datosempresa")
public class DatosDeLaEmpresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "de_id")
    int de_id;
    @Column(name = "de_nombre", nullable = false, length = 50)
    String de_nombre;
    @Column(name = "de_gerente", nullable = false, length = 80)
    String de_gerente;
    @Column(name = "de_correo", nullable = false, length = 200)
    String de_correo;
    @Column(name = "de_direccion", nullable = false, length = 100)
    String de_direccion;
    @Column(name = "de_telefono", nullable = false, length = 10)
    String de_telefono;
    @Column(name = "de_instagram", length = 50)
    String de_instagram;
    @Column(name = "de_facebook", length = 50)
    String de_facebook;
    //Constructor sin parametros
    public DatosDeLaEmpresa() {
    }
     //Constructor con parametros
    public DatosDeLaEmpresa(int de_id, String de_nombre, String de_gerente, String de_correo, String de_direccion,
            String de_telefono, String de_instagram, String de_facebook) {
        this.de_id = de_id;
        this.de_nombre = de_nombre;
        this.de_gerente = de_gerente;
        this.de_correo = de_correo;
        this.de_direccion = de_direccion;
        this.de_telefono = de_telefono;
        this.de_instagram = de_instagram;
        this.de_facebook = de_facebook;
    }
    
}