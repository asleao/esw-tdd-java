/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import cdp.Ferramenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleao
 */
public class AplFerramenta {

    private Ferramenta ferramenta;
    private static List<Ferramenta> listaFerramentas;
    
    public AplFerramenta(){
        listaFerramentas = new ArrayList();
    }
    public static void salvar(Ferramenta ferramenta) {
        listaFerramentas.add(ferramenta);
    }
    
    public static boolean exists(Ferramenta ferramenta) {
        for (Ferramenta obj : listaFerramentas) {
            if(obj.equals(ferramenta)){
                return true;
            }
        }
        return false;
    }
}
