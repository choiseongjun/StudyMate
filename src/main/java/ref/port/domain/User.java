package ref.port.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

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
