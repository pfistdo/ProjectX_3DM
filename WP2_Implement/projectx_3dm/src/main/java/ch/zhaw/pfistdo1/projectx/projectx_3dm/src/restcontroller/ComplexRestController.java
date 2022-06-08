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

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Complex;
import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories.ComplexRepository;

@RestController
public class ComplexRestController {

    @Autowired
    ComplexRepository repository;

    @RequestMapping(value="/complex", method=RequestMethod.GET)
    public ResponseEntity<List<Complex>> getComplex() {
        List<Complex> result = repository.findAll();
        if (!result.isEmpty()) {
			return new ResponseEntity<List<Complex>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Complex>>(HttpStatus.NOT_FOUND);
		}
    }

    @RequestMapping(value="/complex/{id}", method=RequestMethod.GET)
	public ResponseEntity<Complex> getComplex(@PathVariable("id") long id) {
		Optional<Complex> result = repository.findById(id);
		if (result.isEmpty()) {
			return new ResponseEntity<Complex>(HttpStatus.NOT_FOUND);
		} 
		return new ResponseEntity<Complex>(result.get(), HttpStatus.OK);
	}
}