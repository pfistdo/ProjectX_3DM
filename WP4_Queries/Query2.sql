SELECT v1.diagram_id AS rhs, v2.diagram_id AS lhs
FROM validity v1, validity v2
WHERE v1.shape_id = v2.shape_id
AND v1.diagram_id < v2.diagram_id