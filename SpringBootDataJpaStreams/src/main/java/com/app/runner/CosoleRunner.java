package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepo;
@Component
public class CosoleRunner implements CommandLineRunner {
@Autowired
	private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
/*List<Employee> list=repo.findAll();
list.stream()
.filter(e->e.getEmpName()!=null)
.sorted((e1,e2)->e2.getEmpId()-e1.getEmpId())
.map(e->e.getEmpId()+","+e.getEmpName()+","+e.getEmpSal()).forEach(System.out::println);
 //filtering
//sorting
 * 
 */
Page<Employee> page=repo.findByEmpSal(5.5,PageRequest.of(0,3));
System.out.println(page.isEmpty());
System.out.println(page.isFirst());
System.out.println(page.isLast());
System.out.println(page.hasNext());
System.out.println(page.getSize());
System.out.println(page.hasPrevious());
System.out.println(page.getNumber());
page
.stream()
.filter(e->e.getEmpName()!=null)
.sorted((e1,e2)->e2.getEmpId()-e1.getEmpId())
.map(e->e.getEmpId()+","+e.getEmpName()+","+e.getEmpSal())
.forEach(System.out::println);	
	
	
	
	}

}
