CREATE DATABASE Control2

-- Tabla Usuario
CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nombre_usuario VARCHAR(50),
    email VARCHAR(50),
    password VARCHAR(50)
);

-- Tabla Tarea
CREATE TABLE tarea (
    id_tarea SERIAL PRIMARY KEY,
    id_usuario BIGINT REFERENCES usuario (id),
    titulo VARCHAR(50),
    descripcion VARCHAR(50),
    fecha_vencimiento DATE,
    estado VARCHAR(50)
);