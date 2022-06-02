/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonominaempresa;

import javax.swing.JOptionPane;

/**
 *
 * @author mono-
 */
public class proyectonominaempresa {

    public static void main(String[] args) {
        long valorHora = 5000;
        Empresa objEmpresa = new Empresa();
        Empleado objEmpleado;
        int opcion;
        int cantidadEmpleados = 0;
        int conta;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion"
                    + "\n 1. Insertar datos del Empleado"
                    + "\n 2. Calcular nomina por Empleado"
                    + "\n 3. Calcular nomina total"
                    + "\n 4. Salir"));
            switch (opcion) {
                case 1: {
                    conta = cantidadEmpleados + 1;
                    objEmpleado = new Empleado();
                    objEmpleado.setCantidadHorasTrabajadas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas laboradas"
                            + " Empleado: " + conta)));
                    objEmpresa.setListaEmpleados(objEmpleado, cantidadEmpleados);
                    cantidadEmpleados++;
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "La nomina del empleado es: " + objEmpresa.calcularNominaEmpleado(cantidadEmpleados));
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, "La nomina total es: " + objEmpresa.calcularTotalNomina(cantidadEmpleados));
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        } while (opcion < 4);
    }
}
