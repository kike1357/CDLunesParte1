package examenfinalparte1;
import java.io.IOException;

public class Resultado {
    
public static void main(String[] args) throws IOException{
Principal2 obj = new Principal2(10,20);
int resultOp1 = obj.resultado;
System.out.println("Es: " + resultOp1);
Principal2 nm = new Principal2(10);
int resultOp2 = nm.resultado;
System.out.println("Es: " + resultOp2);
Principal2 mn = new Principal2();
int resultOp3 = mn.resultado;
System.out.println("Es: " + resultOp3);}}
