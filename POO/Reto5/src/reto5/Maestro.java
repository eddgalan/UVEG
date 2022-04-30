package reto5;

public class Maestro extends Usuario {
    public Maestro(int id, String nombre, String apellido, String correo){
        super(id, nombre, apellido, correo);
        System.out.println("¡Se registró el Maestro!");
    }
}
