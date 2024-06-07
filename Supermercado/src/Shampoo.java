public class Shampoo extends Producto{
    private int contenido;

    public void setContenido(int contenido){
        this.contenido = contenido;
    }
    public  int getContenido(){
        return contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Contenido: " + this.contenido + "ml /// Precio: $" + this.precio;
    }
}
