package ref.port;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ref.port.domain.PortUser;
import ref.port.repository.PortUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

	private final static Logger LOG = Logger.getGlobal();
	
	@Autowired
	PortUserRepository userRepository;
	
	@Test
	public void selectUser() {
		List<PortUser> portUsers = userRepository.findAll();
		
		LOG.info(portUsers.toString());
	}
}
