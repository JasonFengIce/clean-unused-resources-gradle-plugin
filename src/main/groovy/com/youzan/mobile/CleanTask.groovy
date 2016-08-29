package com.youzan.mobile

import com.youzan.mobile.internal.Cleaner
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by liangfei on 8/12/16.
 */
class CleanTask extends DefaultTask {
    CleanTask() {
        super()
        dependsOn "lint"
    }

    @TaskAction
    def clean() {
        def lintResult = project.android.lintOptions.xmlOutput
        def excludedFiles = project.resourceCleaner.excludedFiles
        //def manifest = project.android.sourceSets.getByName('main').manifest.srcFile
        Cleaner.clean(lintResult, excludedFiles)
    }
}
