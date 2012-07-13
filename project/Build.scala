import sbt._
import sbt.Keys._

object ProjectBuild extends Build {

	lazy val root = Project("root", file("."),
		settings = Project.defaultSettings ++ Seq (
			name := "dws-v3",
			organization := "com.github.teaplanet",
			version := "0.1",
			scalaVersion := "2.9.2",
			libraryDependencies ++= Seq(
				"org.specs2" %% "specs2" % "1.11" % "test",
				"org.scalaz" %% "scalaz-core" % "6.0.4" % "test"
			)
		)
	).dependsOn(httpClient)

	lazy val httpClient = uri("git://github.com/teaplanet/http-client.git")
}
