 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.net.URL;

/**
 *
 * @author abel
 */
public class Carta {
      
 JPanel mesa;   
 ArrayList cartas;
 String grupo;
 int numero;
 int x=10;int fx=1;
 int y=10;int fy=-1;
 Random random=new Random();
 JLabel label;
 
 public Carta(ArrayList cartas,String grupo,int numero){
super();
derecha=true;
this.mesa=mesa;
this.cartas=cartas;
this.grupo=grupo;
this.numero=numero;
label=new JLabel();
 String aux="";
if (grupo.equals("oro")) aux=" (4)";
if (grupo.equals("espada")) aux=" (3)";
if (grupo.equals("copa")) aux=" (2)";

     try { 
         label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+numero+aux+".jpg")));
     } catch (Exception ex) {ex.printStackTrace(); }
 cartas.add(this); 
 }

public boolean derecha;
public String significa=""; 

public boolean equals(Object x){

    if (!(x instanceof Carta)) return false;
Carta aux=(Carta)x;
return (grupo.equals(aux.grupo)&&numero==aux.numero);
}

public boolean derecha(){return derecha;}
public void setDerecha(boolean derecha){this.derecha=derecha;}
public String significado() {return significa;}
public void setSignificado(String significa){this.significa=significa;}
public void voltea(){
    String aux="";
if (grupo.equals("oro")) aux=" (4)";
if (grupo.equals("espada")) aux=" (3)";
if (grupo.equals("copa")) aux=" (2)";
  
if (!derecha())
    try {
        label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+numero+aux+".jpg")));
    } catch (Exception ex) {ex.printStackTrace();}
else try {
    label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+numero+aux+".jpg")));
    } catch (Exception ex) {ex.printStackTrace(); }


}

}
