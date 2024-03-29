package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 * 
 * @author choiseongjun
 * @Story User model
 * @Date 19.08.10
 */ 
@Entity
@Table(name="user") 
@Data
public class portUser {

	@Id
	@GeneratedValue
	@Column(name="userno")
	private long userno;
	@Column(name="userid")
	private String userid;
	@Column(name="userpwd")
	private String userpwd;
	@Column(name="username")
	private String username;
	@Column(name="userimg")
	private String userimg;
	@Column(name="deleteflag")
	private char deleteflag;
}
