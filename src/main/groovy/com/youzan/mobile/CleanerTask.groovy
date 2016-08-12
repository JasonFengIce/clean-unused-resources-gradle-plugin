package com.youzan.mobile

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by liangfei on 8/12/16.
 */
class CleanerTask extends DefaultTask {
    CleanerTask() {
        project.afterEvaluate {
            def lintOptions = project.extensions.android.lintOptions
        }
    }

    @TaskAction
    def clean() {
    }
}
