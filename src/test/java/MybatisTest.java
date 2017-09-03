import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.northsky.Application;
import com.northsky.dao.ChannelInformationMapper;
import com.northsky.dao.StationInformationMapper;
import com.northsky.model.po.ChannelInformationPO;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class MybatisTest {

//	@Autowired
//	private UserMapper userMapper;
@Autowired
private StationInformationMapper stationmapper;
@Autowired
private ChannelInformationMapper channelmapper;

//	private MediaMapper mediaMapper;
 
//	@Test
//	@Rollback
//	public void findByName() throws Exception {
//		userMapper.insert("AAA", 20);
//		User u = userMapper.findByName("AAA");
//		Assert.assertEquals(20, u.getAge().intValue());
//	}
	@Test
	public void findById() {
//		 StationInformationPO stationPO = stationmapper.findAll();
//		 System.out.println(stationPO.getCategory());
		
		ChannelInformationPO cpo =channelmapper.findAll();
		 System.out.println(cpo.getName());
//		Media media = mediaMapper.findByid(100000);
//		Assert.assertEquals("../images/guangdian/lvyou-heilongjiang.png",media.getLocation());
	}

}