package es.uca.dss.agoratech;

//class Cliente {
//     -id:int
//     -nombre:String
//     -telefono:String
//     -email:String
//     -direccion:String
// }

public class Cliente {
     private int id;
     private String nombre;
     private String telefono;
     private String email;
     private String direccion;
     
     public Cliente() {
     }
     
     public Cliente(int id, String nombre, String telefono, String email, String direccion) {
          this.id = id;
          this.nombre = nombre;
          this.telefono = telefono;
          this.email = email;
          this.direccion = direccion;
     }
     
     public int getId() {
          return id;
     }
     
     public void setId(int id) {
          this.id = id;
     }
     
     public String getNombre() {
          return nombre;
     }
     
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     
     public String getTelefono() {
          return telefono;
     }
     
     public void setTelefono(String telefono) {
          this.telefono = telefono;
     }
     
     public String getEmail() {
          return email;
     }
     
     public void setEmail(String email) {
          this.email = email;
     }
     
     public String getDireccion() {
          return direccion;
     }
     
     public void setDireccion(String direccion) {
          this.direccion = direccion;
     }
}
