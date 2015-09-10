package za.co.polygon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.polygon.domain.SubjectMatter;

@Repository
public interface SubjectMatterRepository extends JpaRepository<SubjectMatter, Long> {

}
