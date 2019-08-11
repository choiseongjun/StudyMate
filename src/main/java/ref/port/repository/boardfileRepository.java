package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.BoardFile;

public interface boardfileRepository extends JpaRepository<BoardFile, Long>{

}
