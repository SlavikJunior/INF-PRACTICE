fun main() {
//    val girlName: String = "Marry"
//    val old: Int = 18;
//    println(girlName + " is $old years old!")

    val girls = "Sasha Tonya Dasha"
    for (girl in girls) {
        if (girl == ' ') {
            println()
        }
        else {
            print(girl + " ")
        }

    }
}