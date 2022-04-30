package reto5;

/**
 *
 * @author eddga
 */
public class Reto5 {

    public static void main(String[] args) {
        Reader reader = new Reader();
        
        int idMaestro = reader.stringToInt(reader.getInput("Inserte el Id del Maestro:"));
        String nombreMaestro = reader.getInput("Inserte el nombre del Maestro:");
        String apellidoMaestro = reader.getInput("Inserte el apellido del Maestro:");
        String correoMaestro = reader.getInput("Inserte el correo del Maestro:");
        Maestro maestro1 = new Maestro(idMaestro, nombreMaestro, apellidoMaestro, correoMaestro);
        maestro1.imprimirPerfil();
        
        int idAlumno = reader.stringToInt(reader.getInput("Inserte el Id del Alumno:"));
        String nombreAlumno = reader.getInput("Inserte el nombre del alumno:");
        String apellidoAlumno = reader.getInput("Inserte el apellido del alumno:");
        String correoAlumno = reader.getInput("Inserte el correo del alumno:");
        double calificacion = reader.stringToDouble(reader.getInput("Inserte la calificacion del alumno:"));
        Alumno alumno1 = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, correoAlumno, calificacion);
        alumno1.imprimirPerfil();
        alumno1.mostrarCalificaciones();
        double nvaCalificacion = reader.stringToDouble(reader.getInput("Inserte la nueva calificación del alumno: "));
        alumno1.guardarCalificacion(nvaCalificacion);
        
        int idTutor = reader.stringToInt(reader.getInput("Inserte el Id del Tutor: "));
        String nombreTutor = reader.getInput("Inserte el nombre del tutor:");
        String apellidoTutor = reader.getInput("Inserte el apellido del tutor:");
        String correoTutor = reader.getInput("Inserte el correo del tutor: ");
        String alumnoTutor = reader.getInput("Inserte el nombre del alumno asignado al Tutor: ");
        Tutor tutor1 = new Tutor(idTutor, nombreTutor, apellidoTutor, correoTutor, alumnoTutor);
        tutor1.imprimirPerfil();
        tutor1.setCalificaciones(alumno1.getCalificaciones());
        tutor1.mostrarCalificaciones();
        
    }
    
}
