/**
 * 
 */
package vn.common.design.behavior.CoREx1;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class Department {

  private Department departmentSuccessor;

  public void processPurchar(PurchasingRequest request) {
    if (this.departmentSuccessor != null) {
      departmentSuccessor.processPurchar(request);
    }
  }

  public void setDepartmentSuccessor(Department successor) {
    this.departmentSuccessor = successor;
  }

}
