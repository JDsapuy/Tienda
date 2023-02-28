public class detalle_ventas {
    private int codigo_detalle;
    private int cantidad_producto;
    private int codigo_producto;
    private int codigo_venta;
    private Double valor_venta;
    private Double valor_iva;
    private Double valor_total;

    public detalle_ventas(int codigo_detalle, int cantidad_producto, int codigo_producto, int codigo_venta, Double valor_venta, Double valor_iva, Double valor_total) {
        this.codigo_detalle = codigo_detalle;
        this.cantidad_producto = cantidad_producto;
        this.codigo_producto = codigo_producto;
        this.codigo_venta = codigo_venta;
        this.valor_venta = valor_venta;
        this.valor_iva = valor_iva;
        this.valor_total = valor_total;
    }

    public int getCodigo_detalle() {
        return codigo_detalle;
    }

    public void setCodigo_detalle(int codigo_detalle) {
        this.codigo_detalle = codigo_detalle;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public Double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(Double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public Double getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(Double valor_iva) {
        this.valor_iva = valor_iva;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public detalle_ventas() {
    }

    @Override
    public String toString() {
        return "d_ventas{" +
                "codigo_detalle=" + codigo_detalle +
                ", cantidad_producto=" + cantidad_producto +
                ", codigo_producto=" + codigo_producto +
                ", codigo_venta=" + codigo_venta +
                ", valor_venta=" + valor_venta +
                ", valor_iva=" + valor_iva +
                ", valor_total=" + valor_total +
                '}';
    }
}
