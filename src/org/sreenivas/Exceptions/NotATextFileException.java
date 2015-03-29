/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.Exceptions;

/**
 *
 * @author sreenivas
 */
public class NotATextFileException extends FileSystemException {

    public NotATextFileException() {
    }

    public NotATextFileException(String message) {
        super(message);
    }

    public NotATextFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotATextFileException(Throwable cause) {
        super(cause);
    }

    public NotATextFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
