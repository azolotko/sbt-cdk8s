sys.props.get("sbt.cdk8s.version") match {
  case Some(ver) => addSbtPlugin("nl.zolotko.sbt" % "sbt-cdk8s" % ver)
  case _ => sys.error("""|The system property 'sbt.cdk8s.version' is not defined.
                                 |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}
