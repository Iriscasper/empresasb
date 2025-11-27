package com.companyname.empresasb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="empleados")
@Data
public class Empleado {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;

    @Column(length=9, nullable=false, unique = true)
    public String dni;

    public String nombre;

    @Column(length=1)
    public char sexo;

    public int anyos;

    private int categoria;

    public Empleado() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDni() { return dni; }

    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public char getSexo() { return sexo; }

    public void setSexo(char sexo) { this.sexo = sexo; }

    public int getAnyos() { return anyos; }

    public void setAnyos(int anyos) {
        this.anyos = Math.max(anyos, 0);
    }

    public int getCategoria() { return categoria; }

    public void setCategoria(int categoria) {
        if (categoria <= 10 && categoria > 0) {
            this.categoria = categoria;
        } else this.categoria = 1;
    }

}
