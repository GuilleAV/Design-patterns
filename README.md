# Patrones de diseño 
## Definición

Los patrones de diseño son el esqueleto de las soluciones a problemas comunes en el desarrollo de software.

Brindan una solución ya probada y documentada a problemas de desarrollo de software que están 
sujetos a contextos similares. Debemos tener presente los siguientes elementos de un patrón: 
- Su nombre 
- El problema (cuando aplicar un patrón)
- La solución (descripción abstracta del problema) 
- Las consecuencias (costos y beneficios).

## Tipos de patrones
Tenemos la siguiente clasificación :

- Patrones Creacionales: Inicialización y configuración de objetos.
  
  1.[Singleton](#item1)
  
  2.[Factory](#item2)

- Patrones Estructurales: Separan la interfaz de la implementación. Se ocupan de cómo las clases y objetos se agrupan, para formar estructuras más grandes.

- Patrones de Comportamiento: Más que describir objetos o clases, describen la comunicación entre ellos.


<a name="item1"></a>
### Singleton
Permite tener una única instancia de una clase para que sea utilizado durante toda la aplicación.

Como ventaja vamos a tener mejor rendimiento en memoria.

La desventaja es que no podemos usar singleton durante toda la aplicación porque va a ver momentos en donde se requiera alguna instancia nueva . 
Ya que la operaciones entre usuarios necesitan otras datos.

Un ejemplo es tener una lista de países que no va a cambiar, y se accedida por muchos usuarios, para no generar una instancia en memoria 
para cada usuario que quiera ver los países, se genera solo una para todos.

Adjunto diagrama de clases de acuerdo a lo codificado.

![Diagrama de clases Singleton](https://github.com/GuilleAV/Design-patterns/blob/master/assets/Singleton.jpg)

<a name="item2"></a>
### Factory

En el patrón de fábrica creamos un objeto sin exponer la lógica de creación al cliente y nos referimos al objeto recién creado usando una interfaz común.

Despues tenemos una clase fabrica que nos va a crear una instancia de la conexión según el parámetro que le pasemos.

![Diagrama de clases Singleton](https://github.com/GuilleAV/Design-patterns/blob/master/assets/Factory.jpg)

Cree una interfaz llamada Coin, y después diferentes clases que las implementen como Euro y Dolar para obtener su cotización con el peso argentino y asi podemos hacer con diferentes monedas.

