package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_DeployToStaging : BuildType({
    uuid = "c9ba8708-96f4-4473-a8d0-d09c67b73d6b"
    extId = "Javascript_DeployToStaging"
    name = "Deploy to staging"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComChander110teamcityCourseCards)

    }
})
