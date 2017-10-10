/**
 * 
 */
package vn.common.design.structural.composite;

/**
 * Interface Employee <br>
 * This is interface <b>component</b> of composite pattern<br>
 * 
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public interface Employee {

  /**
   * add employee <br>
   * this method support by composite. Not support for leaf<br>
   * 
   * @param employee
   */
  public void add(Employee employee);

  public void remove(Employee employee);

  public Employee getChild(int i);

  public String getName();

  public double getSalary();

  public void print();

}
