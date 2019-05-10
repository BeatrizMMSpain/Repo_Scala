object Ejercicio2 extends App {

  //Creamos las listas que contienen las letras según se indica
  val lista1 : List[String] = List("A","B","C","D")
  val lista2 : List[String] = List("E","F","G","H")
  val lista3 : List[String] = List("I","J","K","L")
  val lista4 : List[String] = List("M","N","Ñ","O")
  val lista5 : List[String] = List("P","Q","R","S")
  val lista6 : List[String] = List("T","U","V","W")
  val lista7 : List[String] = List("X","Y","Z")

  //Se agrupan todas las listas en una
  val abecedario1 : List[String] = lista1 ::: lista2
  val abecedario2 : List[String] = abecedario1 ::: lista3
  val abecedario3 : List[String] = abecedario2 ::: lista4
  val abecedario4 : List[String] = abecedario3 ::: lista5
  val abecedario5 : List[String] = abecedario4 ::: lista6
  val abecedario  : List[String] = abecedario5 ::: lista7
  println("Impresión de la lista:")
  println(abecedario)

  //pasar abecedario List a Maps agregando un valor para cada elemento de la lista

  //Crear la variable map vacía y mutable
  var mapAbecedario = scala.collection.mutable.Map[Int, String]()

  //Rellenamos la variable Map con los elementos de la lista
  for (x : Int <- 0 until abecedario.length - 1 ){ mapAbecedario += (x -> abecedario(x)) }
  println("Impresión de la variables Map:")
  println(mapAbecedario)



}
