/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */
public class Traza implements Calculo{

    @Override
    public String calculo(double n, int a, int b) {
        double[][] m = new double [a][b];
        int r = 0;
        String ma = "";
        if (a==b) {//la traza solo funciona si la matriz es cuadrada
           for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m[i][j]=(int)(Math.random()*100);
                ma +=m[i][j] + " "; // guardar la matriz inicial
            }
            ma += "\n";
        }
        JOptionPane.showMessageDialog(null,"la matriz generada aleatoreamente es \n" + ma);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i==j){
                    r+=m[i][j];
                }
            }
        }
        System.out.println(ma);
        return ""+r; 
        }
        else{
            return "Esta matriz no tiene dimensiones cuadradas";
        }
    }    
}
