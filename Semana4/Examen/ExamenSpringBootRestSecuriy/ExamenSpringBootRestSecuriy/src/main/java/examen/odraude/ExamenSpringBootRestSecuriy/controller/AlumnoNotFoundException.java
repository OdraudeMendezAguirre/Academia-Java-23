package examen.odraude.ExamenSpringBootRestSecuriy.controller;

public class AlumnoNotFoundException extends RuntimeException {

	public AlumnoNotFoundException() {
	}

	public AlumnoNotFoundException(String message) {
		super(message);
	}

	public AlumnoNotFoundException(Throwable cause) {
		super(cause);
	}

	public AlumnoNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlumnoNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
