/**
 * 
 */
package vn.common.design.structural.composite;

/**
 * class developer <br>
 * define as a leaf.
 * 
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class Developer implements Employee {

  private String name;

  private double salary;

  /**
   * 
   */
  public Developer(String name, double salary) {
    super();
    this.name = name;
    this.salary = salary;
  }

  /**
   * because developer is leaf so it can add other component.<br>
   * this method don't support for developer
   */
  @Override
  public void add(Employee employee) {

  }

  /**
   * Developer is leaf. so it can don't have any item in list. We can remove item<br>
   * This don't support for developer
   */
  @Override
  public void remove(Employee employee) {

  }

  /**
   * Developer is leaf. so it can don't have any item in list. We can get item<br>
   * This don't support for developer
   * 
   * @return null because don't have any item in leaf.
   */
  @Override
  public Employee getChild(int i) {
    return null;
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

  }

}
