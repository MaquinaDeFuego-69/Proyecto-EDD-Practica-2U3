/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Proceso {
    
    public static int Proceso (int x, int y){
        int resultado = 1;
        for (int i = 1; i <= y; i++) {
            resultado = resultado * x;
        }
        return resultado; 
    }
}
