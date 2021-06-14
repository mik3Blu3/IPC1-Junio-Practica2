package src;
import java.util.*;
//clase blackbuster
public class blackbuster {
    final int cantidadDatos = 2;
    //crando un Scanner que permita ingresar datos
    static Scanner entrada = new Scanner(System.in);
    //declarando arreglos
    public pelicula pelis[];
    public cliente clientes[];
    public prestamo prestamosPelis[];
    //constructor
    public blackbuster()
    {
        //logica
        int opcion = 0;
        while(opcion != 9)
        {
            System.out.println("\n---------------BIENVENIDO AL SISTEMA DE MEMORABILIA----------------------\n");
            System.out.println("Debera crear clientes y  despues peliculas antes de realizar cualquier otra accion!!!");
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
                    prestamosPelis();
                    System.out.println("");
                    System.out.println("Los prestamos actuales son: ");
                    System.out.println("");
                    mostrarPrestamosActivos();
                break;
                case 2:
                break;
                case 3:
                    System.out.println("A continuacion toda la info de las peliculas actuales:");
                    System.out.println("");
                    mostrarPelis();
                break;
                case 4:
                    crearPeliculas();
                    System.out.println("");
                    System.out.println("Rectificaremos los datos ingresados con respecto al id:");
                    System.out.println("");
                    compararIdPeliculas(pelis);
                break;
                case 5:
                break;
                case 6:
                    crearClientes();
                    System.out.println("");
                    System.out.println("Rectificaremos los datos ingresados con respecto al id:");
                    System.out.println("");
                    compararIdClientes(clientes);
                break;
                case 7:
                    System.out.println(" A continuacion toda la info de los clientes actuales: ");
                    System.out.println("");
                    mostrarClientes();
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
            entrada.skip("\n");
            System.out.println("Ingrese el Nombre de la pelicula: #"+(i+1));
            String nombrePeli = entrada.nextLine();
            System.out.println("Ingrese el Año de creacion de la pelicula: #"+(i+1));
            int anioPeli = entrada.nextInt();
            System.out.println("Ingrese la categoria de la Pelicula: #"+(i+1));
            String categoriaPeli = entrada.next();
            System.out.println("Ingrese el estado de disponibilidad de la pelicula: (1 = si / 0 = no) ");
            int disponibilidaPeli = entrada.nextInt();
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
            entrada.skip("\n");
            System.out.println("Ingrese nombre del cliente: #"+(i+1));
            String nombCl = entrada.nextLine();
            System.out.println("Ingrese el id del cliente: #"+(i+1));
            int idC = entrada.nextInt();
            System.out.println("Ingrese el telefolo del cliente: #"+(i+1));
            int telC = entrada.nextInt();
            System.out.println("Ingrese el estado de prestamos del cliente (1 = Si / 0 = no) : #"+(i+1));
            int estP = entrada.nextInt();
            clientes[i]= new cliente(nombCl, idC, telC, estP);        
        }
    }
    //metodo que permite comparar IDs de clientes
    public void compararIdClientes(cliente[] arreClienteO)
    {
        for(int i = 0 ; i<arreClienteO.length; i++)
        {
            if(i !=0)
            {
                for(int n =0; n<i; n++)
                {
                    if(((arreClienteO[i].getIdCliente() == arreClienteO[n].getIdCliente())))
                    {
                        System.out.println("EL ID del cliente en la posicion: "+(i)+" con nombre :"+arreClienteO[i-1].getNombreCLiente()+" Es el mismo que el que esta en la posicion "+(i+1)+" y nombre: "+arreClienteO[i].getNombreCLiente());
                        System.out.println("Porfavor edite el ID del segundo cliente");
                        System.out.println("Ingrese el nuevo ID del cliente");
                        int idAux = entrada.nextInt();
                        arreClienteO[n].setIdCliente(idAux);
                    } 
                }
            }
        }
        System.out.println("Todos los ID  de clientes  son correctos y son diferentes");
        System.out.println("");
    }
    //permite comparar los IDs de las peliculas y editar la segunda repetida
    public void compararIdPeliculas(pelicula[] arrePelisO)
    {
        for (int i =0; i<arrePelisO.length; i++)
        {
            if( i != 0)
            {
                for(int n =0; n<i; n++)
                {
                    if(arrePelisO[i].getId() == arrePelisO[n].getId())
                    {
                        System.out.println("El ID de la pelicula con nombre: "+arrePelisO[i-1].getNombre()+" es el mismo con la pelicula que lleva nombre: "+arrePelisO[i].getNombre());
                        System.out.println("Porfavor edite el ID de la segunda Pelicula: ");
                        int idAux = entrada.nextInt();
                        arrePelisO[n].setId(idAux);
                    }
                }
            }
        }
        System.out.println("Todos los ID  de peliculas  son correctos y son diferentes");
        System.out.println("");
    }
    //permite mostrar los clientes
    public void mostrarClientes()
    {
        for(int i =0 ;  i<clientes.length; i++)
        {
            System.out.println(clientes[i]);
        }
    }
    //permite mostrar las peliculas
    public void mostrarPelis()
    {
        for(int i =0; i<pelis.length; i++)
        {
            System.out.println(pelis[i]);
        }
    }

