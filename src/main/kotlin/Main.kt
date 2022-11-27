fun main(args: Array<String>) {
    println("Сalculus parallelepiped volumine!")
    println("Input ore1")
    val ore1 = readln().toFloat()
    println("Input ore2")
    val ore2 = readln().toFloat()
    println("Input ore3")
    val ore3 = readln().toFloat()

    val volumine = ore1*ore2*ore3
    println("Volumine equale $volumine")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}