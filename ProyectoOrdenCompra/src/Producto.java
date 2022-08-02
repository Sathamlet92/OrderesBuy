public class Producto {
    private String _fabricante;
    private String _nombre;
    private int _precio;

    public Producto(String pFabricante, String pNombre, int pPrecio){
        this._fabricante = pFabricante;
        this._nombre = pNombre;
        this._precio = pPrecio;
    }

    public String getFabricante() {
        return _fabricante;
    }

    public String geNombre() {
        return _nombre;
    }

    public int getPrecio() {
        return _precio;
    }
}
