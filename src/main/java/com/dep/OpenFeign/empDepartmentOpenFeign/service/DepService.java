package com.dep.OpenFeign.empDepartmentOpenFeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "EMP-SERVICE")
public interface DepService {
    @GetMapping("/emp/empByIdSQL/{id}")
    public Object getDepById(@PathVariable("id") Integer id);

    @GetMapping("/emp/allEmpSQL")
    public Object getAllEmp();
}
