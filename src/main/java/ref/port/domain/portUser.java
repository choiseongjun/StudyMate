package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ref.port.domain.common.DateAudit;

/*
 * 
 * @author choiseongjun
 * @Story User model
 * @Date 19.08.10
 */ 
@Entity
@Table(name="user") 
@Getter @Setter
public class portUser extends DateAudit{
 
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
	@Column(name="deleteflag",columnDefinition = "char(1) default 'Y'")
	private char deleteflag;
}
