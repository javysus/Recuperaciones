--Tablas a crear previamente en la base de datos

CREATE TABLE public.salarecuperacion(
    id_sala serial not null,
    camas int not null,
    disponibles int not null,
    primary key (id_sala)
);

CREATE TABLE public.camarecuperacion(
    id_cama serial not null,
    id_sala integer not null,
    disponible boolean default TRUE,
    id_paciente integer not null unique default 0,
    id personalR integer not null unique default 0,
    fechauso timestamp default null,
    primary key (id_cama),
    FOREIGN key (id_sala) references salarecuperacion(id_sala)
);

CREATE TABLE public.equipamiento(
    id_equipo serial not null,
    nombre varchar(50),
    id_sala integer not null,
    primary key (id_equipo),
    FOREIGN key (id_sala) references salarecuperacion(id_sala)
);