import akka.actor.Actor

class TestActor extends Actor {
  override def receive: PartialFunction[Any, Unit] = {
    case msg: String => sender ! "hello " + msg
    case _ => sender ! "wrong request"
  }
}
