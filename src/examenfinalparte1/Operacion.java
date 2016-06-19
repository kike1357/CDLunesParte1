package examenfinalparte1;

public class Operacion {
    int resultado;
    
public Operacion(int j, int m) {
    resultado=Suma(j,m);}

    public Operacion(int j) {
        resultado=Suma(j,j);}
    
    public Operacion() { 
        resultado=-1;
    
    }public int Suma(int x, int x1) {
      return x + x1;}}
