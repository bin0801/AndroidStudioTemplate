package com.github.bin0801.androidstudiotemplate.services

import com.github.bin0801.androidstudiotemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
