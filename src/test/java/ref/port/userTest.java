package ref.port;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ref.port.domain.portUser;
import ref.port.repository.portuserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userTest {

	private final static Logger LOG = Logger.getGlobal();
	
	@Autowired
	portuserRepository userrepository;
	
	@Test
	public void selectUser() {

		
		
		List<portUser> puser=userrepository.findAll();
		
		LOG.info(puser.toString());
		
	}
}
