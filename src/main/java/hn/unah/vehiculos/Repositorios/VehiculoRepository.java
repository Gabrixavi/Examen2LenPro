package hn.unah.vehiculos.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.vehiculos.Modelos.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo,Integer>{
    
}
