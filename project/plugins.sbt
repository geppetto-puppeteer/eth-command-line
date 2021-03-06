// only necessary while using a SNAPSHOT version of sbt-ethereum
resolvers += ("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")

addSbtPlugin("com.mchange" % "sbt-ethereum" % "0.0.3-SNAPSHOT" changing())
addSbtPlugin("com.scalapenos" % "sbt-prompt" % "1.0.0")
