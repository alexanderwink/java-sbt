lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  javaJdbc,
  ehcache,
  javaWs,
  guice,
  "mysql" % "mysql-connector-java" % "5.1.29",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.codemonkey.simplejavamail" % "simple-java-mail" % "2.1",
  "org.apache.pdfbox" % "pdfbox" % "1.8.4",
  "org.xhtmlrenderer" % "core-renderer" % "R8",
  "org.mockito" % "mockito-all" % "1.9.5" % "test",
  "org.hamcrest" % "hamcrest-all" % "1.3" % "test",
  "com.google.api-client" % "google-api-client" % "1.19.1",
  "com.github.rjeschke" % "txtmark" % "0.13",
  "org.yaml" % "snakeyaml" % "1.17",
  "org.seleniumhq.selenium" % "selenium-chrome-driver" % "3.141.59" % "test",
  "org.apache.commons" % "commons-lang3" % "3.10",
  "io.swagger" %% "swagger-play2" % "1.6.1",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.9.10",
  "org.glassfish.jaxb" % "jaxb-core" % "2.3.0.1",
  "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2"
)
