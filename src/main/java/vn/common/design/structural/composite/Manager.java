/**
 * 
 */
package vn.common.design.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * class manager<br>
 * defined as composite.<br>
 * 
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class Manager implements Employee {

  private String name;

  private double salary;

  private List<Employee> employees = new ArrayList<Employee>();

  /**
   * constructor manager<br>
   * 
   * @param name name of manager
   * @param salary salary of manager
   */
  public Manager(String name, double salary) {
    super();
    this.name = name;
    this.salary = salary;
  }

  /**
   * @inheritDoc
   */
  @Override
  public void add(Employee employee) {
    employees.add(employee);
  }

  /* (non-Javadoc)
   * @see vn.common.design.structural.composite.Employee#remove(vn.common.design.structural.composite.Employee)
   */
  @Override
  public void remove(Employee employee) {
    employees.remove(employee);

  }

  /* (non-Javadoc)
   * @see vn.common.design.structural.composite.Employee#getChild(int)
   */
  @Override
  public Employee getChild(int i) {
    return employees.get(i);
  }

  /* (non-Javadoc)
   * @see vn.common.design.structural.composite.Employee#getName()
   */
  @Override
  public String getName() {
    return this.name;
  }

  /* (non-Javadoc)
   * @see vn.common.design.structural.composite.Employee#getSalary()
   */
  @Override
  public double getSalary() {
    return this.salary;
  }

  /* (non-Javadoc)
   * @see vn.common.design.structural.composite.Employee#print()
   */
  @Override
  public void print() {
    System.out.println("-------------");
    System.out.println("Name =" + getName());
    System.out.println("Salary =" + getSalary());
    System.out.println("-------------");

    Iterator<Employee> employeeIterator = employees.iterator();
    while (employeeIterator.hasNext()) {
      Employee employee = employeeIterator.next();
      employee.print();
    }

  }

}
