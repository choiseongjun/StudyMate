package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.board;

public interface boardRepository extends JpaRepository<board, Long>{

}
