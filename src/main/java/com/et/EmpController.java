package com.et;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.et.entity.Emp;
import com.et.service.EmpService;

@Controller
@SpringBootApplication
public class EmpController {

	@Autowired
	EmpService es;

	
	@ResponseBody
	@RequestMapping("/saveEmp")
	public void save() {
		Emp emp = new Emp();
		emp.setId(10);
		emp.setName("周杰");
		emp.setDeptid(2);
	    es.save(emp);
	}

	@ResponseBody
	@RequestMapping("/queryEmp/{id}")
	public Emp queryEmp(@PathVariable int id) {
		
	  Emp emp =  es.query(id);
	  return emp;
	}  
	
	@ResponseBody
	@RequestMapping("/deleteEmp/{id}")
	public int deleteEmp(@PathVariable int id) {
		
	  int i=  es.delete(id);
	  return i;
	} 
	
	@ResponseBody
	@RequestMapping("/updateEmp")
	public int updateEmp() {
		Emp emp = new Emp();
		emp.setId(3);
		emp.setName("王七八九");
		emp.setDeptid(100);
		int i = es.update(emp);
	  return i;
	} 
	
	@ResponseBody
	@RequestMapping("/updateEmp1")
	public int updateEmp1() {
		Emp emp = new Emp();
		emp.setId(3);
		emp.setName("德玛西亚");
		emp.setDeptid(55);
		int i = es.save(emp);
	  return i;
	} 
	public static void main(String[] args) {
		SpringApplication.run(EmpController.class, args);
	}
}