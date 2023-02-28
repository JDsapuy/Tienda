import java.sql.*;
import java.util.ArrayList;

public class gestion_productos {
    Conexion con=new Conexion();
    private ArrayList<productos> datos=new ArrayList<>();
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet res=null;
    Connection conec=null;

    public ArrayList<productos> consultarproductos(){
        try {
            String sql = "Select * from productos";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                productos produc = new productos(res.getInt(1), res.getDouble(2), res.getString(3), res.getString(4), res.getDouble(5), res.getDouble(6));
                datos.add(produc);
            }
        }catch (SQLException ex) {
            System.out.println("Error al consultar; "+ex);
        }

        return datos;

    }
    public productos consultarnit(String nit_proveedor){
        productos produc=null;
        try{
            conec=con.Conecta();
            String sql="select * from productos where  nit_proveedor=?";
            ps= conec.prepareStatement(sql);
            ps.setString(1, nit_proveedor);
            res=ps.executeQuery();
            while (res.next()){
                produc = new productos(res.getInt(1), res.getDouble(2), res.getString(3), res.getString(4), res.getDouble(5), res.getDouble(6));
                datos.add(produc);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return produc;

    }


}



