import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private static int idAut = 1;
    private int idU;
    private String _description;
    private Date _fecha;
    private Cliente _cliente;
    private Producto[] _productos = new Producto[4];
    private int indexP = 0;
    private String _fechaFormat;
    public OrdenCompra(String pDescription){
        this._description = pDescription;
        this.idU = idAut;
        idAut++;
    }
    public static int getIdAut() {
        return idAut;
    }

    public String getDescription() {
        return _description;
    }

    public Date getFecha() {
        if(this._fecha == null){
            this._fecha = new Date();
        }
        return _fecha;
    }

    public Cliente getCliente() {
        return _cliente;
    }

    public Producto[] getProductos() {
        return _productos;
    }

    public void setFecha(Date pFecha) {
        if(pFecha == null || this.getFecha() == null) {
            this._fecha = new Date();
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MMMM/yyyy");
        this._fechaFormat = format.format(this._fecha);
        this._fecha = pFecha;
    }

    public void setCliente(Cliente pCliente) {
        this._cliente = pCliente;
    }

    public OrdenCompra addProducto(Producto pProducto){
        if(indexP < this._productos.length) {
            this._productos[indexP++] = pProducto;
        }
        return this;
    }
    private double getTotal(){
        int sumT = 0;
        if(this._productos.length > 0) {
            for (var item : this._productos
            ) {
                sumT += item.getPrecio();
            }
        }
        return  sumT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String prodc ="Productos: \n";
        if(this._productos[0] != null) {
            for (var item : this._productos
            ) {
                prodc += item.geNombre() + ", Fabricante: " + item.getFabricante()
                        + ", Precio: " + item.getPrecio() + ".\n";
            }
        }
        sb.append("#").append(idU).append("\nDescripcion: ").append(this.getDescription())
                .append("\nFecha de orden: ").append(this._fechaFormat)
                .append("\nCliente: ").append(this.getCliente().getNombre()).append(" ")
                .append(this.getCliente().getApellido())
                .append("\n").append(prodc).append("Total: ")
                .append(this.getTotal());

        return sb.toString();
    }
}
