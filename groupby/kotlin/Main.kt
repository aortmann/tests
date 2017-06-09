
/**
 * Created by aortmann on 08/06/17.
 */
fun main(args: Array<String>){
    val c = listOf("mesa", "silla", "nota", "pera", "cinco", "hola", "la", "guitarra")
    System.out.println(GroupBy().groupBy(c, GrouperForCharacters()))

    val d = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    System.out.println(GroupBy().groupBy(d, GrouperForIntegers()))
}

class GrouperForCharacters : Grouper<kotlin.String, Int> {
    override fun assignGroup(x: kotlin.String): Int {
        return x.length
    }
}

class GrouperForIntegers : Grouper<Int, Int> {
    override fun assignGroup(x: Int): Int {
        return x % 5
    }
}