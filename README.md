# ExerciseSearchBack

APP CONTADOR DE FRASES/PALABRAS
-------------------------------

La app tiene como objetivo mostrar el número de veces que aparece una frase y las palabras que contiene esa frase, esta se busca de una URL.

Frase ingresada por el usuario.

URL ingresada por el usuario.

EJECUTAR APP MAIN()
--------------------------------

Dentro del proyecto: 

Ir a la ruta src/main/java/com/sitrack

Ejecutar la clase Main

**App corriendo!**

A continuacón:

Ingresar URL 

Ingresar frase

Resultado de la búsqueda


EJECUCTAR APP EN DOCKER
--------------------------------

Para **construir nuestra imagen de Docker usando Dockerfile**, ejecutamos:

**docker build -t nombreimagen . **

EL comando anterior:
• Construye nuestro proyecto, nombrándolo  nombreimagen
• Etiqueta la imagen a través de la -t
• El punto(.) al final del comando le dice a Docker que busque el archivo en el directorio raíz del proyecto 

**Ejecutar la imagen de Docker**

**docker run -i nombreimagen**

El comando de arriba:
• Ejecuta la imagen de Docker 
• La opción **-i** mantiene STDIN abierto, es decir, nos va a permitir ingresar datos desde el teclado como la URL 

Listo!App corriendo!
