import Ejercicio1.Libro, Ejercicio1.listaLibro
import scala.io.StdIn

object prueba1 extends App {
  class Libreria ( libro: Libro) {
    //var listaLibro  = listaLibro
    println(listaLibro)

    def añadirLibro(libro: Libro) = {
      println("Estoy en el metodo con " + libro.titulo)
      for (x <- 0 until listaLibro.length) {
        if (libro.titulo == listaLibro(x)) {
          println("Ya existe este libro.")
        }
      }
    }
  }

  override def main(args: Array[String]): Unit = {
    println("Introduce el Libro:")
    val libroUsuario : String = StdIn.readLine()
    println("Introduce el número de páginas:")
    val numPagUsuario : Int = StdIn.readInt()
    var otherbook = new Libro(libroUsuario,numPagUsuario)
    new Libreria(otherbook).añadirLibro(otherbook)
  }


}
