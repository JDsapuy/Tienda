import java.sql.*;
import java.util.ArrayList;

public class gestion_clientes {
    Conexion con=new Conexion();
    private ArrayList<clientes> datos=new ArrayList<>();
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet res=null;
    Connection conec=null;

    public ArrayList<clientes> consultarclientes(){
        try {
            String sql = "Select * from clientes";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                clientes cli = new clientes(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
                datos.add(cli);
            }
        }catch (SQLException ex) {
            System.out.println("Error al consultar; "+ex);
        }

        return datos;

    }
}
