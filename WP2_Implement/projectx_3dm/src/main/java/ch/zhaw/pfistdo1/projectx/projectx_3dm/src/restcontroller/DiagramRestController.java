package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Diagram;
import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories.DiagramRepository;

@RestController
public class DiagramRestController {

	@Autowired
	DiagramRepository repository;

	@RequestMapping(value = "/diagrams", method = RequestMethod.GET)
	public ResponseEntity<List<Diagram>> getDiagrams() {
		List<Diagram> result = repository.findAll();
		if (!result.isEmpty()) {
			return new ResponseEntity<List<Diagram>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Diagram>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/diagrams/{id}", method = RequestMethod.GET)
	public ResponseEntity<Diagram> getDiagram(@PathVariable("id") long id) {
		Optional<Diagram> result = repository.findById(id);
		if (result.isEmpty()) {
			return new ResponseEntity<Diagram>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Diagram>(result.get(), HttpStatus.OK);
	}

	@GetMapping("/diagrams/nodes")
	public ResponseEntity<List<Object[]>> getDiagramsAsNodes() {
		List<Object[]> result = repository.findDiagramsAsNodes();
		if (!result.isEmpty()) {
			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}