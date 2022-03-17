package com.learning.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GolobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAccessDeniedExceptio2n(Exception ex, WebRequest request) {
		return new ResponseEntity<>("Access denied fdsfs message here", new HttpHeaders(), HttpStatus.FORBIDDEN);
	}

//	@ExceptionHandler({ AccessDeniedException.class, NullPointerException.class })
//	public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
//		return new ResponseEntity<>("Access denied message here", new HttpHeaders(), HttpStatus.FORBIDDEN);
//	}
//
//	@Override
//	@ExceptionHandler({ CustomException.class })
//	protected ResponseEntity<Object> custom(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status,
//			WebRequest request) {
//		List<String> errors = new ArrayList<String>();
//		for (FieldError error : ex.getBindingResult().getFieldErrors()) {
//			errors.add(error.getField() + ": " + error.getDefaultMessage());
//		}
//		for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
//			errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
//		}
//
//		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
//		return handleExceptionInternal(ex, apiError, headers, HttpStatus.BAD_REQUEST, request);
//	}

}
