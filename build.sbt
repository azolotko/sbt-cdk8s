name := "sbt-cdk8s"

organization := "nl.zolotko.sbt"

licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/azolotko/sbt-cdk8s"))

developers := List(
  Developer("azolotko", "Alex Zolotko", "azolotko@gmail.com", url("https://github.com/azolotko"))
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/azolotko/sbt-cdk8s"),
    "scm:git:https://github.com/azolotko/sbt-cdk8s.git",
    Some("scm:git:git@github.com:azolotko/sbt-cdk8s.git")
  )
)

scalacOptions := Seq("-deprecation", "-unchecked", "-feature", "-Xsource:3")

sbtPlugin := true

enablePlugins(SbtPlugin)

scriptedBufferLog := false

scriptedLaunchOpts := (
  scriptedLaunchOpts.value ++
    Seq("-Xmx1g", "-Dsbt.cdk8s.version=" + version.value)
)

publishTo := sonatypePublishToBundle.value

sonatypeCredentialHost := "s01.oss.sonatype.org"

sonatypeProfileName := "nl.zolotko.sbt"