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
  
  3.[AbstractFactory](#item3)
  
  4.[Prototype](#item4)

- Patrones Estructurales: Separan la interfaz de la implementación. Se ocupan de cómo las clases y objetos se agrupan, para formar estructuras más grandes.

- Patrones de Comportamiento: Más que describir objetos o clases, describen la comunicación entre ellos.


<a name="item1"></a>
### Singleton
Permite tener una única instancia de una clase para que sea utilizado durante toda la aplicación.

Como ventaja vamos a tener mejor rendimiento en memoria.

La desventaja es que no podemos usar singleton durante toda la aplicación porque va a ver momentos en donde se requiera alguna instancia nueva . 
Ya que la operaciones entre usuarios necesitan otras datos.

Un ejemplo es tener una lista de países que no va a cambiar, y es accedida por muchos usuarios, para no generar una instancia en memoria 
para cada usuario que quiera ver los países, se genera solo una para todos.

Adjunto diagrama de clases de acuerdo a lo codificado.

![Diagrama de clases Singleton](https://github.com/GuilleAV/Design-patterns/blob/master/assets/Singleton.jpg)

<a name="item2"></a>
### Factory

En el patrón de fábrica creamos un objeto sin exponer la lógica de creación al cliente y nos referimos al objeto recién creado usando una interfaz común.

Despues tenemos una clase fabrica que nos va a crear una instancia de la moneda según el parámetro que le pasemos.

![Diagrama de clases Factory](https://github.com/GuilleAV/Design-patterns/blob/master/assets/Factory.jpg)

Cree una interfaz llamada Coin, y después diferentes clases que las implementen como Euro y Dolar para obtener su cotización con el peso argentino y asi podemos hacer con diferentes monedas.

<a name="item3"></a>
### Abstract Factory

Este patrón bien llamado fábrica de fábricas o super fábrica. Si necesitamos un objeto tenemos que indicar primero que fábrica va a producir este objeto y luego podemos tener la instancia del objeto que necesitamos.

![Diagrama de clases Abstract Factory](https://github.com/GuilleAV/Design-patterns/blob/master/assets/AbstractFactory.jpg)

En la imagen tengo varias monedas con sus cotizaciones que implementan la interface Coin. Tenemos dos fábricas BitCoinFactory y otra CoinFactory ambas extienden de la clase abstracta AbstractFactory y en la clase FactoryProducer hacemos uso de la clase AbstractFactoryt en donde de acuerdo al tipo de fábrica (bitcoin o coin) obtenemos la instancia de fábrica que necesitamos y con ella la instancia de la moneda.

<a name="item4"></a>
### Prototype

El objetivo de este patrón es crear una nueva instancia con los valores clonados o copiados de otra instancia.

Es muy útil su implementación en el caso de una costosa operación de base de datos, en donde podemos almacenar en caché el objeto, devolver su clon en la próxima solicitud y actualizar la base de datos cuando sea necesario. Reduciendo así las llamadas a la base de datos.

![Diagrama de clases Prototype](https://github.com/GuilleAV/Design-patterns/blob/master/assets/Prototype.jpg)









