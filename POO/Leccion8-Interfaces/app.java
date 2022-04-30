import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	    Camioneta camioneta = new Camioneta();
	    camioneta.imprimirMotor();
	    Moto moto = new Moto();
	    moto.imprimirMotor();
            Sedan sedan = new Sedan();
            sedan.imprimirMotor();
    }

}

interface IVehiculo {
        public final String marca = "UVEG";
        public void imprimirMotor();
        public void adelante();
        public void reversa();
        public void montarRuedas(int ruedas);
}

class Sedan implements IVehiculo {
        @Override
        public void imprimirMotor() {
                System.out.println("Ultra 600MP");
        }

        @Override
        public void adelante(){
                System.out.println("Sedan - Adelante");
        }

        @Override
        public void reversa() {
                System.out.println("Sedan - Reversa");
        }

        @Override
        public void montarRuedas(int ruedas) {
                System.out.println("Sedan - Se montaron "+ ruedas +" ruedas.");
        }
}

class Moto implements IVehiculo {
	@Override
	public void imprimirMotor() {
		System.out.println("CG200 CC");
	}
	@Override
        public void adelante(){
                System.out.println("Moto - Adelante");
        }
	@Override
        public void reversa() {
                System.out.println("Moto - Reversa");
        }
	@Override
	public void montarRuedas(int ruedas) {
		System.out.println("Moto - Se montaron "+ ruedas + " ruedas.");
	}
}

class Camioneta implements IVehiculo {
	@Override
	public void imprimirMotor() {
		System.out.println("G1000 CC");
	}
	 @Override
        public void adelante(){
                System.out.println("Camioneta - Adelante");
        }
        @Override
        public void reversa() {
                System.out.println("Camioneta - Reversa");
        }
	@Override
	public void montarRuedas(int ruedas) {
		System.out.println("Camioneta - Se montaron "+ ruedas + " ruedas.");
	}
}
