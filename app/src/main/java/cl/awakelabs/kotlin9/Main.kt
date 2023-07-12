package cl.awakelabs.kotlin9

fun main() {
    println("Ingrese el valor")

    val input = readLine()!!.toDouble()
    val fahrenheit =  (input * 9/5) + 32

    println("Grados Fahrenheit $fahrenheit")

    val kelvin = input + 273.15

    println("Grados Kelvin $kelvin")

    val fahrenheitToKelvin = 5/9 *(fahrenheit - 32) + 273.15

    println("De grados Fahrenheit a Kelvin $fahrenheitToKelvin")
}
fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}