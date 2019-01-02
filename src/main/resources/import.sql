INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Tamy' , 'Vivas', 'tamy.vivas@gmail.com', '2018-11-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Juan' , 'Lopez', 'juan@gmail.com', '2018-11-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Carlos' , 'Perez', 'carlos@gmail.com', '2018-10-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Manuel' , 'Agustin', 'manuel@gmail.com', '2018-12-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Elder' , 'Coman', 'elder@gmail.com', '2018-09-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Josue' , 'Pop', 'josue@gmail.com', '2018-08-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'John' , 'Doe', 'john@gmail.com', '2018-07-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Luis' , 'Estrada', 'luis@gmail.com', '2018-06-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Esvin' , 'Sac', 'esvin@gmail.com', '2018-05-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Moysn' , 'Zepeda', 'moy@gmail.com', '2018-04-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Homero' , 'Simpson', 'Homero@gmail.com', '2018-12-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Abelardo' , 'Meme', 'Abelardo@gmail.com', '2018-10-02');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$YrOT/TAVq7W03hJBhzk4re4Uc1YYXMsc2rdT8I1BjphAoten4dt8m', 1, 'andres', 'guzman', 'udemy@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$p.DO6tWozc7HOjCz.wk1tehXD4.LT8rZITO59e055VPGw15LfiXlW', 1, 'chejo', 'zepeda', 'soporte@bdg.net');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);