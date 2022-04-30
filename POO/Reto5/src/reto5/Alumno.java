package reto5;

public class Alumno extends Usuario {
    private double calificacion;
    
    public Alumno(int id, String nombre, String apellido, String correo, double calificacion){
        super(id, nombre, apellido, correo);
        this.calificacion = calificacion;
        System.out.println("¡Se registró el Alumno!");
    }
    
    public void mostrarCalificaciones(){
        System.out.println("La calificación del alumno es: "+ this.calificacion);
    }
    
    public void guardarCalificacion(double calificacion){
        this.calificacion = calificacion;
        System.out.println("La nueva calificación del alumno es: "+ this.calificacion);
    }
    
    public double getCalificaciones(){
        return this.calificacion;
    }
}
