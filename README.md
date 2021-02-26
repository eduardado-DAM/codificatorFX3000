# CodificatorFX3000

<img src="https://i.imgur.com/hNIxWIw.png" alt="codificator fx 3000 Logo" width="200">

<!-- <img src="src/main/resources/ceu/dam/edusoft/img/c3kDay.png" alt="codificator fx 3000 Logo" width="200"> -->

<!-- ![prueba](src/main/resources/ceu/dam/edusoft/img/c3kDay.png) -->

<details>
<summary>Requerimientos</summary>
repo seguridad Abel-> https://gitlab.com/abel.ceu/psp-dam.git
repo javafx Abel-> https://gitlab.com/abel.ceu/interfaces-dam-jfx.git


- Tendremos una pantalla de inicio con un logo de bienvenida.
- Tendremos una barra de menú superior con estas opciones:

    Codificador:
        Cifrar
        Descifrar
    Configuración
        Cargar clave pública
        Cargar clave privada

- Las pantallas de cifrar y descifrar serán dos textAreas con un botón. Un textArea de entrada y otro de salida (este de sólo lectura)
- Las pantallas de cargar clave tendrán la opción de subir un fichero y cargarlo en memoria como certificado público o privado.

</details>
<br>
TODO

- [ ] Navegación cambiando paneles

<details>
<summary>IDEAS</summary>

- El programa carga con el logo
- Hay una transición en la que el logo desaparece y aparecen los botones
- El programa no cambia de tamaño para tener siempre el mismo fondo
- Hay un menú falso que se llama menú falso y no hace nada. Simplemente está ahí porque me obligan :)
  - Es retraíble para no molestar (mirar enlace más abajo, y cambia a paneles llamados panel1 panel 2 etc)
- Aparecen los botones bellos y minimalistas
  - Rueda dentada (que gira) para Configuración (lado del servidor)
    - Load Public Key
    - Load Private Key
    - Puerto
    - Ip
- Hay una app Servidor y una app Cliente. La información viaja entre apps.
- El login guarda la clave codificada
- 
</details>
- [Menú retraíble](https://stackoverflow.com/questions/37234729/javafx-slide-out-menu)

