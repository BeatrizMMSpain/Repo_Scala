object Tema4Opcionales extends App {
  var listaLibro:List[Libro]= List(new Libro("libro1",150),new Libro("libro2", 600), new Libro("libro3", 500))

  case class Libro (titulo : String, numpaginas : Int){

  }

}
