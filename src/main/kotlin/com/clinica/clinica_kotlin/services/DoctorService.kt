package com.clinica.clinica_kotlin.services

import com.clinica.clinica_kotlin.domains.request.CreateDoctorRequest
import com.clinica.clinica_kotlin.domains.responses.CreateDoctorResponse
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class DoctorService {

    fun createDoctor(request:CreateDoctorRequest): CreateDoctorResponse{
        return CreateDoctorResponse(
                idDoctor = 1,
                name = request.name,
                lastname = request.lastname,
                specialty = request.specialty,
                consultory = request.consultory,
                email= request.email,
                createAt = Instant.now()
        )
    }

    fun getAllDoctors(): List<CreateDoctorResponse>{
        var response : List<CreateDoctorResponse> =  listOf(
                CreateDoctorResponse(
                        idDoctor = 1,
                        name = "test",
                        lastname = "test",
                        specialty = "test",
                        consultory = 123,
                        email= "test",
                        createAt = Instant.now()
                )
        )
        return response
    }
    fun getDoctorById(id: Long): CreateDoctorResponse{
        return CreateDoctorResponse(
                idDoctor = 1,
                name = "test",
                lastname = "test",
                specialty = "test",
                consultory = 123,
                email= "test",
                createAt = Instant.now()
        )
    }

    fun updateDoctor(id: Long): CreateDoctorResponse{
        return CreateDoctorResponse(
                idDoctor = 1,
                name = "test",
                lastname = "test",
                specialty = "test",
                consultory = 123,
                email= "test",
                createAt = Instant.now()
        )
    }
}