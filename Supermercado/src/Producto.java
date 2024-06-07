public abstract class Producto implements Comparable<Producto>{
    protected String nombre;
    protected int precio;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    }


    @Override
    public int compareTo(Producto producto) {
        return this.precio - producto.getPrecio();
    }
}
