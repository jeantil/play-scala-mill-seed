import mill._
import $ivy.`com.lihaoyi::mill-contrib-twirllib:0.3.6`,  mill.twirllib._
import $ivy.`com.lihaoyi::mill-contrib-playlib:0.3.6-49-17947f`, mill.playlib._


object `play-scala-seed` extends PlayModule with SingleModule{
  //config
  override def playVersion= T{"2.7.0"}
  override def scalaVersion= T{"2.12.8"}
  override def twirlVersion= T{"1.4.0"}
  object test extends PlayTests
}
