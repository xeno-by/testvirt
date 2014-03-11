name := "paradisevirt"

scalaVersion := "2.10.2"

version := "2.0.0-SNAPSHOT"

organization := "org.scalamacros"

scalaOrganization := "org.scala-lang.virtualized"

libraryDependencies <+= (scalaVersion)("org.scala-lang.virtualized" % "scala-compiler" % _)