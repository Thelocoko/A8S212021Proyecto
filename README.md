## A8S212021Proyecto
**Importante:**

Solo funciona en dispositivos con api menor a 23 porque los permisos de guardar imagenes se me deniegan

#### Funcionamiento:

Al iniciar la aplicacion no veremos nada debido a que no hay registros en la base de datos

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/00vacio.png" width="350" title="hover text">
</p>

Para añadir un usuario nos dirigimos al menu desplegable y seleccionamos la opcion agregar usuario

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/01menu.png" width="350" title="hover text">
</p>

Dentro de este registraremos un usuario, podremos seleccionar una foto de nuestra galeria

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/02campos.png" width="350" title="hover text">
</p>

cuando la selecciones se visualizara y ahora podremos guardar el registro, veremos un mensaje si el registro se guardo correctamente

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/04foto.png" width="350" title="hover text">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/05save.png" width="350" title="hover text">
</p>

Si regresamos a mostrar ususarios, a traves del menu, veremos nuestro usuario registrado

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/01menu.png" width="350" title="hover text">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/06usuario.png" width="350" title="hover text">
</p>

Al hacer click en el usuario veremos toda la informacion del usuario, podremos eliminarlo o editarlo

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/07info.png" width="350" title="hover text">
</p>

cuando presionemos cualquiera de los botones nos llevara a su respectivo fragmento

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/08actualizar.png" width="350" title="hover text">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/09eliminar.png" width="350" title="hover text">
</p>

En cambio si nos dirigimos a alguno de los fragmentos sin que hayamos seleccionado algun usuario, nos saldra un mensaje que debemos seleccionar un usuario y el fragmento no contendra datos

<p align="center">
  <img src="https://github.com/Thelocoko/imagenes/blob/main/10nousuario.png" width="350" title="hover text">
</p>

### NOTAS:

> Las imagenes se guardan en una carpeta llamada PhotosDB, ubicada en el almacenamiento externo del dispositivo, en la base de datos se guarda el nombre de la fotografia
>
> Cada que se elimina o se actualiza un usuario la fotografia se elimina, en el caso de actualizar se elimina la foto antigua
>
> La persistencia esta implementada en las fotografias
