# sbt-cdk8s

***sbt-cdk8s*** is an sbt plugin to synthesize Kubernetes manifests using cdk8s ([Cloud Development Kit for Kubernetes](https://cdk8s.io)).

## Usage

Add the following settings to your `project/plugins.sbt`:

```sbt
addSbtPlugin("nl.zolotko.sbt" % "sbt-cdk8s" % "latest.release")
```

The latest version is [![Maven Central](https://maven-badges.herokuapp.com/maven-central/nl.zolotko.sbt/sbt-cdk8s/badge.svg?subject=sbt-cdk8s)](https://maven-badges.herokuapp.com/maven-central/nl.zolotko.sbt/sbt-cdk8s/)

An example of `build.sbt`:

```sbt
// TODO
```

## Development

### Run tests

```
sbt scripted
```