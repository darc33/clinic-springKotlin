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
class AppointmentController {
    @GetMapping(Appointment)
    fun getAllAppointments(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PostMapping(CreateAppointments)
    fun createAppointment(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @GetMapping(GetAppointmentById)
    fun getAppointmentById(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PutMapping(UpdateAppointment)
    fun updateAppointment(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}