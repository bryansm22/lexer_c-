/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer_c;

/**
 *
 * @author bsalv
 */
public class tokenizador {
    String token;
    String palabra;

    public tokenizador(String token, String palabra) {
        this.token = token;
        this.palabra = palabra;
    }

    public tokenizador() {
    }

    public String getToken() {
        return token;
    }

    public String getPalabra() {
        return palabra;
    }
    
    
    public String toString(){
    return "Palabra: " + this.palabra + ", Token: " + this.token + ";";
    }
    
    
    
    
    
    
}
