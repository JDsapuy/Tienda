import java.sql.*;
import java.util.ArrayList;

public class gestion_ventas {
    Conexion con=new Conexion();
    private ArrayList<ventas> datos=new ArrayList<>();
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet res=null;
    Connection conec=null;

    public ArrayList<ventas> consultar_ventas(){
        try {
            String sql = "Select * from ventas";
            conec = con.Conecta();
            st = conec.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                ventas ven = new ventas(res.getInt(1), res.getInt(2), res.getInt(3), res.getDouble(4),res.getDouble(5), res.getDouble(6));
                datos.add(ven);
            }
        }catch (SQLException ex) {
            System.out.println("Error al consultar; "+ex);
        }

        return datos;

    }

    public int d_ventas(int iva, int codigo_venta){
        if(iva==1){
            try{
                conec=con.Conecta();
                String sql="select sum(valor_venta) from detalle_ventas where codigo_venta=?";
                ps= conec.prepareStatement(sql);
                ps.setInt(1, codigo_venta);
                res=ps.executeQuery();
                while(res.next()){
                    int d_ventas=res.getInt(1);
                }
            }catch (SQLException ex) {
                System.out.println("Error al consultar: " + ex);
            }
        }else if(iva==2){
            try{
                String sql="select sum(valor_total) from detalle_ventas where codigo_venta=?";
                conec=con.Conecta();
                st=conec.createStatement();
                res=st.executeQuery(sql);
                while(res.next()){
                    int d_ventas=res.getInt(1);
                }
            }catch (SQLException ex) {
                System.out.println("Error al consultar: " + ex);
            }
        }
        return ven;
    }

}
