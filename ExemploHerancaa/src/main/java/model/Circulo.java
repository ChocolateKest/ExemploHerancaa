/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 10724238393
 */
import javax.swing.*;
public class Circulo extends FiguraGeometrica {
private double raio;
public Circulo() {
this("",0);
}
public Circulo(String cor, double raio) {
super(cor);
setRaio(raio);
}
public double getRaio() {
return raio;
}
public void setRaio(double raio) {
this.raio = raio;
}
public void leitura() {
super.leitura();
setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));
}
public void imprimir() {
super.imprimir();
JOptionPane.showMessageDialog(null,"O raio é " + getRaio());
}
public String paraString() {
return (super.paraString() + "/ Raio : " + getRaio());
}
public double getArea() {
return (Math.PI * getRaio() * getRaio());
}
}
