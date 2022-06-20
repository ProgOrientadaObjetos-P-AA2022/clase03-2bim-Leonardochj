/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia
                    + lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
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
                    + "Costo de la asignatura: %.2f\n"
                    + "Numero de asignaturas: %d\n"
                    + "Valor de la matricula: %.2f\n\n", cadena,
                    obtenerLista().get(i).nombresEstudiante,
                    obtenerLista().get(i).apellidosEstudiante,
                    obtenerLista().get(i).identificacionEstudiante,
                    obtenerLista().get(i).edadEstudiante,
                    obtenerLista().get(i).obtenerCostoAsignatura(),
                    obtenerLista().get(i).obtenerNumeroAsignaturas(),
                    obtenerLista().get(i).obtenerMatriculaDistancia());
        }
        cadena = String.format("%sEl total de matriculas es: %.2f\n", cadena,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }

}
