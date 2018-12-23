package com.codimiracle.database.accessor;

import java.io.IOException;

public class DatabaseAccessorException extends IOException {
	private static final long serialVersionUID = -9002725681826350951L;

	public DatabaseAccessorException(String message) {
		super(message);
	}

	public DatabaseAccessorException(Throwable throwable) {
		super(throwable);
	}

	public DatabaseAccessorException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public static DatabaseAccessorException throwFrom(Throwable throwable) {
		return new DatabaseAccessorException(throwable.getLocalizedMessage(), throwable);
	}

	public static DatabaseAccessorException throwFrom(String message) {
		return new DatabaseAccessorException(message);
	}
}
