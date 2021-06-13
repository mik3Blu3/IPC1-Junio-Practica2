package src;

public class cliente {
    //atributos de nuestro cliente
    private String nombreCliente;
    private int idCliente;
    private int telefonoCliente;
    private boolean peliculasEnPrestamo;
    //constructor de clientes
    public cliente(String nombre, int idC, int telC, boolean pelisPrestamo)
    {
        //dandole valor a los atributos asignandole los parametros que recibira el constructor
        this.nombreCliente = nombre;
        this.idCliente = idC;
        this.telefonoCliente = telC;
        this.peliculasEnPrestamo = pelisPrestamo;
    }
    //metodo que devuelve el nombre del cliente
    public String getNombreCLiente()
    {
        return nombreCliente;
    }
    //metodo que permite almacenar el nombre de nuestro cliente
    public void setNombreCliente(String nombC)
    {
        nombreCliente = nombC;
    }
    //metodo que devuelve el id del cliente
    public int getIdCliente()
    {
        return idCliente;
    }
    //metodo que permite almacenar el id del cliente
    public void setIdCliente(int idC)
    {
        idCliente = idC;
    }
    //metodo que devuelve el telefono del cliente
    public int getTelefonoCliente()
    {
        return telefonoCliente;
    }
    //metodo que permite almacenar el numero del cliente
    public void setTelefonoCliente(int telefC)
    {
        telefonoCliente = telefC;
    }
    //metodo que devuelve el estado de los prestamos de peliculas
    public boolean getPeliculasPrestadas()
    {
        return peliculasEnPrestamo;
    }
    // metodo que permite almacenar el estado de prestamo de peliculas
    public void setPeliculaPrestada(boolean estadoPeliculaPrestada)
    {
        peliculasEnPrestamo = estadoPeliculaPrestada;
    }
}
