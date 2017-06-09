/**
 * Created by aortmann on 08/06/17.
 */
interface Grouper<in T, out G> {
    fun assignGroup(x: T): G
}