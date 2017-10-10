/**
 * 
 */
package vn.common.design.structural.decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vn.common.design.structural.decorator.SimpleWindow;
import vn.common.design.structural.decorator.SquareBorderWindow;
import vn.common.design.structural.decorator.Window;

/**
 *
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 *
 * @since 5 Oct 2017
 * @note 
 */
public class DecoratorTest {
	
	@Test
	public void testSquareBorderWindow(){
		Window window = new SquareBorderWindow(new SimpleWindow());
		assertEquals("simple window,Add Square Border",window.getDescription());
	}

}
