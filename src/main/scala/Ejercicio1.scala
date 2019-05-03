/**
  * En este ejercicio se resuelve la siguiente parte de las diapositivas:
  *
  * Crea una clase case Libro que tenga como parámetros título y número de páginas.
  * Crea una lista de 4 objetos de tipo Libro y muestra el objeto con el mayor número
  * de páginas y también el que tenga el menor número páginas.
  *
  * Amplia la lista de libros del ejercicio anterior, ordena la lista de mayor número
  * de páginas a menor y después obtén los libros que tengan más de 200 páginas.
  *
  */
object Ejercicio1 extends App {

  /**
    *   Clase que relaciona un par de valores titulo/numpaginas que definen un libro.
    *
    * @param titulo (String): Es el título del libro
    * @param numpaginas (Int) : Es el número de páginas que contiene un libro
    */
  case class Libro (titulo : String, numpaginas : Int){}

  override def main(args: Array[String]): Unit = {
    //Se genera una lista de libros con los datos indicados en el enunciado
    var listaLibro:List[Libro]= List(new Libro("libro1",150),new Libro("libro2", 600), new Libro("libro3", 500))


    println("El objeto con mayor número de páginas es: " + listaLibro.maxBy( listaLibro => listaLibro.numpaginas))
    println("El objeto con menor número de páginas es: " + listaLibro.minBy( listaLibro => listaLibro.numpaginas))


    //Añadimos un título más
    var listaLibro2: List[Libro] = listaLibro :+ {Libro("libro4", 250)}

    //Ordenamos la lista de mayor a menor número de páginas
    println("A continuación se muestra la lista ordenada de mayor a menor número de páginas:")
    println(listaLibro2.sortWith((l1,l2) => l1.numpaginas > l2.numpaginas))

    //Mostramos sólo los libros que tengan más de 200 páginas
    println("Los libros que tienen más de 200 páginas son:")
    listaLibro2.withFilter(l1 => l1.numpaginas >= 200).foreach( libro => println(libro))

  }
}
