import java.sql.*;
import java.util.ArrayList;

public class gestion_detalle_ventas {
    Conexion con=new Conexion();
    private ArrayList<detalle_ventas> datos=new ArrayList<>();
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet res=null;
    Connection conec=null;

    public ArrayList<detalle_ventas> consultard_ventas(){
        try {
            String sql = "Select * from detalle_ventas";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                detalle_ventas d_ven = new detalle_ventas(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4), res.getDouble(5), res.getDouble(6), res.getDouble(7));
                datos.add(d_ven);
            }
        }catch (SQLException ex) {
            System.out.println("Error al consultar; "+ex);
        }

        return datos;

    }

    public detalle_ventas ConsultarProductosVenta(String codigo_venta){
        detalle_ventas d_ven=null;
        try{
            conec=con.Conecta();
            String sql="select productos.codigo_producto, productos.nombre_producto from productos, detalle_ventas  where productos.codigo_producto=detalle_ventas.codigo_producto and detalle_Ventas.codigo_venta=?";
            ps= conec.prepareStatement(sql);
            ps.setString(1,codigo_venta);
            res=ps.executeQuery();
            while(res.next()){
                d_ven = new detalle_ventas(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4), res.getDouble(5), res.getDouble(6), res.getDouble(7));
                datos.add(d_ven);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar: "+ex);
        }
        return d_ven;

    }


}



