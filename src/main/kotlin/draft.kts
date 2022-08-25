import kotlin.math.pow

// Basic function
fun plus(a: Int, b: Int): Number {
    return a + b
}

// One line basic function
fun sqr(a: Int) = a * a

// Lambda function with types
val minus: (Int, Int) -> Int = {a: Int, b: Int -> a - b}

// Lambda function without types
val minus1 = {a: Int -> a - 1}

// Anonymous function
val plus1 = fun(x: Int): Int = x + 1

//////
val items = listOf(1, 2, 3, 4, 5)

items.map (::println)

listOf(
    items.map(plus1) ,
    items.map (Int::inc) ,
    items.map { it.inc() } ,
    items.map { it + 1} ,
    items.map(fun(item) = item + 1) ,
    items.map { item -> item + 1 } ,
    items.map { item: Int -> item + 1 } ,
    items.mapIndexed { idx, it -> it + idx } ,
).also(::println)



items.map { sqr(it) }


items.fold(0, { acc: Int, i: Int ->
    val result = acc + i
    result
})


items.fold(0) { acc: Int, i: Int ->
    val result = acc + i
    result
}

items.fold(0) { acc, i ->
    val result = acc + i
    result
}


val product = items.fold(1, Int::times)


