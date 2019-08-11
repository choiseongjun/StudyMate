package ref.port;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ref.port.domain.Board;
import ref.port.domain.BoardFile;
import ref.port.repository.boardRepository;
import ref.port.repository.boardfileRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SharePortfolioApplicationTests {
	private final static Logger LOG = Logger.getGlobal();
	LocalDate currentDate = LocalDate.now();
	@Autowired
	boardRepository boardrepo;
	
	@Autowired
	boardfileRepository boardfilerepo;
	
//	@Test
//	public void contextLoads() {
//		BoardFile brdfile=new BoardFile();
//		Board board=new Board();
//		board.setBrdno(3L);
//		board.setBrdtitle("Threetesttitle");
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
