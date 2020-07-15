fun main(args: Array<String>) {
    println("Hola mundo")
    val a = 4
    val b = 2
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    val name = args[0]
    println(name)

    val nombre = "Rafael"
    val apellido: String = "Flores"

    println("Tu nombre es $nombre $apellido")

    //Raw strings
    """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam non lorem euismod urna cursus elementum. 
        Ut ipsum elit, condimentum eu cursus id, placerat at ligula. Praesent sodales elit ac sagittis malesuada. Duis sodales, 
        diam ut pretium ullamcorper, nibh ex iaculis diam, blandit elementum mauris lectus ut turpis. Morbi nec arcu sed libero 
        convallis consequat eget nec dolor. Nam vel est ex. Phasellus venenatis rhoncus nunc, sit amet aliquet metus 
        sollicitudin eu.
    """.trimIndent()

    val oneToHundred = 1..5
    for (i in oneToHundred){
        println(i)
    }

    val aToC = 'a'..'c'
    for (i in aToC) {
        println(i)
    }
}