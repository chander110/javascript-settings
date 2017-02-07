package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_02Firefox : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "91d7b74b-9efc-40f8-971c-63d361e82b36"
    extId = "Javascript_02Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
        param("Browsers", "Firefox")
    }
})
