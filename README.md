Something weird is going on with how SBT treats stable releases of non-(org.scala-lang) Scala distros.

If I try to compile this code, which contains references to the new APIs introduced in scala-compiler.jar
by Scala Virtualized 2.10.2, then compilation fails. If I change scalaVersion to 2.10.2-RC2, which contains
the same new APIs, then everything works just fine.

Looks like SBT uses scala-virtualized's scala-compiler.jar for 2.10.2-RC2,
but falls back to scala's scala-compiler.jar for 2.10.2, which is awkward, but real.

I vaguely remember reading somewhere that there was (still is?) a problem with how SBT treats
certain version strings. Maybe this could be the case?

Discussion: [https://github.com/sbt/sbt/issues/1172](https://github.com/sbt/sbt/issues/1172)
