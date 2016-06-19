package examenfinalparte1;
import java.io.IOException;

public class Resultado {
    
public static void main(String[] args) throws IOException{
 /**
 * Creamos un objeto de tipo Operacion, que recibe dos paámetros
 * Con esas dos variables hará la suma y se visualizara.
 */
Operacion obj = new Operacion(10,20);
int resultOp1 = obj.resultado;
System.out.println("Es: " + resultOp1);
/** 
 * Tenemos otro objeto de tipo Operacion, pero esta vez recibe un solo parámetro
 * El valor de esa variabl se mostrará por pantalla
 */
Operacion nm = new Operacion(10);
int resultOp2 = nm.resultado;
System.out.println("Es: " + resultOp2);
/**
* El metodo resultado aqui tiene un valor de -1, ese valor se le asigna a la variable resultOp3.
* Y se nos visulazaria el valor de esa variable.
*/
Operacion mn = new Operacion();
int resultOp3 = mn.resultado;
System.out.println("Es: " + resultOp3);}}
