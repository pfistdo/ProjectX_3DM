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

import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities.Simple;
import ch.zhaw.pfistdo1.projectx.projectx_3dm.src.repositories.SimpleRepository;

@RestController
public class SimpleRestController {

    @Autowired
    SimpleRepository repository;

    @RequestMapping(value="/simples", method=RequestMethod.GET)
    public ResponseEntity<List<Simple>> getSimple() {
        List<Simple> result = repository.findAll();
        if (!result.isEmpty()) {
			return new ResponseEntity<List<Simple>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Simple>>(HttpStatus.NOT_FOUND);
		}
    }

    @RequestMapping(value="/simples/{id}", method=RequestMethod.GET)
	public ResponseEntity<Simple> getSimple(@PathVariable("id") long id) {
		Optional<Simple> result = repository.findById(id);
		if (result.isEmpty()) {
			return new ResponseEntity<Simple>(HttpStatus.NOT_FOUND);
		} 
		return new ResponseEntity<Simple>(result.get(), HttpStatus.OK);
	}
}