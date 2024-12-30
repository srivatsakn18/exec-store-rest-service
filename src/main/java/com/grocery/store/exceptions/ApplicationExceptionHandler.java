package com.grocery.store.exceptions;

import com.grocery.store.models.GetEntitiesErrorDTO;
import com.grocery.store.models.GetEntitiesResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ObjectNotFoundException.class, UserNotFoundException.class})
    public ResponseEntity<GetEntitiesErrorDTO> objectNotFoundErrorHandler(Exception e) {
        return new ResponseEntity<>(new GetEntitiesErrorDTO("Request Unsuccessful",
                HttpStatus.NOT_FOUND.name(), e.getMessage()),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AuthorizationException.class)
    public ResponseEntity<GetEntitiesErrorDTO> unauthorizedErrorHandler(Exception e) {
        return new ResponseEntity<>(new GetEntitiesErrorDTO("Unauthorized",
                HttpStatus.UNAUTHORIZED.name(), e.getMessage()),
                HttpStatus.UNAUTHORIZED);
    }
}
