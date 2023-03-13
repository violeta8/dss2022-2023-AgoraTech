package es.uca.dss.agoratech;

/*
    class Vehiculo {
        -matricula:String
        -tipo:String
        -capacidad:int
        -precio:double
    }
*/

public class Vehiculo
{
    private String matricula;
    private String tipo;
    private int capacidad;
    private double precio;

    public Vehiculo()
    {
    }

    public Vehiculo(String matricula, String tipo, int capacidad, double precio)
    {
        this.matricula = matricula;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public int getCapacidad()
    {
        return capacidad;
    }

    public void setCapacidad(int capacidad)
    {
        this.capacidad = capacidad;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
}