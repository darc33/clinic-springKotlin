package com.clinica.clinica_kotlin.controllers

import com.clinica.clinica_kotlin.constants.HEALTH_CHECK
import com.clinica.clinica_kotlin.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
@RestController
class HealthCheckController {
    @GetMapping(HEALTH_CHECK)
    fun healthCheck(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}