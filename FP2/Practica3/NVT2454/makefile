#
#   Makefile de ejemplo para la compilaci?n, creaci?n del jar y ejecuci?n
#

# Entorno.

DIRSRC = ./src/
DIRBIN = ./bin/
DIRJAR = ./jar/


# Clases.

RUTACLASE = fp2/poo/practica3/
INTERFAZ01=Persona
CLASE01   =Usuario
CLASE02   =Main
PRINCIPAL =fp2.poo.practica3.Main

$(DIRJAR)$(CLASE).jar:  $(DIRBIN)$(RUTACLASE)$(CLASE01).class \
                        $(DIRBIN)$(RUTACLASE)$(CLASE02).class \
                        $(DIRBIN)$(RUTACLASE)$(INTERFAZ01).class 
	jar cvfe $(DIRJAR)$(CLASE01).jar $(PRINCIPAL)            \
		-C  $(DIRBIN) $(RUTACLASE)$(CLASE01).class         \
		-C  $(DIRBIN) $(RUTACLASE)$(CLASE02).class         \
		-C  $(DIRBIN) $(RUTACLASE)$(INTERFAZ01).class       

$(DIRBIN)$(RUTACLASE)$(CLASE02).class: $(DIRSRC)$(RUTACLASE)$(CLASE02).java  $(DIRBIN)$(RUTACLASE)$(CLASE01).class $(DIRBIN)$(RUTACLASE)$(INTERFAZ01).class
	javac -g -Xlint -d $(DIRBIN) -classpath $(DIRBIN) $(DIRSRC)$(RUTACLASE)$(CLASE02).java

$(DIRBIN)$(RUTACLASE)$(INTERFAZ01).class: $(DIRSRC)$(RUTACLASE)$(INTERFAZ01).java
	javac -g -Xlint -d $(DIRBIN) -classpath $(DIRBIN) $(DIRSRC)$(RUTACLASE)$(INTERFAZ01).java

$(DIRBIN)$(RUTACLASE)$(CLASE01).class: $(DIRSRC)$(RUTACLASE)$(CLASE01).java $(DIRBIN)$(RUTACLASE)$(INTERFAZ01).class
	javac -g -Xlint -classpath $(DIRBIN) -d $(DIRBIN)  $(DIRSRC)$(RUTACLASE)$(CLASE01).java



   




ejecuta: 
	java -jar $(DIRJAR)$(CLASE01).jar


jdb:
	jdb -classpath ./jar/Usuario.jar -sourcepath ./src fp2.poo.practica3.Main




