package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/*
 * 
 * @author choiseongjun
 * @Story PortFolio Model
 * @Date 19.08.10
 */
@Table(name="tbl_board")
@Entity
@Data
public class Board {

	@Id
	@GeneratedValue
	@Column(name="brdno")
	private long brdNo;//글순서
	@Column(name="brdtitle")
	private String brdTitle;
	@Column(name="brdmemo")
	private String brdMemo;
	@Column(name="heart")
	private long heart;
	@Column(name="deleteflag")
	private char deleteFlag;
	
	@ManyToOne
	@JoinColumn(name="userno")
	private PortUser user;



	
	
	
}