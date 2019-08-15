package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.PortUser;

public interface PortUserRepository extends JpaRepository<PortUser, Long>{

}
