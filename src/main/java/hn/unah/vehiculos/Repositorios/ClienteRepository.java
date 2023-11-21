package hn.unah.vehiculos.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.vehiculos.Modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

    
}
