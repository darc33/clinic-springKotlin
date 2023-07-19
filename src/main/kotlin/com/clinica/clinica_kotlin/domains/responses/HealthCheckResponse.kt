package  com.clinica.clinica_kotlin.domains.responses

import  org.springframework.http.HttpStatus

data class HealthCheckResponse (
        val status: String = HttpStatus.OK.name
)

