package com.github.nokisenpai.caseconverter.services

import com.intellij.openapi.project.Project
import com.github.nokisenpai.caseconverter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
