resolvers += Resolver.typesafeRepo("releases")
resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.typesafeIvyRepo("releases")


// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.20")

// web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.0.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")
addSbtPlugin("com.github.akiomik" % "sbt-uglify-es" % "1.0.0")
addSbtPlugin("net.ground5hark.sbt" % "sbt-css-compress" % "0.1.4")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")

addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.1.0")
