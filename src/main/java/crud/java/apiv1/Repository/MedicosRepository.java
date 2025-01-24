package crud.java.apiv1.Repository;

import crud.java.apiv1.Entities.MedicosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicosRepository extends JpaRepository <MedicosEntity, Long> {
}
