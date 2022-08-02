public class Cliente {
    private String _nombre;
    private String _apellido;

    public Cliente(String pNombre, String pApellido) {
        this._nombre = pNombre;
        this._apellido = pApellido;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellido() {
        return _apellido;
    }
}
