/**
 * 
 */
package vn.common.design.structural.composite.test;

import org.junit.Test;

import vn.common.design.structural.composite.Developer;
import vn.common.design.structural.composite.Employee;
import vn.common.design.structural.composite.Manager;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class CompositePatternTest {

  @Test
  public void TestCase1() {
    Employee emp1 = new Developer("John", 10000);
    Employee emp2 = new Developer("David", 15000);
    Employee manager1 = new Manager("Daniel", 25000);
    manager1.add(emp1);
    manager1.add(emp2);
    Employee emp3 = new Developer("Michael", 20000);
    Manager generalManager = new Manager("Mark", 50000);
    generalManager.add(emp3);
    generalManager.add(manager1);

    generalManager.print();
  }

}
