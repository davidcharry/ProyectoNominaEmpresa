/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonominaempresa;

/**
 *
 * @author mono-
 */
public class Empresa {

    static int cantidadEmpleados = 3;
    static long valorHora = 5000;
    Empleado listaEmpleados[] = new Empleado[cantidadEmpleados];

    public Empresa() {
    }

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado objetoEmpleado, int posicion) {
        this.listaEmpleados[posicion] = objetoEmpleado;
    }

    public long calcularTotalNomina(int cantidad) {
        long nominaTotal = 0;
        for (int i = 0; i < cantidad; i++) {
            nominaTotal = nominaTotal + this.listaEmpleados[i].calcularNomina((int) valorHora);
        }
        return nominaTotal;
    }

    public String calcularNominaEmpleado(int cantidad) {
        String cadena = "";
        for (int i = 0; i < cantidad; i++) {
            cadena += "\n Nomina Empleado No"
                    + (i + 1)
                    + ": $"
                    + listaEmpleados[i].calcularNomina((int) valorHora);
        }
        return cadena;
    }
}
