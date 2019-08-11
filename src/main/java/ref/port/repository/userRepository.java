package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.User;

public interface userRepository extends JpaRepository<User, Long>{

}
