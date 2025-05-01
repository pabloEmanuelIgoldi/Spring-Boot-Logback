# **LogBack**

# Índice
### Definición del proyecto
### Sobre Logback
### Niveles del log
### Appender del log
### Consideraciones finales
### Comandos para crear el artefacto según perfil
### Probar aplicación

### Índice de proyectos Spring Boot


#  **Definición del proyecto**

El presente proyecto es una muestra de como  manejar y configurar los registros de nuestras aplicaciones.

Contiene una configuración para ser ejecutada en tres ambientes distintos: desarrollo, testing y producción. 

Cada ambiente tendrá levels y appenders distintos.

Pero primero, aclaremos el marco teorico del proyecto (Logback, level, appender).


#  **Sobre Logback**


Logback es un framework de registro(logging) que se usa comúnmente como la implementación predeterminada de SLF4J. 

Spring Boot usa Logback por defecto y lo configura automáticamente. Sin embargo, se puede personalizar mediante archivo de configuración*.

Puede escribir logs en consola(configuración por defecto) y archivos(a configurar).

Archivo de configuración:

**src/main/resources/logback-spring.xml**


##  **Niveles del log**

Los niveles de log permiten clasificar la importancia de los mensajes que se registran en la aplicación. 

Esto es útil para depuración, monitoreo y mantenimiento, ya que permite filtrar la información dependiendo del contexto.

###  **Niveles:**
- DEBUG:	Información útil para desarrolladores, con detalles del flujo del código.	
		Variables, ejecución de métodos, SQL ejecutado.
  
- INFO:  Información relevante sobre el estado normal de la aplicación.	
	  Inicio de servicios, conexión establecida, procesos exitosos.
   
- WARN:	Indica posibles problemas, pero la aplicación sigue funcionando.	
		Tiempo de respuesta lento, uso de métodos obsoletos.
  
- ERROR:	Fallos en la aplicación que requieren atención.	
		Excepciones no controladas, fallos de conexión a base de datos.


###  **Jerarquía de niveles**

Cada vez que le seteamos un nivel bajo, también toma sus niveles superiores.

DEBUG es el nivel más bajo, ERROR es el más alto:

**DEBUG < INFO < WARN < ERROR**


##  **Appender del log**
Existen diferentes maneras que se puede mostrar la información:
- STDOUT: consola.
- FILE: archivo. El nombre y la ubicación dependen de la configuración.
- ROLLING_FILE: rotación de archivo. Se crea un nuevo archivo(generalmente diario) y se guarda el anterior. Ideal para controlar el tamaño del archivo.

###  **Appender segun ambientes**
- dev: STDOUT y FILE
- test: FILE
- prod: ROLLING_FILE

##  **Consideraciones finales**
No registrar información sensible en producción.

No guardar datos como contraseñas, tokens o información de usuarios en logs.

Evitar DEBUG en producción, ya que puede revelar datos internos.


##  **Comandos para crear el artefacto según perfil**


Crea el artefacto con el Profile Activo por default(dev):

**mvn clean package -DskipTests**

Crea el artefacto con el Profile Activo en dev:

**mvn clean package -DskipTests -P dev**

Crea el artefacto con el Profile Activo en test:

**mvn clean package -DskipTests -P test**

Crea el artefacto con el Profile Activo en prod:

**mvn clean package -DskipTests -P prod**

##  **Probar aplicación**

 Opciones:
 
 1:
 
  **curl -X GET "http://localhost:8080/api/v1/test"**
 
 2:	
 
	 http://localhost:8080/swagger-ui/index.html


# Índice de proyectos Spring Boot
- [Response Uniforme](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Response-Wrapper)
- [LogBack](https://github.com/pabloEmanuelIgoldi/applogback)
- [Profile](https://github.com/pabloEmanuelIgoldi/appProfile)
