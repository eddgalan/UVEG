package reto5;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correoElectronico;
    
    public Usuario(int id, String nombre, String apellido, String correo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correo;
    }
    
    public void imprimirPerfil(){
        System.out.println("Id: "+ this.id);
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellido: "+ this.apellido);
        System.out.println("Correo electrónico: "+ this.correoElectronico);
    }
    
}
