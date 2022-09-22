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
public class Division implements Calculo{
    
    @Override
    public String calculo(double n, int a, int b) {
        double[][] m = new double [a][b];
        String r = "";
        String ma = "";
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
                m[i][j]/=n;
                r += m[i][j]+" "; 
            }
            r+="\n";
        }
        System.out.println(ma);
        return r;
    }    
}