    public void prestamosPelis()
    {   
        System.out.println("Bienvenido al sistema de prestamos de peliculas dentro de nuestro actual inventario estan: (1 a "+cantidadDatos+") pelis disponibles");
        mostrarPelis();
        System.out.println("Desea realizar un prestamo??  ingrese (S/N) si-no");
        String opcionPrestamo = entrada.next();
        if(opcionPrestamo.equalsIgnoreCase("S"))
        {
            //creando nuestro arreglo para aceptar las transacciones
            prestamosPelis = new prestamo[cantidadDatos];
            for(int i = 0; i<prestamosPelis.length ; i++)
            {
                System.out.println("Ingrese el numero de pelicula que desea elegir: ");
                int eleccionNumeroPeli = entrada.nextInt();
                System.out.println("La peli seleccionada fue: ");
                System.out.println(pelis[eleccionNumeroPeli-1].getNombre());
                //pelis[eleccionNumeroPeli-1].setDisponibilidad(0);
                System.out.println("Durante cuantos dias desea reservarla?? ");
                int eleccionDiasPrestamo =entrada.nextInt();
                System.out.println("Los clientes con los que contamos son los siguientes: (1 a "+cantidadDatos+") clientes disponibles");
                mostrarClientes();
                System.out.println("Ingrese el numero de cliente al cual desea adjuntar el prestamo");
                int eleccionNumeroCliente = entrada.nextInt();
                System.out.println("El cliente seleccionado es: ");
                System.out.println(clientes[eleccionNumeroCliente-1].getNombreCLiente());
                //clientes[eleccionNumeroCliente-1].setPeliculaPrestada(1);
                //permite enviar a nuestro arreglo de prestamos la info de los clientes y pelicula enviada
                int estadoClientePrestamo = clientes[eleccionNumeroCliente-1].getPeliculasPrestadas();
                int estadoPeliPrestamo = pelis[eleccionNumeroPeli-1].getDisponibilidad();
                if((estadoClientePrestamo != 1) && (estadoPeliPrestamo == 1))
                {
                    pelis[eleccionNumeroPeli-1].setDisponibilidad(0);
                    clientes[eleccionNumeroCliente-1].setPeliculaPrestada(1);
                    System.out.println("TRANSACCION #"+(i+1)+" REALIZADA!");
                } 
                if(estadoClientePrestamo == 1 && estadoPeliPrestamo !=1)
                {
                    System.out.println("No se puede realizar la transaccion tiene un intento mas");
                    System.out.println("seleccione otro cliente ");
                }
                prestamosPelis[i] =new prestamo(pelis[eleccionNumeroPeli-1].getId(), clientes[eleccionNumeroCliente-1].getIdCliente(),eleccionDiasPrestamo,1);
            }
        }else{
            System.out.println("NO ACEPTO REALIZAR ALGUN PRESTAMO ");
        }
    }

    public void mostrarPrestamosActivos()
    {
        for(int i =0; i< prestamosPelis.length; i++)
        {
            System.out.println(prestamosPelis[i]);
        }
    }
}
