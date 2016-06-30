/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import cgt.AplFerramenta;
import cdp.Categoria;
import cdp.Credencial;
import cdp.Ferramenta;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author aleao
 */
public class FerramentaTest {    
    
    @Test
    public void cadastrarFerramentaTest(){
        AplFerramenta aplFerramenta = new AplFerramenta();
        Ferramenta ferramenta = new Ferramenta();         
        ferramenta.setNome(" Fer ramenta 1 ");
        ferramenta.setCredencial(new Credencial("username","password"));
        ferramenta.setCategoria(Categoria.VERSIONAMENTO); 
        ferramenta.verificaEspaco(ferramenta.getNome());          
        
        AplFerramenta.salvar(ferramenta);       
                        
        Assert.assertEquals(ferramenta.verificaEspaco(ferramenta.getNome()), false);
        
        Assert.assertEquals(AplFerramenta.exists(ferramenta), true);
    }    
}
