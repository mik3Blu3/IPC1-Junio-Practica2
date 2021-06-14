package src;
import java.util.*;
public class prestamo {

    //atributos
    private String nombreClienteSolicita;
    private String nombrePeliSolicitadaP;
    private int idPeliculaPrestada;
    private int idClienteSolicitante;
    private int diasPrestamo;
    private int cantidadVecesPrestada=0;

    //SCANNER
    Scanner entrada = new Scanner(System.in);
    //constructor 
    public prestamo(String nombreClientePrestamo, String nombrePeliPrestamo,int idPeliP, int idClienS, int dias,int vecesPrestada)
    {   
        //permite igualar atributos a parametros que seran recibidos por el constructor
        this.nombreClienteSolicita = nombreClientePrestamo;
        this.nombrePeliSolicitadaP = nombrePeliPrestamo;
        this.idPeliculaPrestada = idPeliP ;
        this.idClienteSolicitante = idClienS;
        this.diasPrestamo = dias;
        this.cantidadVecesPrestada=vecesPrestada;
    }
    //permite devolver el nombre del cliente solicitante
    public String getNombreClienteSolicitante()
    {
        return nombreClienteSolicita;
    }
    //permite recibir o modificar el nombre del cliente que solicita el prestamo
    public void setNombreClienteSolicitante(String nombreClienteInsertar)
    {
        this.nombreClienteSolicita = nombreClienteInsertar;
    }
    //permite devolver el nombre de la pelicula que se solicita para prestamo
    public String getNombrePeliculaSolicitada()
    {
        return nombrePeliSolicitadaP;
    }
    //permite almacenar el nombre de la pelicula o modificarlo 
    public void setNombrePeliculaSolicitada(String nombrePeliculaInsertar)
    {
        this.nombrePeliSolicitadaP = nombrePeliculaInsertar;
    }
    //permite devolver los IDS de peliculas prestadas;
    public int getIdPeliPrestada()
    {
        return idPeliculaPrestada;
    }
    //metodo que permite almacenar nuevos ids de peliculas prestadas
    public void setIdPeliPrestada(int idPeliculasPrestada)
    {
        this.idPeliculaPrestada = idPeliculasPrestada;
    }
    //permite devolver los IDS de clientes que tengan  prestadas pelis;
    public int getIdClientePeli()
    {
        return idClienteSolicitante;
    }
    //metodo que permite almacenar nuevos ids de clientes que prestan pelis
    public void setIdClienteSolicitante(int idClienteSoli)
    {
        this.idClienteSolicitante = idClienteSoli;
    }
    //metodo que permite retornar los dias de prestamo
    public int getdiasDePrestamoPelis()
    {
        return diasPrestamo;
    }
    //metodo que permite ingresar los dias de prestamo para ser almacenados
    public void setDiasDePrestamo(int diasPP)
    {
        this.diasPrestamo = diasPP;
    }
    //metodo que permite retornar las veces que ha sido solicitada
    public int getVecesSolicitada()
    {
        return cantidadVecesPrestada;
    }
    public void setVecesSolicitada(int cantidadAsumarS)
    {
        this.cantidadVecesPrestada =this.cantidadVecesPrestada+cantidadAsumarS;
    }

    //PERMITE VISUALIZAR LOS ATRIBUTOS DE MI OBJETO ALMACENADOS EN EL ARRAY 
    @Override
    public String toString()
    {
        return " ID PELICULA PRESTADA: "+idPeliculaPrestada+" Con Nombre: "+nombrePeliSolicitadaP+" ID CLIENTE QUE ACTIVA PRESTAMO: "+idClienteSolicitante+" Con Nombre: "+nombreClienteSolicita+" DIAS DE SOLICITUD DE PRESTAMO: "+diasPrestamo+" dias y con una cantidad de veces solicitada: "+cantidadVecesPrestada;
    }

}
