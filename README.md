## Laboratorio Arquitectura 2

Enlace guia laboratorio
https://docs.google.com/document/d/1ywGLdSTqk3iRsMyDHdn54GW7hXTrrE4W_3DRT1ylrBI/edit?usp=sharing

## Integrantes
Alejandro Villegas Lopez.<br />
Daniel Molina Yepes.<br />
Johan Estiven Ospina Hincapié .<br />
Johan Camilo Suárez Lopera .<br />
Juan Pablo Rios Arenas .<br />
Juan Diego Isaza Londoño .<br />

## Descripción
Aplicación JEE que simula una pararela de pago

## Instrucciones despliegue
1. Iniciar el servidor Glassfish (glassfish-4.1.1).
2. Iniciar la base de datos Derby.
2. Correr el script que se encuentra en "scripts/01-bd.sql" sobre una base de datos derby. (se puede usar el siguiente comando "ij 01-bd.sql").
3. Ejecutar el comando "mvn package".
4. Desplegar el archivo que se encuentra en "target/laboratorio2.war" sobre el servidor Glassfish.
5. Acceder mediante la siguiente ruta  http://localhost:8080/laboratorio2/


