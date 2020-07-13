package com.github.andrious.mvcflutterproject.services

import com.intellij.openapi.project.Project
import com.github.andrious.mvcflutterproject.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
