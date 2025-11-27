package com.companyname.empresasb.repository;

import com.companyname.empresasb.model.Nomina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NominaRepository extends JpaRepository<Nomina,Integer> {
    Optional<Nomina> findByEmpleadoDniIgnoreCase(String dni);
}
