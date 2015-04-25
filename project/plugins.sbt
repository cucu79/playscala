// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
//libraryDependencies += "com.typesafe.slick" %% "slick-extensions_2.11" % "2.1.0"
//resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.0")

