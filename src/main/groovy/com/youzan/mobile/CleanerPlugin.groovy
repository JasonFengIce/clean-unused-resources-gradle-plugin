package com.youzan.mobile

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by liangfei on 8/12/16.
 */
class CleanerPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('resourceCleaner', CleanerExtension);
        project.afterEvaluate {
            project.android.lintOptions.xmlOutput = new File(project.buildDir, "lintResult.xml");
        }
        project.tasks.create('cleanResource', CleanTask)
    }
}
