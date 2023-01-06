package com.ElArco.ElArcoWeb.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "niveles")
public class Niveles 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ni_id")
    int ni_id;
    @Column(name = "ni_nivel")
    String ni_nivel;
     //Constructor sin parametros 
     public Niveles()
     {   
     }
     //Constructor con parametros 
    public Niveles(int ni_id, String ni_nivel) {
        this.ni_id = ni_id;
        this.ni_nivel = ni_nivel;
    }
}
