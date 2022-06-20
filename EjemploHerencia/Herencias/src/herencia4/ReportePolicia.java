/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Chuquimarca, Abrham Ayala y André Flores
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String cod) {
        super(cod);

    }

    public void establecerLista(ArrayList<Policia> list) {
        lista = list;
    }

    public void establecerEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public double obtenerPromEdades() {
        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.codigo);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio de edades: %.2f\n ", cadena,
                promedioEdades);
        return cadena;
    }
}
