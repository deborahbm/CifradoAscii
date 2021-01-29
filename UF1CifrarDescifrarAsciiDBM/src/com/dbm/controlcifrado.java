/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbm;
/**
 *
 * @author dealm
 */
public class controlcifrado { 
    
    private String _textoEntrada;
    private String _mensajeCifrado;
    private String _mensajeDescifrado;
    
    
   /**
    * Constructor con texto de entrada
    * @param textoEntrada 
    */
    public controlcifrado (String textoEntrada){
        _textoEntrada = textoEntrada;
    }  
    public controlcifrado (){     
    }
    /**
     * esta función sirve para cifrar la cadena de texto de entrada 
     */    
    
    public void cifrar ()
    {
       //Convierte el mensaje a array para leer caracteres 
       char array[] = _textoEntrada.toCharArray(); 
       
       //visualiza cada caracter
       for(int i=0;i<array.length;i++) 
       {
        //Aumenta en 5 letras cada caracter manteniendo el formato
        array[i] =(char)(array[i]+(char)5); 
       }
      
       //guarda el valor resultante
       _mensajeCifrado = String.valueOf(array);
    }
   
    
    public void descifrar ()
    {
        char array[] = _mensajeCifrado.toCharArray(); 
       
       for(int i=0;i<array.length;i++) 
       {
        array[i] =(char)(array[i]-(char)5);
       }
     
       _mensajeDescifrado=String.valueOf(array);
    }
    
    public int clave ()
    {
    
      int key=0;   
      
     for(int i=0;i <_textoEntrada.length();i++) 
       {
       key= _textoEntrada.codePointAt(i);
       }
     return key;
    }   

    public String getTextoEntrada() {
        return _textoEntrada;
    }

    public void setTextoEntrada(String _textoEntrada) {
        this._textoEntrada = _textoEntrada;
    }

    public String getMensajeCifrado() {
        return _mensajeCifrado;
    }

    public void setMensajeCifrado(String _mensajeCifrado) {
        this._mensajeCifrado = _mensajeCifrado;
    }

    public String getMensajeDescifrado() {
        return _mensajeDescifrado;
    }

    public void setMensajeDescifrado(String _mensajeDescifrado) {
        this._mensajeDescifrado = _mensajeDescifrado;
    }   
    
    
}
