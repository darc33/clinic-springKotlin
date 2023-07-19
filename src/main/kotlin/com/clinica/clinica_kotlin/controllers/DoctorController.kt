package com.clinica.clinica_kotlin.controllers

import com.clinica.clinica_kotlin.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import com.clinica.clinica_kotlin.constants.CreateDoctors
import com.clinica.clinica_kotlin.constants.Doctor
import com.clinica.clinica_kotlin.constants.GetDoctorById
import com.clinica.clinica_kotlin.constants.UpdateDoctor
import com.clinica.clinica_kotlin.domains.request.CreateDoctorRequest
import com.clinica.clinica_kotlin.domains.responses.CreateDoctorResponse
import com.clinica.clinica_kotlin.services.DoctorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class DoctorController {
    @Autowired
    private lateinit var doctorService: DoctorService

    @GetMapping(Doctor)
    fun getAllDoctors(): List<CreateDoctorResponse> = doctorService.getAllDoctors()
    @PostMapping(CreateDoctors)
    fun createDoctor(
            @RequestBody @Validated request: CreateDoctorRequest
    ): CreateDoctorResponse = doctorService.createDoctor(request)
    @GetMapping(GetDoctorById)
    fun getDoctorById(
            @PathVariable("id") id: Long
    ): CreateDoctorResponse = doctorService.getDoctorById(id)
    @PutMapping(UpdateDoctor)
    fun updateDoctor(
            @PathVariable("id") id:Long
    ): CreateDoctorResponse = doctorService.updateDoctor(id)
}