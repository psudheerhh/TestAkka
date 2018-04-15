name := "TestAkka"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.4"


libraryDependencies ++=Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.11",
  "com.typesafe.akka" %% "akka-cluster" % "2.5.11"
)

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

mainClass in Compile :=
  Some("TestSystem")