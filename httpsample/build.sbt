name := "senz"

version := "0.1"

scalaVersion := "2.12.6"
lazy val akkaVersion = "2.5.12"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.7.3",
  "org.scalaj" %% "scalaj-http" % "2.4.2",
)

scalacOptions += "-deprecation"

//resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
