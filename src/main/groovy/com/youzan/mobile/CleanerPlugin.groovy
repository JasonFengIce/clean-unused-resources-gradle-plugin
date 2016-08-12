package com.youzan.mobile

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by liangfei on 8/12/16.
 */
class CleanerPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("cleaner", CleanerExtension)
    }
}
