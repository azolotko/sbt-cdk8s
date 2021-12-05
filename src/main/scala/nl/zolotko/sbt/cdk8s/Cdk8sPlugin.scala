package nl.zolotko.sbt.cdk8s

import sbt.*
import sbt.plugins.JvmPlugin

object Cdk8sPlugin extends AutoPlugin {

  override def requires = JvmPlugin

  object autoImport {
    val Cdk8s: Configuration = config("cdk8s")
  }

  import autoImport.*

  // TODO
}