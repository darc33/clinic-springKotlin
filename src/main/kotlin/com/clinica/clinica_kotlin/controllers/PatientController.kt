package com.clinica.clinica_kotlin.controllers

import com.clinica.clinica_kotlin.constants.*
import com.clinica.clinica_kotlin.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

@RestController
class PatientController {
    @GetMapping()
    fun getAllPatients(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PostMapping(CreatePatients)
    fun createPatient(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @GetMapping(GetPatientById)
    fun getPatientById(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PutMapping(UpdatePatient)
    fun updatePatient(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}