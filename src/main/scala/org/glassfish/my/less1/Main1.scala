package org.glassfish.my.less1

import Array._

/**
 * Переменные и значения
 * *********************
 * @see http://www.w3ii.com/ru/scala/scala_variables.html
 *
 *      http://www.w3ii.com/ru/scala/scala_strings.html
 *      http://www.w3ii.com/ru/scala/scala_arrays.html
 *      http://www.w3ii.com/ru/scala/scala_operators.html
 *      http://www.w3ii.com/ru/scala/scala_if_else.html
 *      http://www.w3ii.com/ru/scala/scala_access_modifiers.html
 *      http://www.w3ii.com/ru/scala/scala_variables.html
 *      http://www.w3ii.com/ru/scala/scala_data_types.html
 *      http://www.w3ii.com/ru/scala/scala_basic_syntax.html
 *      (Настройка Scala Environment) http://www.w3ii.com/ru/scala/scala_environment_setup.html
 *
 * @see https://github.com/anton-k/ru-neophyte-guide-to-scala
 *
 * Scala в примерах
 * ****************
 * @see https://ru.wikibooks.org/wiki/Scala_в_примерах
 *
 * Java 8/Scala — різниця в підходах та взаємні інновації
 * *******************************************************
 * @see https://dou.ua/lenta/columns/java8-vs-scala/
 *
 * Почему Скала
 * ************
 * @see http://fprog.ru/2010/issue6/vlad-patryshev-why-scala/
 *
 * Scala Школа!
 * ************
 * @see https://twitter.github.io/scala_school/ru/
 *      https://twitter.github.io/scala_school/ru/basics2.html
 */

object Main1 {

  def main(args: Array[String]) {
    var a: String = "foo" // обычная переменная
    a = "bar"

    val b: String = "foo" // константная (finul) переменная
    //    b = "bar"

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 =  concat( myList1, myList2)

    // Print all the array elements
    for ( x <- myList3 ) {
      println( x )
    }



    var myList11 = range(10, 20, 2)
    var myList22 = range(10,20)

    // Print all the array elements
    for ( x <- myList11 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList22 ) {
      print( " " + x )
    }
  }

}
