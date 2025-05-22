
package ejercicio5;

public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                   String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    public double getBonoGerencial() { return bonoGerencial; }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento + ", Bono Gerencial: " + bonoGerencial +
                           ", Salario Total: " + calcularSalario());
    }
}
