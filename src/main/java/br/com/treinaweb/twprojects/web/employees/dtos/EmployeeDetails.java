package br.com.treinaweb.twprojects.web.employees.dtos;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {

    private String name;

    private String email;

    private String phone;

    private String cpf;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate birthDate;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate hireDate;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate resignationDate;

}
