package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Shape;

@Repository
public interface ShapeRepository extends JpaRepository<Shape, Long> {

    @Query(value="SELECT v1.diagram_id AS rhs, v2.diagram_id AS lhs FROM validity v1, validity v2 WHERE v1.shape_id = v2.shape_id AND v1.diagram_id < v2.diagram_id", nativeQuery = true)
    List<Object[]> findEdges();
}