package br.com.treinaweb.twprojects.core.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @ToString.Include
    @Column(nullable = false, unique = true)
    private String email;

    @Column(length = 11, nullable = false, unique = true)
    private String phone;

    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    private LocalDate hireDate;

    @Column(nullable = true)
    private LocalDate resignationDate;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST, orphanRemoval = true)
    private Address address;


}
