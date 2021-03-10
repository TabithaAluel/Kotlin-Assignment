fun main() {
    school()
    sentence("Aluel",26)
    Class()
    myName("Aluel")
    myName("Achol")


}
fun school() {
    var name="akirachix"
    print(name[0])
    print(name[2])
    println(name[3])
}
fun sentence(name:String, age:Int) {
    val Intro=("Hi,my name is $name and I am $age years old ")
    println(Intro)
}
fun Class() {
    val string= "Aluel"
    println(string.length)
}
fun myName(name:String) {
    if(name=="Aluel") {
        println("That's me!")
    }
        else{
            println("I don't know who that is")
    }
    }






