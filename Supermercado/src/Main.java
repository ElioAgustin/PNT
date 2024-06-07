import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = cargarProductos();
        imprimirDatos(listaProductos);

    }


    public static ArrayList<Producto> cargarProductos(){
        ArrayList<Producto> productos = new ArrayList<>();

        Bebida cocaColaZero = new Bebida();
        cocaColaZero.setNombre("Coca-Cola Zero");
        cocaColaZero.setPrecio(20);
        cocaColaZero.setLitros(1.5F);

        Bebida cocaColaComun = new Bebida();
        cocaColaComun.setNombre("Coca-Cola");
        cocaColaComun.setPrecio(18);
        cocaColaComun.setLitros(1.5F);

        Shampoo shampooSedal = new Shampoo();
        shampooSedal.setNombre("Shampoo Sedal");
        shampooSedal.setPrecio(19);
        shampooSedal.setContenido(500);

        Fruta frutilla = new Fruta();
        frutilla.setNombre("Frutillas");
        frutilla.setPrecio(64);
        frutilla.setUnidadVenta("kilo");

        productos.add(cocaColaZero);
        productos.add(cocaColaComun);
        productos.add(shampooSedal);
        productos.add(frutilla);

        return productos;
    }


    public static void imprimirDatos(ArrayList<Producto> productos){
        for (Producto i :productos) {
            System.out.println(i.toString());

        }
        System.out.println("=============================");
        Collections.sort(productos);
        System.out.println("Producto más caro: " + productos.get((productos.size()) - 1).getNombre());
        System.out.println("Producto más barato: " + productos.get(0).getNombre());
    }

}