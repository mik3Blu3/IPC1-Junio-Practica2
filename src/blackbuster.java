package src;
import java.util.*;
//clase blackbuster
public class blackbuster {
    final int cantidadDatos = 30;
    //crando un Scanner que permita ingresar datos
    static Scanner entrada = new Scanner(System.in);
    //declarando arreglos
    public pelicula pelis[];
    public cliente clientes[];
    //constructor
    public blackbuster()
    {
        //logica
        int opcion = 0;
        while(opcion != 9)
        {
            System.out.println("\n---------------BIENVENIDO AL SISTEMA DE MEMORABILIA----------------------\n");
            System.out.println("Debera crear clientes y peliculas antes de realizar cualquier otra accion!!!");
            System.out.println("______Las opciones son las siguientes_______");
            System.out.println("|1)*************PRESTAMOS PELIS*************|");
            System.out.println("|2)*************DEVOLUCION PELIS************|");
            System.out.println("|3)*************MOSTRAR PELICULAS***********|");
            System.out.println("|4)*************INGRESO DE PELIS************|");
            System.out.println("|5)*************ORDENAR PELIS***************|");
            System.out.println("|6)*************INGRESAR CLIENTES***********|");
            System.out.println("|7)*************MOSTRAR CLIENTES************|");
            System.out.println("|8)*************REPORTES********************|");
            System.out.println("|9)*************SALIR***********************|");
            System.out.println("|___________________________________________|");
            System.out.println("Ingrese la opcion que desea escoger");
            int opcionEscogida = entrada.nextInt();
            switch(opcionEscogida)
            {
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                        crearClientes();
                break;
                case 7:
                break;
                case 8:
                break;
                case 9:
                        opcion = opcionEscogida;
                break;
                default:
                        System.out.println("INGRESE UNA OPCION VALIDA!!!");
                break;            }
        }
    }
    public void crearPeliculas()
    {
        // metod que crea el arreglo de clientes nuevos
        pelis = new pelicula[cantidadDatos];
        for(int i =0 ;  i< clientes.length ; i++)
        {
            System.out.println("Ingrese el ID de la pelicula: #"+(i+1));
            int idPeli = entrada.nextInt();
            System.out.println("Ingrese el Nombre de la pelicula: #"+(i+1));
            String nombrePeli = entrada.nextLine();
            System.out.println("Ingrese el Año de creacion de la pelicula: #"+(i+1));
            int anioPeli = entrada.nextInt();
            System.out.println("Ingrese la categoria de la Pelicula: #"+(i+1));
            String categoriaPeli = entrada.nextLine();
            System.out.println("Ingrese el estado de disponibilidad de la pelicula: ");
            boolean disponibilidaPeli = entrada.nextBoolean();
            pelis[i]= new pelicula(idPeli, nombrePeli, anioPeli, categoriaPeli, disponibilidaPeli);        
        }
    }
    //metodo que permite crear clientes nuevos
    public void crearClientes()
    {
        //crea el arreglo de clientes
        clientes = new cliente[cantidadDatos];
        for(int i =0 ;  i< clientes.length ; i++)
        {
            System.out.println("Ingrese nombre del cliente: #"+(i+1));
            String nombCl = entrada.nextLine();
            System.out.println("Ingrese el id del cliente: #"+(i+1));
            int idC = entrada.nextInt();
            System.out.println("Ingrese el telefolo del cliente: #"+(i+1));
            int telC = entrada.nextInt();
            System.out.println("Ingrese el estado de prestamos del cliente: #"+(i+1));
            boolean estP = entrada.nextBoolean();
            clientes[i]= new cliente(nombCl, idC, telC, estP);        
        }
    }
    public void compararClientes(cliente[] arreClienteO)
    {
        for(int i = 0 ; i<arreClienteO.length ; i++)
        {
            if(arreClienteO[i].getIdCliente() == arreClienteO[i+1].getIdCliente())
            {
                System.out.println("EL ID del cliente en la posicion: "+(i+1)+" con nombre :"+arreClienteO[i].getNombreCLiente()+" Es el mismo que el que esta en la posicion "+(i+2)+" y nombre: "+arreClienteO[i+1].getNombreCLiente());
                System.out.println("Porfavor edite el ID del segundo cliente");
                System.out.println("Ingrese el nuevo ID del cliente");
                int idAux = entrada.nextInt();
                arreClienteO[i+1].setIdCliente(idAux);
            }else
            {
                System.out.println("Todos los ID  de clientes  son correctos y son diferentes");
            }
        }
    }
}
