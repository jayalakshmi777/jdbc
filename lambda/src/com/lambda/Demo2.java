package com.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<>();
		e.add(new Employee(1, "asha", 10000));
		e.add(new Employee(2, "sreenu", 32000));
		e.add(new Employee(3, "magi", 25000));
		e.add(new Employee(4, "vena", 50000));
        //function
		Function<Employee, Double> cn = emp -> (emp.esalary * 20) / 100;
		//predicate
		Predicate<Double> pr = s -> s > 2000;
		//consumer
		Consumer<Employee> cs = employee -> {
			System.out.println("employee name is" + employee.ename);
			System.out.println("employee salary" + employee.esalary);
		};
		for (Employee ee : e) {
			double bonus = cn.apply(ee);

			if (pr.test(bonus)) {
				cs.accept(ee);
				System.out.println(bonus);
			}
		}

	}

}
