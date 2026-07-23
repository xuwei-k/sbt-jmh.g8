scriptedLaunchOpts ++= Seq(
  "-Xmx4G"
)

autoScalaLibrary := false

ScriptedPlugin.globalSettings

scriptedBufferLog := false
