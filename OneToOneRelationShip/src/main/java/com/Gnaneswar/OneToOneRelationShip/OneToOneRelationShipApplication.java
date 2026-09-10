package com.Gnaneswar.OneToOneRelationShip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Gnaneswar.OneToOneRelationShip.model.Employee;
import com.Gnaneswar.OneToOneRelationShip.model.Task;
import com.Gnaneswar.OneToOneRelationShip.repository.EmployeeRepo;

@SpringBootApplication
public class OneToOneRelationShipApplication  {
	@Autowired
	private EmployeeRepo empRep;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationShipApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		
//		
//		Employee emp=new Employee();
//		emp.setEmpName("Gnaneswar");
//		Employee emp1=new Employee();
//		emp1.setEmpName("Manoj");
//		
//		
//		Task task1=new Task();
//		task1.setTaskName("Login Issues");
//
//		Task task2=new Task();
//		task2.setTaskName("Api call Issues");
//		
//		emp.setTask(task1);
//		emp1.setTask(task2 );
//		empRep.save(emp);
//		empRep.save(emp1);
//	}

}
