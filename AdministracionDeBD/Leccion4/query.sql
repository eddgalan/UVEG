USE nuevadb;

CREATE TABLE clientes (
    RFC VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    codColonia TINYINT UNSIGNED NOT NULL,
    fechaAlta DATE NOT NULL
);

PARTITION BY LIST COLUMNS(codColonia)(
    PARTITION leon VALUES IN (1, 3),
    PARTITION silao VALUES IN (2, 5, 8),
    PARTITION guanajuato VALUES IN (4. 9),
    PARTITION purisima VALUES IN (6, 7, 10)
);

INSERT INTO clientes(RFC, nombre, codColonia, fechaAlta)
VALUES 
('EXT990101NI4', 'Flores Laura', '5', '2018-01-01'),
('ART992501NI4', 'Claudio Ramírez', '3', '2019-02-01'),
('POL994101NI4', 'Alejandro Pantoja', '1', '2020-01-05'),
('AME984101NIA', 'Luis Herrera', '4', '2019-11-03'),
('ROR904101NI4', 'Julieta Rodriguez', '2', '2019-11-05'),

CREATE VIEW leon AS SELECT * FROM clientes PARTITION (leon);
CREATE VIEW silao AS SELECT * FROM clientes PARTITION (silao);
CREATE VIEW guanajuato AS SELECT * FROM clientes PARTITION (guanajuato);
CREATE VIEW purisima AS SELECT * FROM clientes PARTITION (purisima);

SELECT * FROM leon;
SELECT * FROM silao;
SELECT * FROM guanajuato;
SELECT * FROM purisima;