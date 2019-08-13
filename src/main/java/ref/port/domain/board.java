package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ref.port.domain.common.DateAudit;
/*
 * 
 * @author choiseongjun
 * @Story PortFolio Model
 * @Date 19.08.10
 */
@Table(name="tbl_board")
@Entity
@Data
public class board{

	 
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
	private portUser user;



	
	
	
}
