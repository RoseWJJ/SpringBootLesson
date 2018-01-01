package com.et.dao;



import org.springframework.data.repository.CrudRepository;

import com.et.entity.Emp;

public interface EmpRepository extends CrudRepository<Emp, Integer> {

}
