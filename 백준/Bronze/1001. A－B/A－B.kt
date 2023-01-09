fun main() {
    var num = readln().split(" ").map { it.toInt() } 
    println("${num[0]-num[1]}")
}