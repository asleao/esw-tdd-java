/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aleao
 */
public class Ferramenta {

    private String nome;
    private Credencial credencial;
    private Categoria categoria;

    public void setNome(String nome) {        
        this.nome = limpaEspaco(nome);
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public String getNome() {
        return this.nome;
    }
    
    private String limpaEspaco(String nome) {
        return nome.replace(" ", "");
    }

    public boolean verificaEspaco(String nome) {        
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(nome);
        boolean achou = matcher.find();
        return achou;
    }
}
