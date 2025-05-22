
package ejercicio1;


public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int año, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() { return numPuertas; }
    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Puertas: " + numPuertas + ", Tipo de Combustible: " + tipoCombustible);
    }
}

