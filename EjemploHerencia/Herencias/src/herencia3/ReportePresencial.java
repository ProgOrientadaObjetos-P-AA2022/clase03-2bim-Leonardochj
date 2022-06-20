/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePresencial extends Reporte {

    private ArrayList<EstudiantePresencial> lista;
    private double totalMatriculaPresencial;
    private double promedioGeneral;

    public ReportePresencial(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudiantePresencial> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasPresencial() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaPresencial = totalMatriculaPresencial
                    + lista.get(i).obtenerMatriculaPresencial();
        }
    }

    public void establecerPromedioGeneral() {

        for (int i = 0; i < lista.size(); i++) {
            promedioGeneral = promedioGeneral
                    + lista.get(i).obtenerPromedio();
        }
        promedioGeneral = promedioGeneral / lista.size();
    }

    public ArrayList<EstudiantePresencial> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasPresencial() {
        return totalMatriculaPresencial;
    }

    public double obtenerPromedioGeneral() {
        return promedioGeneral;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nLista de Estudiantes\n\n",
                super.toString());
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%sNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificacion: %s\n"
                    + "Edad: %d\n"
                    + "Costo Crédito: %.2f\n"
                    + "Numero de Créditos: %d\n"
                    + "Total Matricula: %.2f\n"
                    + "Promedio: %.2f\n\n", cadena,
                    obtenerLista().get(i).nombresEstudiante,
                    obtenerLista().get(i).apellidosEstudiante,
                    obtenerLista().get(i).identificacionEstudiante,
                    obtenerLista().get(i).edadEstudiante,
                    obtenerLista().get(i).obtenerCostoCredito(),
                    obtenerLista().get(i).obtenerNumeroCreditos(),
                    obtenerLista().get(i).obtenerMatriculaPresencial(),
                    obtenerLista().get(i).obtenerPromedio());
        }
        cadena = String.format("%sEl total de matriculas es: %.2f\n"
                + "Promedio General: %.3f\n", cadena,
                obtenerTotalMatriculasPresencial(), obtenerPromedioGeneral());
        return cadena;
    }
}
