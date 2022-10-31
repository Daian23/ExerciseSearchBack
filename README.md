# ExerciseSearchBack

APP CONTADOR DE FRASES/PALABRAS
-------------------------------

La app tiene como objetivo mostrar el número de veces que aparece una frase y las palabras que contiene esa frase, esta se busca de una URL.

Frase ingresada por el usuario.

URL ingresada por el usuario.

EJECUTAR NUESTRA APP MAIN()
--------------------------------

Dentro del proyecto: 

Ir a la ruta src/main/java/com/sitrack

Ejecutar la clase Main

**App corriendo!**

A continuacón:

Ingresar URL 

Ingresar frase

Resultado de la búsqueda

##DOCKER##

**Qué es un contenedor?**
Un contenedor es una unidad estándar de software que empaqueta el código y todas sus dependencias para que la aplicación se ejecute de manera rápida y confiable de un entorno informático a otro. 

**¿Qué es una imagen de contenedor?**
Una imagen de contenedor de Docker es un paquete de software ligero, independiente y ejecutable que incluye todo lo necesario para ejecutar una aplicación: código, tiempo de ejecución, herramientas del sistema, bibliotecas del sistema y configuraciones. Las imágenes de contenedores se convierten en contenedores en tiempo de ejecución y, en el caso de los contenedores de Docker, las imágenes se convierten en contenedores cuando se ejecutan en Docker Engine .. 

EJECUTAR NUESTRA APP EN DOCKER
--------------------------------

Para **construir nuestra imagen de Docker usando Dockerfile**, ejecutamos:

**docker build -t nombreimagen .**

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
