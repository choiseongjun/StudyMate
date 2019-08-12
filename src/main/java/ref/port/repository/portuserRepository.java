package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.portUser;

public interface portuserRepository extends JpaRepository<portUser, Long>{

}
