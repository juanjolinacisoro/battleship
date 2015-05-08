# Instrucciones para trabajar con github
## Para clonar un proyecto
primer paso: ir al proyecto en git hub que se quiere clonar y copiar al portapapeles la direccion url, que aparece en el panel derecho.

segundo paso: abrir una ventana de git. Esto nos dejara en la carpeta raiz de git (en ningun repositorio especifico).

tercer paso: `git clone` y pegar la direccion del portapapeles (con el mouse) y escribir el nombre de la carpeta que se quiere crear. por ejemplo si quieres clonar el proyecto battleship en una carpeta que se llame de igual  forma debes escribir 
`git clone https://github.com/juanjolinacisoro/battleship.git battleship`


## Para bajar el código 


`git status` Esto muestra el estado del repositorio

`git pull` Descarga los datos desde el servidor github y los mezcla con los códigos del comuptador local (tu computador).


## Para subir código


`git add .` Esto agrega todos los archivos del proyecto para que sean subidos al sistema. Github se encarga de 

identificar cuales han sido modificados y sólo subirá esos archivos. Ademas git verificará si existen copias en conflicto y avisará a los usuarios o desarrolladores.

`git commit -a -m "Un mensaje o comentario"` Este comando procesa el envío de los archivos y les agrega un mensaje que aparecera en el sistema de la página web. En este paso aún no se hace efectivo el envío.

`git push` Este comando sube los archivos al servidor. En este punto ya se visualizan en la página.

## Terminal de git

La terminal de git es una consola que en window se ve como una pantalla negra, que permite ingresar comandos desde teclado. A continuacion se listan los comandos mas esenciales para trabajar.

1. `dir` lista el contenido de la carpeta actual
2. `cd NombreDeCarpeta` cambia a la carpeta especificada
3. `cd ..` regresa a la carpeta de un nivel superior 

## Problemas detectados en windows 8
1. Para windows 8 no existe un menu o barra de herramientas por lo que se deben realizar las ordenes mediante la ventana de comandos.

2. Hemos detectado en window 7 que el comando `pull` no funciona. La solucion es hacer un llamado a `git fetch` seguido de la instruccion `git merge origin/master`.


