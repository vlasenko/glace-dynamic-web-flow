package com.sysgears.gdwf.exceptions

/**
 * Thrown in case if entry can't be found by specified tokens.
 */
class NoSuchEntryException extends GDWFEntryException {

    /**
     * Constructs new exception instance with the specified detail message.
     *
     * @param message the detail message
     */
    NoSuchEntryException(String message) {
        super(message)
    }
}