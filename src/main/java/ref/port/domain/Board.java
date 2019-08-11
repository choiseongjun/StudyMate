package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ref.port.domain.common.DateAudit;

@Table(name="tbl_board")
@Entity
public class Board extends DateAudit{

	
	@Id
	@GeneratedValue
	@Column(name="brdno")
	private long brdno;//글순서 
	@Column(name="brdtitle")
	private String brdtitle;
	@Column(name="brdmemo")
	private String brdmemo;
	@Column(name="heart")
	private long heart;
	@Column(name="deleteflag")
	private char deleteflag;
	
	@ManyToOne
	@JoinColumn(name="userno")
	private User user;
	
}
