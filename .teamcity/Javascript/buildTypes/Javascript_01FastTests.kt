package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_01FastTests : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "8068c666-b6ee-4b70-baf6-fc1228d7e661"
    extId = "Javascript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJs")
    }
})
