enablePlugins(JavaAppPackaging, AshScriptPlugin)

name := "akkahttp-quickstart"

version := "0.1"

scalaVersion := "2.12.8"

dockerBaseImage := "openjdk:8-jre-alpine"
packageName in Docker := "akkahttp-quickstart"

val circeVersion = "0.10.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.20",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.20" % Test,
  "com.typesafe.akka" %% "akka-stream" % "2.5.20",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.20" % Test,
  "com.typesafe.akka" %% "akka-http" % "10.1.7",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.7" % Test,

  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser"% circeVersion,
  "de.heikoseeberger" %% "akka-http-circe" % "1.24.3",
  
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)