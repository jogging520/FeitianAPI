import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.northsky.Application;
import com.northsky.domain.ImageLocation;
import com.northsky.domain.ImageLocationMapper;
import com.northsky.domain.User;
import com.northsky.domain.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class MybatisTest {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ImageLocationMapper imageMapper;

//	@Test
//	@Rollback
//	public void findByName() throws Exception {
//		userMapper.insert("AAA", 20);
//		User u = userMapper.findByName("AAA");
//		Assert.assertEquals(20, u.getAge().intValue());
//	}
	@Test
	public void findById() {
		ImageLocation image = imageMapper.findByid(100000);
		Assert.assertEquals("../images/guangdian/lvyou-heilongjiang.png",image.getLocation());
	}

}