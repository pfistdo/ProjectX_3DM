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

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Validity;
import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories.ValidityRepository;

@RestController
public class ValidityRestController {

    @Autowired
    ValidityRepository repository;

    @RequestMapping(value="/validities", method=RequestMethod.GET)
    public ResponseEntity<List<Validity>> getValidities() {
        List<Validity> result = repository.findAll();
        if (!result.isEmpty()) {
			return new ResponseEntity<List<Validity>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Validity>>(HttpStatus.NOT_FOUND);
		}
    }

    @RequestMapping(value="/validities/{id}", method=RequestMethod.GET)
	public ResponseEntity<Validity> getValidity(@PathVariable("id") long id) {
		Optional<Validity> result = repository.findById(id);
		if (result.isEmpty()) {
			return new ResponseEntity<Validity>(HttpStatus.NOT_FOUND);
		} 
		return new ResponseEntity<Validity>(result.get(), HttpStatus.OK);
	}
}