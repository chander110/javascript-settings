package Javascript

import Javascript.buildTypes.*
import Javascript.vcsRoots.*
import Javascript.vcsRoots.Javascript_HttpsGithubComChander110javascriptSettingsGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "937b8a5e-d386-4d61-b0d2-ceae12d8c053"
    extId = "Javascript"
    parentId = "_Root"
    name = "javascript"

    vcsRoot(Javascript_HttpsGithubComChander110javascriptSettingsGit)
    vcsRoot(Javascript_HttpsGithubComChander110teamcityCourseCards)

    buildType(Javascript_02Firefox)
    buildType(Javascript_DeployToStaging)
    buildType(Javascript_01FastTests)
    buildType(Javascript_02Chrome)

    template(Javascript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Javascript_HttpsGithubComChander110javascriptSettingsGit.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
