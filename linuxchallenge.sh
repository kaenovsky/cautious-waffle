# Evaluación de Linux

# 1) ¿Con qué comando se averigua el directorio actual?

pwd # print working directory

# 2) ¿A qué directorio espera que se cambie si se ejecuta “cd” sin argumentos?

$HOME # cd sin argunmentos nos lleva a nuestra home de usuario

# 3) ¿Cómo se obtiene un listado extendido de archivos (con tamaño, fecha etc.)?

ls -hal # h para 'human', a para 'all' que incluirá los ocultos y l para 'long list'

# 4) ¿Qué es un proceso? ¿Cómo obtengo una lista de todos los procesos de mi usuario?

ps aux | grep $USER 

# un proceso es la instancia de un programa que se está ejecutando en nuestro sistema
# ps lista los procesos y con grep podemos filtrar los que pertenecen al usuario en uso con 
# la variable $USER o escribiendo el nombre del usuario
# aux nos muestra en formato BSD que incluye toda la información de usuarios y permisos


# 5) Dada la siguiente salida:
# > /bin/ls -a
# . .. .harry Hat boat hill house push tree
# ¿Qué imprime el comando “echo h*”?

echo "rta: harry hill house" # Solo los archivos que empiecen con h minúscula

# 6) Estando en el mismo directorio que en la pregunta 5 ¿Qué valor tendría “$1” si se llama al siguiente
# script con “h*” como argumento?
# #/bin/ksh
# echo my first argument is $1
# a) h* <------ OK
# b) .harry
# c) hill
# d) Hat
# e) ninguno de los anteriores

# rta: $1 representa el primer argumento de un script

# 7) ¿Qué ocurre si por accidente ingresa un espacio extra al querer borrar todos los archivos con extensión
# “.old” y escribe “rm -f * .old”?

echo "los archivos se borran igual"

# 8) Dada las siguientes salidas:

# > ls -l
# total 0
# -rw-r--r-- 1 user users 38 Oct 6 12:24 myscript.sh
# > cat myscript.sh
# #!/bin/ksh
# echo This is a test script
# > ./myscript.sh
# ksh: ./myscript.sh: cannot execute - Permission denied

# ¿Qué debería hacer para solucionar el problema y poder ejecutar el script?

sudo chmod +x ./myscript.sh

# 9) Para el mismo archivo de la pregunta 8 ¿Qué debo hacer para que pueda ser modificado por cualquier
# usuario del grupo “developers”? (sin importar el acceso para el grupo “users”)

sudo chown :developers ./myscript.sh

# 10) ¿Cómo puedo saber cuanto espacio en disco ocupa un directorio completo?

du -h /dir/ # -h para ver con formato leible por humanos

# 11) ¿Cómo puedo saber cuanto espacio libre hay en un volumen dado?

df -h /dev/sda1 # chequeamos con df el espacio libre y con /dev/sda1 indicamos ese volumen dado

# 12) ¿Cómo puedo saber qué otros usuarios están conectados al sistema?

w

# 13) ¿Qué comando ejecutaría (con parámetros) para hacer un backup comprimido del directorio “old” y
# todos sus subdirectorios?

tar -zcvpf old-backup.tar.gz /old

# 14) ¿Cómo haría para recuperar todos los archivos contenidos en un archivo llamado “backup.tgz”?

sudo tar -xpvf backup.tgz

# 15) ¿Con qué comando puedo buscar ocurrencias de un texto dentro de un archivo? Escriba como buscaría
# las ocurrencias de “myMethod” dentro de todos los archivos con extensión “.cpp” en el directorio actual.

grep -r myMethod ./*.cpp

# 16) Elija uno de los comandos “cut”, “sed”, “awk” y explique para que se usa.

echo "rta: el comando 'sed' se utiliza para editar texto rápidamente sin una interfaz como vim o nano"

# 17) ¿Que es un link simbólico? Escriba como crearía un link simbólico llamado “alink.txt” a un file
# llamado “afile.txt”

echo "rta: un link simbólico es como un atajo entre dos archivos, cuando creamos un link simbólico todos los cambios
que se realicen en ese archivo se replicarán en el archivo enlazado."

ln -s ./alink.txt /tmp/afile.txt