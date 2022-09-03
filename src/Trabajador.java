public class Trabajador extends Persona{
    private Long salario;

    public Trabajador(int edad, String nombre, Long telefono, Long salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador: "+super.toString() + " Salario: " + this.salario;
    }
}
