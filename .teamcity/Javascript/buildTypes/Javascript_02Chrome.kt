package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_02Chrome : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "fc8b1e04-74d5-4776-906b-2d2a806d6eea"
    extId = "Javascript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }
})
