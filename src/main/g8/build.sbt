scalaVersion := "$scala_version$"

enablePlugins(JmhPlugin)

scalacOptions ++= Seq(
  "-deprecation"
)
