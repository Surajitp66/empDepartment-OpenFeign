package com.dep.OpenFeign.empDepartmentOpenFeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "EmpServer",url = "localhost:9001/emp")
public interface DepService {
    @GetMapping("/{id}")
    public Object getDepById(@PathVariable("id") Integer id);
}
