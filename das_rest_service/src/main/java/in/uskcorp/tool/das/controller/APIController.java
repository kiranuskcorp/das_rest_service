package in.uskcorp.tool.das.controller;

import in.uskcorp.tool.das.service.APIService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/*
@Author Kiran @ 03/07/2017

*/
public abstract class APIController<T> {

	@RequestMapping(value = DASRestURIConstants.READ_ALL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<T>> readAll() {
		try {
			List<T> list = getService().readAll();
			return new ResponseEntity<List<T>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<T>>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

	@RequestMapping(value = DASRestURIConstants.READ, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<T> read(@RequestParam Integer id) {
		try {
			T t = getService().read(id);
			return new ResponseEntity<T>(t, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<T>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

	@RequestMapping(value = DASRestURIConstants.CREATE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> create(@RequestBody T a) {
		try {
			getService().create(a);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

	@RequestMapping(value = DASRestURIConstants.UPDATE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> update(@RequestBody T a) {
		try {
			getService().update(a);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}

	@RequestMapping(value = DASRestURIConstants.DELETE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> delete(@RequestParam Integer id) {
		try {
			getService().delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.SERVICE_UNAVAILABLE);
		}
	}
 	protected abstract APIService<T> getService();
}
