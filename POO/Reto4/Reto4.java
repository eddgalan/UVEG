import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Tarjeta de Crédito
        TarjetaCredito tarjetaCredito = new TarjetaCredito(-100);
        tarjetaCredito.sumaIntereses();
        System.out.println("Saldo Actual Tarjeta Crédito: $" + tarjetaCredito.get_montoActual());
        // Tarjeta de Debito
        TarjetaDebito tarjetaDebito = new TarjetaDebito(500);
        tarjetaDebito.retirar(100);
        System.out.println("Nuevo saldo Tarjeta Débito: $" + tarjetaDebito.get_montoActual());
        // Cuenta Ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000);
        cuentaAhorro.invertir();
        System.out.println("Nuevo saldo Cuenta de Ahorro: $" + cuentaAhorro.get_montoActual());
    }
}

class CuentaBase {
    protected double montoActual;
    
    public CuentaBase(double apertura){
        this.montoActual = apertura;
    }
    
    public void depositar(double cantidad){
        this.montoActual += cantidad;
    }
    
    public double get_montoActual(){
        return this.montoActual;
    }
}

class TarjetaCredito extends CuentaBase {
    public TarjetaCredito(double apertura){
        super(apertura);
        System.out.println("Aperturó una Tarjeta de Crédito con un monto: $"+ apertura);
    }
    public void sumaIntereses(){
        this.montoActual += this.montoActual * 0.15;
        System.out.println("Se cargaron intereses (15%) TDC");
    }
}

class TarjetaDebito extends CuentaBase {
    public TarjetaDebito(double apertura){
        super(apertura);
        System.out.println("Aperturó una Tarjeta de Débito con un monto de: $"+ apertura);
    }
    public void retirar(double cantidad){
        this.montoActual -= cantidad;
        System.out.println("Se realizó un retiro por la cantidad de : $"+ cantidad);
    }
}

class CuentaAhorro extends CuentaBase {
    public CuentaAhorro(double apertura){
        super(apertura);
        System.out.println("Aperturó una Cuenta de Ahorro con un monto de: $"+ apertura);
    }
    public void invertir(){
        this.montoActual += this.montoActual * 0.1;
        System.out.println("Se aplicó inversión. Se sumó el 10% al monto actual");
    }
}