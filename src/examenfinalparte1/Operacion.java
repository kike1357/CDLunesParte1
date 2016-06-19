package examenfinalparte1;

public class Operacion {
    int resultado;

 /**
 * Constructor que recibe por parametros los dos valores a sumar.
 * @param j Nombre de la variable que se va usar para realizar la suma
 * @param m Nombre de la segunda variable que se va a usar para efectuar dicha suma
 */    
public Operacion(int j, int m) {
    resultado=Suma(j,m);}

/**
* Constructor que recibe por parametros un solo valor que se lo suma a si mismo.
* @param j Nombre de la variable que se va a sumar a si mismo.
*/
    public Operacion(int j) {
        resultado=Suma(j,j);}
/**
* Constructor que no recibe nada, que va a darle un valor negativo a nuestra variable resultado.
*/    
    public Operacion() { 
        resultado=-1;
/**
* Metodo suma, que lo que hace es sumar los dos parametros que recibe.
* @param x Nombre de la primera variable a sumar
* @param x1 Nombre de la segunda variable a sumar
* @return devuelve la suma de los valores x y x1
*/    
    }public int Suma(int x, int x1) {
      return x + x1;}}
