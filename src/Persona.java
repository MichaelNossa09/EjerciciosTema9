public class Persona {
    private int edad;
    private String nombre;
    private Long telefono;

    public Persona() {
    }

    public Persona(int edad, String nombre, Long telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona--> " +
                "Edad: " + edad +
                ", Nombre: '" + nombre + '\'' +
                ", Telefono: " + telefono;
    }
}
