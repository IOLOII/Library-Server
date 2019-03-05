package fun.extract.libraryDao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.sun.org.apache.bcel.internal.util.ClassPath;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class UserDaoTest {
//	@Autowired
//	@Qualifier(value="userDao")
	
	@Resource(name="userDao")	

	private UserDao userDao;
		
	@Test
	public void checkUserBF() {		
//		UserDAO user1 = new UserDAO();
//		Boolean BF = user1.checkUserBF(1406270114, "123456");
//		System.out.println(user1);
		Boolean BF = userDao.checkUserBF(1203210105, "12456");
		System.err.println(BF);	
	}


}
