package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Shape;
import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories.ShapeRepository;

@RestController
public class ShapeRestController {

    @Autowired
    ShapeRepository repository;

    @RequestMapping(value="/shapes", method=RequestMethod.GET)
    public ResponseEntity<List<Shape>> getShape() {
        List<Shape> result = repository.findAll();
        if (!result.isEmpty()) {
			return new ResponseEntity<List<Shape>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Shape>>(HttpStatus.NOT_FOUND);
		}
    }

    @RequestMapping(value="/shapes/{id}", method=RequestMethod.GET)
	public ResponseEntity<Shape> getShape(@PathVariable("id") long id) {
		Optional<Shape> result = repository.findById(id);
		if (result.isEmpty()) {
			return new ResponseEntity<Shape>(HttpStatus.NOT_FOUND);
		} 
		return new ResponseEntity<Shape>(result.get(), HttpStatus.OK);
	}
}