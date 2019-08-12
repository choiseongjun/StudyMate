package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
 
@Entity 
@Table(name="tbl_brd_reply")
@Data
public class boardReply {

	 
	@Id
	@GeneratedValue
	@Column(name="repno")
	private long repno;
	@Column(name="repmemo")
	private String repmemo;
	@Column(name="repparent")
	private long repparent;
	@Column(name="repdepth")
	private long repdepth;
	@Column(name="reporder")
	private long reporder;
	@Column(name="repdel")
	private char repdel;
	
	@ManyToOne
	@JoinColumn(name="brdno")
	private board board;
	
	@ManyToOne
	@JoinColumn(name="userno")
	private portUser user;
	
	
}
