use practicante;

create table clientes (
	id_cliente varchar(15) primary key,
	nombres varchar(15),
	apellidos varchar(15),
	nro_documentos varchar(15),
	email varchar(15),
	create_at date
);

create table productos (
	id_producto varchar(15) primary key,
	descripcion varchar(15),
	cantidad integer,
	estado varchar(15)
);

create table ventas (
	id_venta varchar(15) primary key,
	fecha date,
	serie varchar(15),
	numero varchar(15),
	total numeric(18,2),
	id_cliente varchar(15),
	id_producto varchar(15),
	foreign key (id_cliente) references clientes(id_cliente),
	foreign key (id_producto) references productos(id_producto)
);

create table detalle_ventas(
	id_detalle  varchar(15) primary key,
	cantidad integer,
	precio numeric(18,2),
	sub_total numeric(18,2),
	id_venta varchar(15),
	id_producto varchar(15),
	foreign key (id_venta) references ventas(id_venta),
	foreign key (id_producto) references productos(id_producto)
);

drop table detalle_ventas;
drop table ventas;
drop table clientes;
drop table productos;



