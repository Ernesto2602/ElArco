package com.ElArco.ElArcoWeb.Model;

import jakarta.persistence.*;
import lombok.*;

//Anotaciones para que se generen los metodos Setters y Getters usando la dependencia lombok
@Getter
@Setter
@Entity
@Table(name="proveedores")
public class Proveedores
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pr_id")
    int pr_id;
    @Column(name = "pr_empresa", nullable = false, length = 50)
    String pr_empresa;
    @Column(name = "pr_encargado", nullable = false, length = 80)
    String pr_encargado;
    @Column(name = "pr_numero", nullable = false, length = 10)
    String pr_numero;
    @Column(name = "pr_correo", nullable = false, length = 200)
    String pr_correo;
    @Column(name = "pr_estatus")
    Boolean pr_estatus;
     //Constructor sin parametros 
    public Proveedores() {
    }
    //Constructor con parametros 
    public Proveedores(int pr_id, String pr_empresa, String pr_encargado, String pr_numero, String pr_correo,
            Boolean pr_estatus) {
        this.pr_id = pr_id;
        this.pr_empresa = pr_empresa;
        this.pr_encargado = pr_encargado;
        this.pr_numero = pr_numero;
        this.pr_correo = pr_correo;
        this.pr_estatus = pr_estatus;
    }
    
}
