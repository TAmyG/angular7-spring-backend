INSERT INTO regiones (id, nombre) VALUES (1, 'Sudam�rica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroam�rica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteam�rica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Ocean�a');
INSERT INTO regiones (id, nombre) VALUES (8, 'Ant�rtida');

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

/*Tabla productos*/
INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara digital DSC-W3200', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Apple iPod shuffle', 14999990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Notebook Z110', 379990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Bianchi Bicicleta Aro 26', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Mica Comoda 5 Cajones', 299990, NOW());

/*Facturas*/
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 7);


INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Bicicleta', 'Nota importante', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3, 2, 6);



