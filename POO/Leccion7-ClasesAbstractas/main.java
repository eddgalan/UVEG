import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Suma suma = new Suma(10, 30);
        suma.imprimir();
    }
    
}

abstract class Operacion {
    private double operando1;
    private double operando2;
    
    Operacion(double operando1, double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    abstract double resultado();
    
    public double getOperando1(){
        return this.operando1;
    }
    
    public double getOperando2(){
        return this.operando2;
    }
    
    public void imprimir() {
        System.out.println("El resultado es: "+ this.resultado());
    }
}

class Suma extends Operacion {
    Suma(double operando1, double operando2) {
        super(operando1, operando2);
    }
    @Override
    double resultado() {
        return this.getOperando1() + this.getOperando2();
    }
}
