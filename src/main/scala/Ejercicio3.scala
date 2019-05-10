import Ejercicio1.Libro
import scala.io.StdIn


object Ejercicio3 extends App {

  /**
    * Crea una clase Librería que tenga una colección Map como variable instancia y que uno la clave sea un objeto de la
    * clase Libro creada en los anteriores ejercicios y el valor sea el autor tipo String. La clase Librería tendrá un
    * método añadirLibro, que comprobará si el titulo del libro introducido por el usuario existe en la colección y si
    * no es así lo añadirá y otro método mostrarInformación que comprobará también si el título del libro introducido
    * por el usuario existe en la colección y mostrará la información del libro en este caso. El método main constará de
    * un menú para elegir entre las dos opciones
    */

  class Libreria ( map: Map[Libro -> Libro]){
    def añadirLibro: Unit ={

    }

    def mostrarInformación{
    }
  }
  }

  override def main(args: Array[String]): Unit = {
    //Opciones a elegir por el usuario
    val AddLibro: Int = 1
    val ShowInfo: Int = 2
    val SALIR: Int = 3
    val libroUsuario: String = ""

    //Inicialización de variables
    var operacion: Int = 0
    var salir: Boolean = false

    while (!salir) {
      println("Elige lo que deseas hacer: ")
      println("1 - Añadir un nuevo Libro.")
      println("2 - Añadir un nuevo Libro y mostrar información.")
      println("3 - Salir")
      operacion = StdIn.readInt()

      operacion match {
        case AddLibro =>

        case ShowInfo =>


        case SALIR =>
          println("Has salido del programa")
          salir = true
      }
    }
}
