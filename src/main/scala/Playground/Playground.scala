package playground
object Playground extends App {
   val actorSystem = ActorSystem("Hello akka")
    println(actorSystem.name)
}