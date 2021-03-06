package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Complex;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long> {
}