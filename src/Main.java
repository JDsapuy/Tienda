import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       /* Conexion ejemplo=new Conexion();
        ejemplo.Conecta();
        System.out.println("Continuando con mi base de datos"); */

       /* gestion_empleado gestion=new gestion_empleado();
        ArrayList<empleado> restultado=new ArrayList<>();
        restultado=gestion.consultarEmpleados();
        for (empleado r: restultado){

            System.out.println(r.toString());

        } */

        int opc = 0;
        while (opc != 7) {
            System.out.println("Eliga una opcion a consultar: \n1.clientes \n2.d_ventas \n3.productos \n4.proveedores \n5.usuarios \n6.ventas \n7.Salir");
            opc = entrada.nextInt();
            if (opc == 1) {
                gestion_clientes gestion = new gestion_clientes();
                ArrayList<clientes> restultado = new ArrayList<>();
                restultado = gestion.consultarclientes();
                for (clientes r : restultado) {

                    System.out.println(r.toString());
                }
            } else if (opc == 2) {
                gestion_detalle_ventas gestion = new gestion_detalle_ventas();
                ArrayList<detalle_ventas> resultado = new ArrayList<>();
                resultado = gestion.consultard_ventas();
                for (detalle_ventas r : resultado) {
                    System.out.println(r);
                }

            } else if (opc == 3) {
                gestion_productos gestion = new gestion_productos();
                ArrayList<productos> resultado = new ArrayList<>();
                resultado = gestion.consultarproductos();
                for (productos r : resultado) {
                    System.out.println(r);
                }
            } else if (opc == 4) {
                gestion_proveedores gestion = new gestion_proveedores();
                ArrayList<proveedores> resultado = new ArrayList<>();
                resultado = gestion.consultar_proveedores();
                for (proveedores r : resultado) {
                    System.out.println(r);
                }
            } else if (opc == 5) {
                    gestion_usuarios gestion = new gestion_usuarios();
                    ArrayList<usuarios> resultado = new ArrayList<>();
                    resultado = gestion.consultarusuarios();
                    for (usuarios r : resultado) {
                        System.out.println(r);
                    }
            } else if (opc == 6) {
                        gestion_ventas gestion = new gestion_ventas();
                        ArrayList<ventas> resultado = new ArrayList<>();
                        resultado = gestion.consultar_ventas();
                        for (ventas r : resultado) {
                            System.out.println(r);
                        }
            } else if (opc == 7) {
                            System.out.println("----");
                        }
        }
    }
}