package es.uca.dss.agoratech;

// class Autocaravanas {
//     +consultarDisponibilidad(fechaRecogida:Date, fechaDevolucion:Date): List<Vehiculo>
//     +registrarCliente(cliente:Cliente): void
//     +editarDatosCliente(idCliente:int, datos:Map<String,String>): void
//     +consultarDatosCliente(idCliente:int): Cliente
//     +realizarReserva(reserva:Reserva): void
//     +cancelarReserva(idReserva:int): void
//     +consultarReservas(idCliente:int): List<Reserva>
//     +checkIn(idReserva:int): void
//     +checkOut(idReserva:int): void
//     +registrarVehiculo(vehiculo:Vehiculo): void
//     +editarDatosVehiculo(matricula:String, datos:Map<String,String>): void
//     +consultarDatosVehiculo(matricula:String): Vehiculo
// }

public class Autocaravanas {
    public List<Vehiculo> consultarDisponibilidad(Date fechaRecogida, Date fechaDevolucion) {
        List<Vehiculo> lista = new ArrayList<Vehiculo>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getDisponible()) {
                lista.add(vehiculo);
            }
        }
        return lista;
    }

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void editarDatosCliente(int idCliente, Map<String, String> datos) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                cliente.setNombre(datos.get("nombre"));
                cliente.setApellidos(datos.get("apellidos"));
                cliente.setDni(datos.get("dni"));
                cliente.setDireccion(datos.get("direccion"));
                cliente.setTelefono(datos.get("telefono"));
                cliente.setEmail(datos.get("email"));
            }
        }
    }

    public Cliente consultarDatosCliente(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public void realizarReserva(Reserva reserva) {
        listaReservas.add(reserva);
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(reserva.getVehiculo().getMatricula())) {
                vehiculo.setDisponible(false);
            }
        }
    }

    public void cancelarReserva(int idReserva) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == idReserva) {
                for (Vehiculo vehiculo : listaVehiculos) {
                    if (vehiculo.getMatricula().equals(reserva.getVehiculo().getMatricula())) {
                        vehiculo.setDisponible(true);
                    }
                }
                listaReservas.remove(reserva);
            }
        }
    }

    public List<Reserva> consultarReservas(int idCliente) {
        List<Reserva> lista = new ArrayList<Reserva>();
        for (Reserva reserva : listaReservas) {
            if (reserva.getCliente().getId() == idCliente) {
                lista.add(reserva);
            }
        }
        return lista;
    }

    public void checkIn(int idReserva) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == idReserva) {
                reserva.setEstado("checkIn");
            }
        }
    }

    public void checkOut(int idReserva) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == idReserva) {
                reserva.setEstado("checkOut");
            }
        }
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public void editarDatosVehiculo(String matricula, Map<String, String> datos) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setMarca(datos.get("marca"));
                vehiculo.setModelo(datos.get("modelo"));
                vehiculo.setCapacidad(datos.get("capacidad"));
                vehiculo.setPrecio(datos.get("precio"));
            }
        }
    }

    public Vehiculo consultarDatosVehiculo(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }
}