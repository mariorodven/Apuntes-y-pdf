#
#   Makefile de ejemplo para la compilaci?n, creaci?n del jar y ejecuci?n
#

# CLASEPPAL es el nombre de la clase que contiene el metodo principal (main)
CLASEPPAL=Ejercicio01

# CLASEAUX es el nombre de la clase que se esta probando.
CLASEAUX=Calculadora

RUTACLASE=fp2/poo/practica1/


PRINCIPAL=fp2.poo.practica1.Ejercicio01


ejecutaJ: $(CLASEPPAL).jar
	java -jar $(CLASEPPAL).jar

$(CLASEPPAL).jar: $(RUTACLASE)$(CLASEPPAL).class $(RUTACLASE)$(CLASEAUX).class
	jar cvfe  $(CLASEPPAL).jar $(PRINCIPAL)  $(RUTACLASE)$(CLASEPPAL).class $(RUTACLASE)$(CLASEAUX).class


$(RUTACLASE)$(CLASEPPAL).class: $(RUTACLASE)$(CLASEPPAL).java
	javac -g -encoding ISO-8859-1 -Xlint $(RUTACLASE)$(CLASEPPAL).java


$(RUTACLASE)$(CLASEAUX).class: $(RUTACLASE)$(CLASEAUX).java
	javac -g -encoding ISO-8859-1 -Xlint $(RUTACLASE)$(CLASEAUX).java
