public class productos {
    private int codigo_producto;
    private Double iva_compra;
    private String nit_proveedor;
    private String nombre_producto;
    private Double precio_compra;
    private Double precio_venta;

    public productos(int codigo_producto, Double iva_compra, String nit_proveedor, String nombre_producto, Double precio_compra, Double precio_venta) {
        this.codigo_producto = codigo_producto;
        this.iva_compra = iva_compra;
        this.nit_proveedor = nit_proveedor;
        this.nombre_producto = nombre_producto;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public Double getIva_compra() {
        return iva_compra;
    }

    public void setIva_compra(Double iva_compra) {
        this.iva_compra = iva_compra;
    }

    public String getNit_proveedor() {
        return nit_proveedor;
    }

    public void setNit_proveedor(String nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public productos() {
    }

    @Override
    public String toString() {
        return "productos{" +
                "codigo_producto=" + codigo_producto +
                ", iva_compra=" + iva_compra +
                ", nit_proveedor='" + nit_proveedor + '\'' +
                ", nombre_producto='" + nombre_producto + '\'' +
                ", precio_compra=" + precio_compra +
                ", precio_venta=" + precio_venta +
                '}';
    }
}
