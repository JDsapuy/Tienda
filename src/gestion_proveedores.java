import java.sql.*;
import java.util.ArrayList;

public class gestion_proveedores {
    Conexion con=new Conexion();
    private ArrayList<proveedores> datos=new ArrayList<>();
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet res=null;
    Connection conec=null;

    public ArrayList<proveedores> consultar_proveedores(){
        try {
            String sql = "Select * from proveedores";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                proveedores provee = new proveedores(res.getString(1), res.getString(2), res.getString(3), res.getString(4));
                datos.add(provee);
            }
        }catch (SQLException ex) {
            System.out.println("Error al consultar; "+ex);
        }

        return datos;

    }
}
