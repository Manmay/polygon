
package za.co.polygon.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.polygon.Service;

import za.co.polygon.domain.LocationOption;
import za.co.polygon.model.QuotationRequestCommandModel;

@Repository
public interface LocationOptionRepository extends JpaRepository<LocationOption, Long> {

    public LocationOption findById(Long id);
    
}
