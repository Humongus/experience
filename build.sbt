lazy val akkaHttpVersion = "10.0.7"
lazy val akkaVersion    = "2.5.2"

scalaJSUseMainModuleInitializer := true

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    inThisBuild(List(
      organization    := "io.humongus",
      scalaVersion    := "2.12.2"
    )),
    name := "experience",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"         % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"       % akkaVersion,
      "org.scala-js"      %%% "scalajs-dom"      % "0.9.1",
      "com.lihaoyi"       %%% "utest"            % "0.4.5"         % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "org.scalatest"     %% "scalatest"         % "3.0.1"         % Test
    )
  )
