public class Fruta extends Producto{
    private String unidadVenta;

    public void setUnidadVenta(String unidadVenta){
        this.unidadVenta = unidadVenta;
    }
    public String getUnidadVenta(){
        return unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Precio: $" + this.precio + " /// Unidad de venta: " + this.unidadVenta;
    }
}
