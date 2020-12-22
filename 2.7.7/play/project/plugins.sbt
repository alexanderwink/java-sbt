resolvers += Resolver.bintrayIvyRepo("lolhens", "sbt-plugins")


// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.7")

// web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "5.0.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.4")
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")
addSbtPlugin("com.github.akiomik" % "sbt-uglify-es" % "1.0.0")
addSbtPlugin("de.lolhens.sbt" % "sbt-css-compress" % "0.2.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")
addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.2.0")
