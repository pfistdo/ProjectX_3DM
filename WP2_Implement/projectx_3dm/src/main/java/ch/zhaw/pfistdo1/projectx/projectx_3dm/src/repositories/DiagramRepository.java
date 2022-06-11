package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Diagram;

@Repository
public interface DiagramRepository extends JpaRepository<Diagram, Long> {

    @Query(value="SELECT d.id,d.name FROM diagram d")
    List<Diagram> findDiagramsAsNodes();
}