fun fizzBuzz(n: Int) = (1..n).map {
    when ((it % 3 == 0) to (it % 5 == 0)) {
        (true to true) -> "FizzBuzz"
        (false to true) -> "Buzz"
        (true to false) -> "Fizz"
        else -> it.toString()
    }
}

//    val result = mutableListOf<String>()
//
//    for (t in 1..n) {
//        if((t % 15) == 0) {
//            result.add("FizzBuzz")
//        } else if((t % 3) == 0) {
//            result.add("Fizz")
//        } else if((t % 5) == 0) {
//            result.add("Buzz")
//        } else {
//            result.add(t.toString())
//        }
//    }
//
//    return result;
//}
