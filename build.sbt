ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.5.1"

val PekkoVersion = "1.1.2"
val LogbackVersion = "1.5.12"
val ScalaTestVersion = "3.2.19"

lazy val root = (project in file("."))
  .settings(
    name := "akkabook"
  )

lazy val commonDependencies = Seq(
  "org.apache.pekko" %% "pekko-actor-typed" % PekkoVersion,
  "ch.qos.logback" % "logback-classic" % LogbackVersion,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test
)

lazy val chapter02 = project
  .in(file("chapter02"))
  .settings(
    name := "akkabook-chapter02",
    libraryDependencies ++= commonDependencies ++ Seq(
      "org.apache.pekko" %% "pekko-actor" % PekkoVersion,
      "org.apache.pekko" %% "pekko-actor-testkit-typed" % PekkoVersion % Test
    )
  )