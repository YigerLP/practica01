package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
   
    
    private String nombre_estado;
    private String capital;
    private int poblacion;
    private String IND_costas;

    public Estado(){
        
    }

        public Estado(Long idEstado, String nombre_estado, String capital, int poblacion, String IND_costas) {
        this.idEstado = idEstado;
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.IND_costas = IND_costas;
    }
}

