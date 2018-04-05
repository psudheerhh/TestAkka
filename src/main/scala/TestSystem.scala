import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object TestSystem {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("test-system")
    val greeterActor = system.actorOf(Props[TestActor], name = "greeter")
    implicit val timeout = Timeout(5 seconds)


    val greetMessageFuture = greeterActor ? "sudheer"

    greetMessageFuture.foreach(println)
  }

}
