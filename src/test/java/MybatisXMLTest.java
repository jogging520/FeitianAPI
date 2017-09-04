import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.northsky.Application;
import com.northsky.dao.StationInformationPOMapper;
import com.northsky.model.po.StationInformationPO;
import com.northsky.model.vo.PlayListVO;
import com.northsky.service.PlayListService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class MybatisXMLTest {
	
	@Autowired
	private PlayListService  playService;
//	@Autowired
//	StationInformationPOMapper stationmapper;
	@Test
	public void test() {
//		 StationInformationPO stationPO = (StationInformationPO) stationmapper.selectByPrimaryKey(1000001);
//		 System.out.println(stationPO.getCategory());
		
//		ChannelInformationPO cpo =channelmapper.findAll();
//		 System.out.println(cpo.getName());
//		Media media = mediaMapper.findByid(100000);
		PlayListVO playvo =playService.getPlaylist();
    	System.out.println(playvo.getStations().get(0).getChannels().get(0).getProgrammes().get(0));
//		Assert.assertEquals("../images/guangdian/lvyou-heilongjiang.png",media.getLocation());
	}

}
