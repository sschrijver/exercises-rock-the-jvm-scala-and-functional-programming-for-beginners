package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2

  aVariable += 3 // Side effect

  println(aVariable)

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // IF EXPRESSION

  println(aConditionValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile: Unit = while (i < 10) {
    println(i)
    i += 1
  }

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue: Unit = aVariable = 3 // Unit === void
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "Goodbye"
  }

  val someValue = {
    2 < 3
  }

  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)

}
