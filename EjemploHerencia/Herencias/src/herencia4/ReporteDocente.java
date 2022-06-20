/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Chuquimarca, Abrham Ayala y André Flores
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c) {
        super(c);
    }

    public void establecerLista(ArrayList<Docente> list) {
        lista = list;
    }

    public void establecerPromSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public double obtenerPromSueldos() {
        return promedioSueldos;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.codigo);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, 
                    lista.get(i));
        }
        cadena = String.format("%s\nPromedio sueldos: %.2f\n", cadena, 
                obtenerPromSueldos());
        return cadena;
    }
}
