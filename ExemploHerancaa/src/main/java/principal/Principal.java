/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


import javax.swing.*;
import model.Circulo;
import model.Triangulo;


public class Principal {
    
    public static void main(String[] args){
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        while(true){
            
         String input = JOptionPane.showInputDialog(null,
                 "1) Calcular área do circulo\n"
                  + "2) Calcular área do triangulo\n"
                  + "3) Sair");
                 
                 if(input == null){
                    break;
                 }
                 try{
                     int opcao = Integer.parseInt(input);
                     
                     
                     switch(opcao){
                         case 1:
                             
                             
                             circulo.leitura();
                             circulo.paraString();
                             circulo.imprimir();
                             JOptionPane.showMessageDialog(null,circulo.getArea());
                             
                             
                             break;
                   
                         case 2:
                             triangulo.leitura();
                             triangulo.paraString();
                             triangulo.imprimir();
                             JOptionPane.showMessageDialog(null,triangulo.getArea());
                             
                             break;
                         case 3:
                             
                             JOptionPane.showMessageDialog(null,"Saindo...");
                             return;
                             
                         default:
                             JOptionPane.showMessageDialog(null,"Opção invalida! Escolha de 1 a 3");
                             break;
                     }
                     
                 } catch(NumberFormatException e){
                     JOptionPane.showMessageDialog(null, "Por favor, Digite apenas números para escolher uma opção");
                 }
                 
                 
                 
            
            
            
        }
        
           }
    
}
