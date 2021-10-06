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
public class Raton extends DispositivoEntrada{
    private int idRaton;
    private int contadirRatones;

    public Raton(int idRaton, int contadirRatones, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = idRaton;
        this.contadirRatones = contadirRatones;
    }

    

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadirRatones=" + contadirRatones + '}';
    }
    
    
    
    
}
