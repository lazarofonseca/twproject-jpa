package br.com.treinaweb.twprojects.core.models;

import br.com.treinaweb.twprojects.core.enums.AddressState;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 100, nullable = false)
    private String city;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AddressState state;

    @Column(length = 100, nullable = false)
    private String street;

    @Column(length = 10, nullable = false)
    private String number;

    @Column(length = 8, nullable = false)
    private String complement;

    @Column(length = 8, nullable = false)
    private String zipCode;

    @Column(length = 100, nullable = false)
    private String neighborhood;
}
