package reto5;

public class Tutor extends Usuario {
    private String alumno;
    private double califAlumno;
    
    public Tutor(int id, String nombre, String apellido, String correo, String alumno){
        super(id, nombre, apellido, correo);
        this.alumno = alumno;
    }
    
    public void setCalificaciones(double calificacion){
        this.califAlumno = calificacion;
    }
    
    public void mostrarCalificaciones(){
        System.out.println("La calificación del Alumno "+ alumno + " es: "+ this.califAlumno);
    }
    
}
