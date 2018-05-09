# Spring Boot SOAP Web Service

Proyecto Web Service con SOAP para buscar Alumnos por nif

	- Spring boot 2.0.1.RELEASE
	- Java 1.8
	- jaxb2
	
	
## definir xs:schema para WS

src/main/resources/alumnoss.xsd

Las clases java necesarias se generan solas mediante un plugin maven:

			<groupId>org.codehaus.mojo</groupId>
			<artifactId>jaxb2-maven-plugin</artifactId>
			<version>1.6</version>
			
## repositorio fake

AlumnoRepository esta hardocdeado con dos alumnos de prueba "pepe" y "pepa". No accedemos a ninguna bbdd.

## configuracion WS

com.ipartek.formacion.soap.config.WebServiceConfig

Usar anotacion @EnableWs
Se carga el alumnos.xsd y se define donde atiende el servicio web: [http://localhost:8080/ws/alumnos.wsdl](http://localhost:8080/ws/alumnos.wsdl)



## Definir @Endpoint


com.ipartek.formacion.soap.endpoints.AlumnoEndpoint

Clase donde se definien los mensajes de entrada y salida para el servicio de alumnos


## Ejemplo llamada desde SOAP UI

![Alt text](https://github.com/anderuraga/spring-boot-soap/blob/master/screenshot1.png)

			
			 
