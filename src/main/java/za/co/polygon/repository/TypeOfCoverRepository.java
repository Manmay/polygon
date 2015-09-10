package za.co.polygon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.polygon.domain.TypeOfCover;

@Repository
public interface TypeOfCoverRepository extends JpaRepository<TypeOfCover, Long> {

}
