package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.user;

public interface userRepository extends JpaRepository<user, Long>{

}
