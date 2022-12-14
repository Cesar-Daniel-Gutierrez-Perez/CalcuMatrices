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
public class Determinante implements Calculo{

    @Override
    public String calculo(double n, int a, int b) {
        int r1 = 1;
        int r2 = 1;
        int fin = 0;
        int c = (a*2)-1;
        int in = 0;
        int de =c-1;
        double[][] m = new double [a][b];
        double[][] m1 = new double [(a*2)-1][b];
        String ma = "";
        if (a==3 && b==3) {  //este metodo solo funciona con matrices 3x3                  
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    m[i][j]=(int)(Math.random()*100);
                    ma +=m[i][j] + " "; // guardar la matriz inicial
                }
                ma += "\n";
            }
            JOptionPane.showMessageDialog(null,"la matriz generada aleatoreamente es \n" + ma);
            // procedimiento para sacar determinante de una matriz 3x3 por la regla de sarrus
            for (int i = 0; i < c ; i++) {                
                for (int j = 0; j < b; j++) {
                    if (a>i){
                        m1[i][j]=m[i][j];
                        System.out.print(m1[i][j] + " ");
                    }
                    else{
                        m1[i][j]=m[i-a][j];
                        System.out.print(m1[i][j] + " ");//creamos una nueva matriz escribiendola de nuevo menos la ultima fila
                    }
                }
                System.out.println("");            
            }            
            for (int k = 0; k < a; k++) {//repetir el proceso 3 veces para las 3 diagonales
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        if(i==j){
                            r1*=m1[i+in][j];//le agregamos un contador para que opere la siguiente diagonal
                        }                                 
                    }                
                } 
                in++;
                fin+=r1;
                r1=1;
                for (int i = 0; i < a; i++) {                
                    for (int j = 0; j < b; j++) { 
                        if(i==j){
                        r2*=m1[i+de][j]; //le agregamos un contador para que opere la siguiente diagonal
                        de-=2;
                        }                                  
                    }                    
                }
                de=c-k-2;
                fin-=r2;
                r2=1;
                ma = fin+"";         
            }
        }
        else{
            ma = "Esta matriz no tiene dimensiones 3x3";
        }
        return ma;
    }    
}
