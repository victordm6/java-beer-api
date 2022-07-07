package victor.javabeerapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

class BeerNotFoundException extends Exception {

    BeerNotFoundException(String beerName) {
        super(String.format("Beer with name %s not found in the system.", beerName));
    }
    
    BeerNotFoundException(Long id) {
        super(String.format("Beer with id %s not found in the system.", id));
    }
}
