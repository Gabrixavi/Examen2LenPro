package hn.unah.vehiculos.Servicios;

import hn.unah.vehiculos.Modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public Cliente obtenerCliente();

    public Cliente obteneridCliente(Cliente idCliente);
    
}
