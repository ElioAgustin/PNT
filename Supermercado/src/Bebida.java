public class Bebida extends Producto {
    private float litros;


    public void setLitros(float litros){
        this.litros = litros;
    }
    public float getLitros(){
        return this.litros;
    }


    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Litros: " + this.litros + " /// Precio: $" + this.precio;
    }
}
