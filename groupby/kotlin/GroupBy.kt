/**
 * Created by aortmann on 08/06/17.
 */

class GroupBy {
    fun <T, G> groupBy(collection: Collection<T>, grouper: Grouper<T, G>): Map<G, Collection<T>> {
        val hashMap = mutableMapOf<G, MutableCollection<T>>()
        collection.forEach { x ->
            val key = grouper.assignGroup(x)
            val grouped = hashMap.getOrDefault(key, mutableListOf<T>())
            hashMap.put(key, grouped)

            grouped.add(x)
        }
        return hashMap
    }
}