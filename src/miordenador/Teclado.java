/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miordenador;

/**
 *
 * @author werne
 */
public class Teclado extends DispositivoEntrada{
    private int ideTeclado;
    private int contadorTeclados;

    public Teclado(int ideTeclado, int contadorTeclados, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.ideTeclado = ideTeclado;
        this.contadorTeclados = contadorTeclados;
    }
    
    

    @Override
    public String toString() {
        return "Teclado{" + "ideTeclado=" + ideTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
    
}
