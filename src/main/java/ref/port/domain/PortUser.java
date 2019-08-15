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
public class PortUser {

	@Id
	@GeneratedValue
	@Column(name="userno")
	private long userNo;
	@Column(name="userid")
	private String userId;
	@Column(name="userpwd")
	private String userPwd;
	@Column(name="username")
	private String userName;
	@Column(name="userimg")
	private String userImg;
	@Column(name="deleteflag")
	private char deleteFlag;
}
