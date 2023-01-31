package com.dep.OpenFeign.empDepartmentOpenFeign.depController;

import com.dep.OpenFeign.empDepartmentOpenFeign.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dep")
public class DepController {

    @Autowired
    DepService depService;

    @GetMapping("/{id}")
    public Object getDepById(@PathVariable("id") Integer id) {
        return depService.getDepById(id);

    }

    @GetMapping("/allEmp")
    public Object getEmp() {
        return depService.getAllEmp();
    }
}
