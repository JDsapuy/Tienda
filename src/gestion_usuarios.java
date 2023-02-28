import java.sql.*;
import java.util.ArrayList;

public class gestion_usuarios {
    Conexion con=new Conexion();
    private ArrayList<usuarios> datos=new ArrayList<>();
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet res=null;
    Connection conec=null;

    public ArrayList<usuarios> consultarusuarios(){
        try {
            String sql = "Select * from usuarios";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                usuarios usu = new usuarios(res.getInt(1), res.getString(2), res.getString(3), res.getString(4),res.getString(5));
                datos.add(usu);
            }
        }catch (SQLException ex) {
            System.out.println("Error al consultar; "+ex);
        }

        return datos;

    }
}
