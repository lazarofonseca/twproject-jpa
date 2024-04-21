package br.com.treinaweb.twprojects.web.employees.controlles;

import br.com.treinaweb.twprojects.core.exception.EmployeeNoteFoundException;
import br.com.treinaweb.twprojects.core.models.Employee;
import br.com.treinaweb.twprojects.core.repositories.EmployeeRepository;
import br.com.treinaweb.twprojects.web.employees.dtos.EmployeeForm;
import br.com.treinaweb.twprojects.web.employees.mappers.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;



    @GetMapping
    public ModelAndView index() {
                var employees = employeeRepository.findAll()
                        .stream()
                        .map(employeeMapper::toEmployeeListItem)
                        .toList();
        var model = Map.of("employees", employees);
        return new ModelAndView("employees/index", model);
    }

    @GetMapping("/{id}")
    public ModelAndView details(@PathVariable Long id) {
        var employee = employeeRepository.findById(id)
                .map(employeeMapper::toEmployeeDetails)
                .orElseThrow(EmployeeNoteFoundException::new);
        var model = Map.of("employee", employee);
        return new ModelAndView("employees/details", model);
    }

    @GetMapping("/create")
    public ModelAndView create() {
        var model = Map.of(
                "pageTitle", "Cadastro de Funconário",
                "employeeForm", new EmployeeForm()
        );
        return new ModelAndView("employees/form", model);
    }


    @PostMapping("/create")
    public String create(EmployeeForm employeeForm) {
        var employee = employeeMapper.toEmployee(employeeForm);
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

}
