package src;

public class cliente {
    private String nombreCliente;
    private int idCliente;
    private int telefonoCliente;
    private boolean peliculasEnPrestamo;
(
    public cliente(String nombre, int idC, int telC, boolean pelisPrestamo)
    {
        //dandole valor a los atributos asignandole los parametros que recibira el constructor
        this.nombreCliente = nombre;
        this.idCliente = idC;
        this.telefonoCliente = telC;
        this.peliculasEnPrestamo = pelisPrestamo;
    }
}
