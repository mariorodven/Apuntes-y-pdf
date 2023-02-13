CLASEPPAL= HolaMundo
JAVAC=javac
JAVA=java
JAR=jar
OPCIONES= -Xlint -g -classpath ./bin -cp ./bin -d ./bin 

#Generacion del jar
HolaMundo.jar: ./bin/fp2/poo/practica1NVT2454/HolaMundo.class
	jar cvfe ./jar/HolaMundo.jar fp2.poo.practica1NVT2454.HolaMundo		\
													-C ./bin ./fp2/poo/practica1NVT2454/HolaMundo.class
#Ejecucion del fichero  HolaMundo
ejecucion:
	java -classpath ./bin:./jar -cp bin fp2.poo.practica1NVT2454.HolaMundo

#compilación del fichero HolaMundo.java
./bin/fp2/poo/practica1NVT2454/HolaMundo.class: ./src/fp2/poo/practica1NVT2454/HolaMundo.java 
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/practica1NVT2454/HolaMundo.java
