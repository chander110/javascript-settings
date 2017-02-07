package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Javascript_Template : Template({
    uuid = "0ea81fbf-a37c-4bd8-a50f-35248ca1ab55"
    extId = "Javascript_Template"
    name = "template"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComChander110teamcityCourseCards)

    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_7"
            scriptContent = "npm install"
        }
        script {
            name = "Browser test"
            id = "RUNNER_8"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
