package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Table(name="tbl_brd_reply")
@Data
public class BoardReply {

	@Id
	@GeneratedValue
	@Column(name="repno")
	private long repNo;
	@Column(name="repmemo")
	private String repMemo;
	@Column(name="repparent")
	private long repParent;
	@Column(name="repdepth")
	private long repDepth;
	@Column(name="repOrder")
	private long repOrder;
	@Column(name="repdel")
	private char repDel;
	
	@ManyToOne
	@JoinColumn(name="brdno")
	private Board board;
	
	@ManyToOne
	@JoinColumn(name="userno")
	private PortUser user;
	
	
}
