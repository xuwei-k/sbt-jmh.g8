scriptedLaunchOpts ++= Seq(
  "-Xmx4G"
)

Test / test := (Test / g8Test).toTask("").value

scriptedBufferLog := false
