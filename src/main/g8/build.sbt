import scalariform.formatter.preferences._
import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

name := "$projectName$"
version := "$projectVersion$"

scalaVersion := "$scalaVersion$"
scalacOptions ++= Seq("-feature", "-language:postfixOps", "-language:implicitConversions")

SbtScalariform.scalariformSettings
ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)

mainClass in Compile := Some("se.jaklec.Main")
enablePlugins(JavaServerAppPackaging)

libraryDependencies += "org.scalatest" %% "scalatest" % "$scalaTestVersion$" % "test"
