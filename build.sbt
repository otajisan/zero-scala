name := "zero-scala"

version := "0.1"

//scalaVersion := "2.12.3"
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.5.3.RELEASE",
//  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "1.5.3.RELEASE",
//  "org.springframework.boot" % "spring-boot-starter-actuator" % "1.5.3.RELEASE",
//  "org.springframework.boot" % "spring-boot-maven-plugin" % "1.5.3.RELEASE",
  "org.thymeleaf" % "thymeleaf-spring4" % "3.0.0.RELEASE"
)

mainClass in assembly := Some("com.zeroscala.ZeroScala")

// 正しい書き方がよく分からん
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
    /*
  case PathList(ps @ _*) if ps.last endsWith ".factories" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".json" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".provides" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith "spring.tooling" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith "web-fragment.xml" => MergeStrategy.first

  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
    */
}
