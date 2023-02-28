import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String bd="tiendagenerica";
    private String url="jdbc:mysql://localhost:3306/"+bd;
    private String user="root";
    private String pass="";

    Connection conec=null;

    public Connection Conecta(){  //Se si se va a retornar con Connection

        try{

            conec= DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion Ok");

        }catch(SQLException e){
            System.out.println("Error en la conexion "+e);
        }

        return conec;  //Tiene que ser del mismo valor "Connection"

    }

}
