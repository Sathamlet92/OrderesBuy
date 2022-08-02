import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) throws ParseException {
        OrdenCompra oc = new OrdenCompra("Orden 1");
        oc.setFecha(new Date());
        oc.setCliente(new Cliente("Juan", "Perez"));
        oc.addProducto(new Producto("Acer", "AC256F", 4820))
                .addProducto(new Producto("Intel", "i7 7700k", 5100))
                .addProducto(new Producto("Kingston", "Memoria Ram 8gb x2", 2320))
                .addProducto(new Producto("Wenster Digital", "SN 850 1TB", 3600));
        OrdenCompra oc1 = new OrdenCompra("Orden 2");
        oc1.setFecha(new Date());
        oc1.setCliente(new Cliente("Juan", "Perez"));
        oc1.addProducto(new Producto("Acer", "AC8524", 9300))
                .addProducto(new Producto("AMD", "Ryzen 7 5950x", 8905))
                .addProducto(new Producto("Kingston", "Memoria Ram 16gb x2", 3300))
                .addProducto(new Producto("Wenster Digital", "SN 850 1TB", 3600));
        System.out.println(oc);
        System.out.println();
        System.out.println(oc1);
    }
}
