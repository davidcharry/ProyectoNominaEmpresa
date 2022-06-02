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
public class Empleado {

    private long cantidadHorasTrabajadas;

    public Empleado() {
    }

    public long getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(long cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    public long calcularNomina(int valorHora) {
        return (this.cantidadHorasTrabajadas * valorHora);
    }  

}
