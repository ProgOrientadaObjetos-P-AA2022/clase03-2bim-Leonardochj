/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author Leonardo Chuquimarca, Abrham Ayala y André Flores
 */
public class Reporte {

    protected String codigo;
    
    public Reporte(String cod){
        codigo = cod;
    }

    public void establecerCodigo(String c) {
        codigo = c;
    }

    public String obtenerCodigo() {
        return codigo;
    }
}
