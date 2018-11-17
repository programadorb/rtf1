connect 'jdbc:derby://localhost:1527/matedu;user=root;password=root;create=true;';
create table usuario(
    id int PRIMARY KEY  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
    email varchar(128) not null, 
    nombre varchar(128) not null, 
    password varchar(32) not null
);

create table material(
    id int PRIMARY KEY  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
    nombre varchar(128) not null, 
    descripcion varchar(128) not null, 
    autor varchar(32) not null, 
    valor varchar(32) not null, 
    rutaArchivo varchar(256) not null
);