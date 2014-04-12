name := "ScalaJam"

version := "1.0"

description := "Scala template for Google Code Jam"

scalaVersion := "2.10.4"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature",
  "-language:postfixOps,implicitConversions,experimental.macros,dynamics,existentials,higherKinds"
)
