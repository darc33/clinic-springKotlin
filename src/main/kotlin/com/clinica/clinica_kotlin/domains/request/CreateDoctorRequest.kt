package com.clinica.clinica_kotlin.domains.request

import org.jetbrains.annotations.NotNull

data class CreateDoctorRequest(
        @field:NotNull
        val name: String,
        val lastname: String,
        val specialty: String,
        val consultory: Long,
        val email: String?
)
