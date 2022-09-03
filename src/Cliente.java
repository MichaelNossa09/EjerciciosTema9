public class Cliente extends Persona {

    private int credito;

    public Cliente(int edad, String nombre, Long telefono, int credito) {
        super(edad,nombre,telefono);
        this.credito = credito;
    }

    public Cliente() {
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente: "+ super.toString() +
                " Crédito: " + credito;
    }
}
