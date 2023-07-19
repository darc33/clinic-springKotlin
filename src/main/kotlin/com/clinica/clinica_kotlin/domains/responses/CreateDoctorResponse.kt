package com.clinica.clinica_kotlin.domains.responses

import java.time.Instant
class CreateDoctorResponse (
        val idDoctor: Long,
        val name: String,
        val lastname: String,
        val specialty: String,
        val consultory: Long,
        val email: String?,
        val createAt: Instant
){
}