package es.uca.dss.agoratech;

import java.util.Date;

// class Reserva {
//     -id:int
//     -fechaRecogida:Date
//     -fechaDevolucion:Date
//     -cliente:Cliente
//     -vehiculo:Vehiculo
//     -estado:String
// }

public class Reserva {
     private int id;
     private Date fechaRecogida;
     private Date fechaDevolucion;
     private Cliente cliente;
     private Vehiculo vehiculo;
     private String estado;
     
     public Reserva() {
     }
     
     public Reserva(int id, Date fechaRecogida, Date fechaDevolucion, Cliente cliente, Vehiculo vehiculo, String estado) {
          this.id = id;
          this.fechaRecogida = fechaRecogida;
          this.fechaDevolucion = fechaDevolucion;
          this.cliente = cliente;
          this.vehiculo = vehiculo;
          this.estado = estado;
     }
     
     public int getId() {
          return id;
     }
     
     public void setId(int id) {
          this.id = id;
     }
     
     public Date getFechaRecogida() {
          return fechaRecogida;
     }
     
     public void setFechaRecogida(Date fechaRecogida) {
          this.fechaRecogida = fechaRecogida;
     }
     
     public Date getFechaDevolucion() {
          return fechaDevolucion;
     }
     
     public void setFechaDevolucion(Date fechaDevolucion) {
          this.fechaDevolucion = fechaDevolucion;
     }
     
     public Cliente getCliente() {
          return cliente;
     }
     
     public void setCliente(Cliente cliente) {
          this.cliente = cliente;
     }
     
     public Vehiculo getVehiculo() {
          return vehiculo;
     }
     
     public void setVehiculo(Vehiculo vehiculo) {
          this.vehiculo = vehiculo;
     }
     
     public String getEstado() {
          return estado;
     }
     
     public void setEstado(String estado) {
          this.estado = estado;
     }
}
