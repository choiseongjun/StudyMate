package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
 * 
 * @author choiseongjun
 * @Story boardfile model
 * @Date 19.08.10
 */
@Entity
@Table(name="tbl_brd_file")
@Getter @Setter
public class BoardFile {

	@Id
	@GeneratedValue
	@Column(name="fileno")
	private long fileno;
	@Column(name="filename")
	private String filename;
	@Column(name="realname")
	private String realname;
	@Column(name="filesize")
	private String filesize;
	
	@ManyToOne
	@JoinColumn(name="brdno")
	private Board board;
}
