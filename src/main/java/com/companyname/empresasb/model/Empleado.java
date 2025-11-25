package com.companyname.empresasb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="EMPLEADOS")
@Data
public class Empleado {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long id;

    @Column(length=9, nullable=false, unique = true)
    public String dni;

    public String nombre;

    @Column(length=1)
    public char sexo;

    public int anyos;

    private int categoria;



}
