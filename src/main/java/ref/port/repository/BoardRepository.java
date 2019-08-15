package ref.port.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.port.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
