public class ventas {
    private int codigo_venta;
    private int cedula_cliente;
    private int cedula_usuario;
    private Double iva_venta;
    private Double total_venta;
    private Double valor_venta;

    public ventas(int codigo_venta, int cedula_cliente, int cedula_usuario, Double iva_venta, Double total_venta, Double valor_venta) {
        this.codigo_venta = codigo_venta;
        this.cedula_cliente = cedula_cliente;
        this.cedula_usuario = cedula_usuario;
        this.iva_venta = iva_venta;
        this.total_venta = total_venta;
        this.valor_venta = valor_venta;
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public int getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(int cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public Double getIva_venta() {
        return iva_venta;
    }

    public void setIva_venta(Double iva_venta) {
        this.iva_venta = iva_venta;
    }

    public Double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(Double total_venta) {
        this.total_venta = total_venta;
    }

    public Double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(Double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public ventas() {
    }

    @Override
    public String toString() {
        return "ventas{" +
                "codigo_venta=" + codigo_venta +
                ", cedula_cliente=" + cedula_cliente +
                ", cedula_usuario=" + cedula_usuario +
                ", iva_venta=" + iva_venta +
                ", total_venta=" + total_venta +
                ", valor_venta=" + valor_venta +
                '}';
    }
}
