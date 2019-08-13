package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.portUser;

public interface portuserRepository extends JpaRepository<portUser, Long>{

	
	/**
	 * 아이디 중복 체크 --최성준
	 * @param portuser-userid
	 * @return
	 */

	boolean existsByuserid(String userid);
}
