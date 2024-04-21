package br.com.treinaweb.twprojects.core.repositories;

import br.com.treinaweb.twprojects.core.models.Client;
import br.com.treinaweb.twprojects.core.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
