package springboot;

import org.junit.Test;

import com.how2java.springboot.pojo.Category;

public class TestCategory {

	@Test
	public void test1() {
		Category c=new Category();
		c.setId(1);
		c.setName("11");
		System.out.println(c);
	}
}
