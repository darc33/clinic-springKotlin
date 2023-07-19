package com.clinica.clinica_kotlin.controllers

import com.clinica.clinica_kotlin.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import com.clinica.clinica_kotlin.constants.CreateDoctors
import com.clinica.clinica_kotlin.constants.GetDoctorById
import com.clinica.clinica_kotlin.constants.UpdateDoctor
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

@RestController
class DoctorController {
    @GetMapping()
    fun getAllDoctors(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PostMapping(CreateDoctors)
    fun createDoctor(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @GetMapping(GetDoctorById)
    fun getDoctorById(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PutMapping(UpdateDoctor)
    fun updateDoctor(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}