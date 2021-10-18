package com.bridgelabs.userregistration;

public class MoodAnalyserException extends MoodAnalyser {
	public String message;
    public static ExceptionType type;

    public enum ExceptionType {
        EMPTY, NULL;
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }

}
