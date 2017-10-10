/**
 * 
 */
package vn.common.design.behavior.CoR.test;

import org.junit.Test;

import vn.common.design.behavior.CoREx1.Categories;
import vn.common.design.behavior.CoREx1.Department;
import vn.common.design.behavior.CoREx1.HeadOfficeDeparment;
import vn.common.design.behavior.CoREx1.ManagerDepartment;
import vn.common.design.behavior.CoREx1.MetarialDepartment;
import vn.common.design.behavior.CoREx1.PurcharseDepartment;
import vn.common.design.behavior.CoREx1.PurchasingRequest;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class PurcharsingProcesserTest {
  @Test
  public void test1() {
    Department headOffice = new HeadOfficeDeparment();
    Department metarial = new MetarialDepartment();
    Department purcharse = new PurcharseDepartment();
    Department manager = new ManagerDepartment();

    headOffice.setDepartmentSuccessor(metarial);
    metarial.setDepartmentSuccessor(purcharse);
    purcharse.setDepartmentSuccessor(manager);

    PurchasingRequest request = new PurchasingRequest(Categories.PURCHASE_PACK_4);
    headOffice.processPurchar(request);

  }

}
