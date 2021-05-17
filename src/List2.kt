

fun main(){
    println(evenNames(listOf("Loyce","Akal","Marie","Cate","Tabby","Diana","Mercy","Sophy","Michelle","Carol")))
    println(peopleHeight(listOf(2.4,4.3,1.2,2.5,5.5)))
   people(Person("Loyce",18,3.3,59.3))
    var name=cars(listOf(
    Car("TH45EW",3.2),
    Car("AS54K",4.0),
    Car("RIF93",3.3),

))
    println(name)

}
fun evenNames(names:List<String>):List<String>{
     var jina = mutableListOf<String>()
     for (name in names) {
         if (names.indexOf(name) % 2 == 0)
                 jina.addAll(listOf(name))
        }
return jina
 }
fun peopleHeight(height:List<Double>):Pair<Double,Double>{
    var total=height.sum()
    var average=height.average()
    return Pair(total,average)
}
 data class AverageTotal(var average:Double,var total:Double) {
     fun peopleHeight(height: List<Double>): AverageTotal {
         var total = height.sum()
         var avr = height.average()
         var avrtotal = AverageTotal(average, total)
         return avrtotal
     }
 }
data class Person(var name:String,var age:Int,var height:Double,var weight:Double )
fun  people (people:Person){
    var people= listOf(Person("Loyce",18,3.3,59.6),
    Person("Tabby",19,3.1,40.6),
  Person("Michelle",20,4.4,70.6),
  Person("Mercy",21,3.3,59.6)
    )
    var descendingSortedPeople=people.sortedByDescending{people->people.age }
    println(descendingSortedPeople)



}
data class Persons(var name:String,var age:Int,var height:Double,var weight:Double )
fun newpeople(people:List<Persons>):List<Persons> {
    var newPeople = mutableListOf<Persons>()
        Persons("Loyce", 18, 3.3, 59.6)
        Persons("Tabby", 19, 3.1, 40.6)
        Persons("Michelle", 20, 4.4, 70.6)
        Persons("Mercy", 21, 3.3, 59.6)
        newPeople.addAll(listOf(
                (Persons("Irene", 22, 4.5, 61.4)),
                Persons("Julian", 23, 4.5, 67.9)
            )
        )

return people
}
    data class Car(var registration: String, var mileage: Double)

        fun cars(garis: List<Car>): Double {
            var totalMileage = 0.0
            for (car in garis) {
                totalMileage += car.mileage
            }
            var average = totalMileage / garis.count()
            return average
        }











