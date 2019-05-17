import scala.io.StdIn

/**
  * Crea una clase Librería que tenga una colección Map como variable instancia y que uno la clave sea un objeto de la
  * clase Libro creada en los anteriores ejercicios y el valor sea el autor tipo String. La clase Librería tendrá un
  * método añadirLibro, que comprobará si el titulo del libro introducido por el usuario existe en la colección y si
  * no es así lo añadirá y otro método mostrarInformación que comprobará también si el título del libro introducido
  * por el usuario existe en la colección y mostrará la información del libro en este caso. El método main constará de
  * un menú para elegir entre las dos opciones
  */

object Ejercicio3 extends App {

  case class Libro(titulo: String, nPaginas: Int, autor: String)

  class Libreria(var libreriaData: Map[String, Libro]){
    var listaLibro:List[Libro]= List(
      new Libro("libro1",150, "autor1"),
      new Libro("libro2", 600, "autor2"),
      new Libro("libro3", 500, "autor3"))

    def añadirLibro(libro: Libro) = {

      var listaLibroNew : List[Libro] = List(new Libro(libro.titulo,libro.nPaginas,libro.autor))
      var listaActualizada : List[Libro] = listaLibro ::: listaLibroNew
      listaActualizada.foreach(libro => println(libro.titulo))
      for(a <- listaLibroNew; b <- listaLibro){
        if (a == b){
          println("Este libro ya existe.")
        }else{
          var listaActualizada : List[Libro] = listaLibro ::: listaLibroNew
        }
      }
    }

    def mostrarInformacion(libro: Libro): Unit ={
      println(s"A continuación se muestra la información del libro introducido: ")
      println(s"Título del libro: " + libro.titulo)
      println(s"Número de páginas del libro: " + libro.nPaginas)
      println(s"Autor del libroo: " + libro.autor)

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
          println("Introduce el Libro:")
          val libroUsuario : String = StdIn.readLine()
          println("Introduce el número de páginas:")
          val numPagUsuario : Int = StdIn.readInt()
          println("Introduce el nombre del autor:")
          val nomautorUsuario : String = StdIn.readLine()
          var otherbook = new Libro(libroUsuario,numPagUsuario,nomautorUsuario)
          var libreria = new Libreria(Map())
          libreria.añadirLibro(otherbook)
        case ShowInfo =>
          println("Introduce el Libro:")
          val libroUsuario : String = StdIn.readLine()
          println("Introduce el número de páginas:")
          val numPagUsuario : Int = StdIn.readInt()
          println("Introduce el nombre del autor:")
          val nomautorUsuario : String = StdIn.readLine()
          var otherbook = new Libro(libroUsuario,numPagUsuario,nomautorUsuario)
          var libreria = new Libreria(Map())
          libreria.añadirLibro(otherbook)
          libreria.mostrarInformacion(otherbook)

        case SALIR =>
          println("Has salido del programa")
          salir = true
      }
    }
  }
}
