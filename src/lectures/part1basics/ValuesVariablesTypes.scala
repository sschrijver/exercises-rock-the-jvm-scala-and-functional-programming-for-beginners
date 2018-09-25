package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  // Immutable
  val aString: String = "Hello"
  val anotherString = "Goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 91240912409093113L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  var aVariable: Int = 4
  aVariable = 5 // Side effect
}
