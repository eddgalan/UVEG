CREATE DATABASE UVEG;
use UVEG;
CREATE TABLE alumnos 
(
	no_control int NOT NULL,
	nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25) NOT NULL,
    carrera VARCHAR(25) NOT NULL
);

CREATE TABLE bitacora_trabajo
(
	id_registro int NOT NULL AUTO_INCREMENT,
	operacion VARCHAR(25) DEFAULT NULL,
    usuario_cambio VARCHAR(25) DEFAULT NULL,
    host_log VARCHAR(25) NOT NULL,
    fecha_modificacion DATETIME DEFAULT NULL,
    tabla_modificacion VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_registro)
)
ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

DROP TRIGGER IF EXISTS log_alumno_insertar;
DELIMITER //
CREATE TRIGGER log_alumno_insertar AFTER INSERT ON alumnos
FOR EACH ROW INSERT INTO bitacora_trabajo(host_log, usuario_cambio, operacion, fecha_modificacion, tabla_modificacion)
VALUES (SUBSTRING(USER(), (INSTR(USER(), '@')+1)),
SUBSTRING(USER(), 1, (INSTR(USER(), '@')-1)), "INSERTAR", NOW(), "ALUMNOS")
//
DROP TRIGGER IF EXISTS log_alumno_actualizar;
CREATE TRIGGER log_alumno_actualizar AFTER UPDATE ON alumnos
FOR EACH ROW INSERT INTO bitacora_trabajo(host_log, usuario_cambio, operacion, fecha_modificacion, tabla_modificacion)
VALUES (SUBSTRING(USER(), (INSTR(USER(), '@')+1)),
SUBSTRING(USER(), 1, (INSTR(USER(), '@')-1)), "ACTUALIZAR", NOW(), "ALUMNOS")
//
DROP TRIGGER IF EXISTS log_alumno_eliminar;
CREATE TRIGGER log_alumno_eliminar AFTER DELETE ON alumnos
FOR EACH ROW INSERT INTO bitacora_trabajo(host_log, usuario_cambio, operacion, fecha_modificacion, tabla_modificacion)
VALUES (SUBSTRING(USER(), (INSTR(USER(), '@')+1)),
SUBSTRING(USER(), 1, (INSTR(USER(), '@')-1)), "ELIMINAR", NOW(), "ALUMNOS")
//


INSERT INTO alumnos(no_control, nombre, apellido, carrera)
VALUES ('1546','Laura', 'Flores', 'ISC');
INSERT INTO alumnos(no_control, nombre, apellido, carrera)
VALUES ('1547','Jaime', 'Valdez', 'Industrial');
INSERT INTO alumnos(no_control, nombre, apellido, carrera)
VALUES ('1548','Paulina', 'Ferrer', 'Mecatrónica');
INSERT INTO alumnos(no_control, nombre, apellido, carrera)
VALUES ('1549','Andrés', 'Valdivia', 'ISC');

UPDATE alumnos
SET carrera='Sistemas' WHERE carrera='ISC'

DELETE FROM alumnos
WHERE no_control = '1549'

SELECT * FROM bitacora_trabajo;
SELECT * FROM alumnos;