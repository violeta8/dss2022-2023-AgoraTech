package es.uca.dss.agoratech;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests de la clase Autocaravanas
 */
public class AutocaravanasTests
{
    @Test
	public void testReserva()
	{
		Reserva reserva = new Reserva();
		reserva.setId(1);
		reserva.setFechaRecogida(new Date());
		reserva.setFechaDevolucion(new Date());
		reserva.setCliente(new Cliente());
		reserva.setVehiculo(new Vehiculo());
		reserva.setEstado("Pendiente");
		
		assertTrue(reserva.getId() == 1);
		assertTrue(reserva.getFechaRecogida() != null);
		assertTrue(reserva.getFechaDevolucion() != null);
		assertTrue(reserva.getCliente() != null);
		assertTrue(reserva.getVehiculo() != null);
		assertTrue(reserva.getEstado() == "Pendiente");
	}
	
	@Test
	public void testCliente()
	{
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Pepe");
		cliente.setTelefono("666666666");
		cliente.setEmail("pepe@pepe.pepe");
        cliente.setDireccion("Calle de Pepe");
		
		assertTrue(cliente.getId() == 1);
		assertTrue(cliente.getNombre() == "Pepe");
		assertTrue(cliente.getTelefono() == "666666666");
		assertTrue(cliente.getEmail() == "pepe@pepe.pepe");
        assertTrue(cliente.getDireccion() == "Calle de Pepe");
    }

    @Test
    public void testVehiculo()
    {
        Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMatricula("1234");
		vehiculo.setTipo("Caravana");
		vehiculo.setCapacidad(4);
		vehiculo.setPrecio(100);
		
		assertTrue(vehiculo.getMatricula() == "1234");
		assertTrue(vehiculo.getTipo() == "Caravana");
		assertTrue(vehiculo.getCapacidad() == 4);
		assertTrue(vehiculo.getPrecio() == 100);
    }
}