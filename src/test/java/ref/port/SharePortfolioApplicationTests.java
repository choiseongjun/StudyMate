package ref.port;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ref.port.domain.Board;
import ref.port.repository.BoardFileRepository;
import ref.port.repository.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SharePortfolioApplicationTests {
	private final static Logger LOG = Logger.getGlobal();
	LocalDate currentDate = LocalDate.now();
	@Autowired
	BoardRepository boardrepo;
	
	@Autowired
	BoardFileRepository boardfilerepo;
	
//	@Test
//	public void contextLoads() {
//		boardFile brdfile=new boardFile();
//		board board=new board();
//		board.setBrdno(13L);
//		board.setBrdtitle("@화면테스트  !!!@#!@#!@");
//		board.setBrdmemo("brdmemo");
//		brdfile.setFilename("Testfilename");
//		
//		boardrepo.save(board);
//		boardfilerepo.save(brdfile);
//		
//	}
	//조회 테스트..
	@Test
	public void Select() {
		List<Board> portlist=boardrepo.findAll();
		LOG.info(portlist.toString());
	}

}
