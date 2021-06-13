package src;
import java.util.*;
//clase blackbuster
public class blackbuster {
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
            System.out.println("\n--------BIENVENIDO AL SISTEMA DE MEMORABILIA------\n");
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
}
