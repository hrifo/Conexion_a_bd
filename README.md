# Conexion a BD MySQL con Java
## IDE: Netbeans 12.4
## JDK: 17
Se realiza la conexión a BD con los links de descarga y el software necesario.

### Si se desea crear proyecto nuevo, se debe crear un `Java with Ant`

Archivos para descargar previos al deploy de la aplicación.

1.- MySql Connector: https://downloads.mysql.com/archives/c-j/, descargar versión `8.0.26` y sistema operativo `Platform independent`. Luego descargar versión .ZIP `(mysql-connector-java-8.0.26.zip)`
  
    1.1.- Instalación:
      - Dentro del .ZIP se encontrará un archivo llamado `mysql-connector-java-8.0.26.jar`, es el único que deben descomprimir y almacenar en un lugar seguro.
  
2.- XAMPP: https://www.apachefriends.org/xampp-files/8.0.13/xampp-windows-x64-8.0.13-0-VS16-installer.exe
  
    2.1.- Instalación: 
      - Seleccionar todas las opciones MENOS MySql (Se instalará el servicio aparte).
      - Mantener la carpeta `C:\xampp` vacía hasta que se seleccione en la instalación.

3.- MySql Workbench: https://downloads.mysql.com/archives/workbench/  
    
    3.1.- Instalación:
      - Instalación completa hasta finalizar.

4.- Mysql Installer: https://dev.mysql.com/downloads/installer/

    4.1.- Instalación:
      - Descargar la versión de instalador web llamada `(mysql-installer-web-community-8.0.27.1.msi)`
      - Les dará una bienvenida, luego apretar next y les pedirá actualizar, DESELECCIONAR Y NO ACTUALIZAR dado que perjudicará los pasos del tutorial por pérdida de algunas características.
      - Luego presionar "Cancelar" y los enviará a una tabla con sus productos instalados y aparecerá, presionar el botón "ADD" para añadir características.
      - Abrir la rama "MySQL Servers", luego abrir `MySQL Server`, luego abrir `MySQL Server 8.0` y selecionar la primera que aparece y apretar la flecha hacia la derecha para incluir en el listado de productos instalados.
      - Luego presionar el botón inferior `NEXT` y ejecutar la instalación.
      
5.- Una vez que esté todo instalado se debe abrir MySQL Workbench y en la sección MySQL Connections añadir una nueva conexión
  
    5.0.- Se debe levantar servicio apache en Xampp e iniciar en services.msc `MySQL80`
    5.1.- Se debe colocar un nombre a la conexión y en la pestaña SSL colocar la opción `If available` (o sea, solo solicitar si es que está disponible).
    5.2.- Presionar botón "Test Connection" y probar su conexión, si es exitosa deben salir de esa ventana y presionar la conexión hecha.
    
    
6.- Clonar el repositorio a su local, setear los valores de su conexión en el string de conexión en la clase y probar. Debería aparecer un mensaje de conexión exitosa.
