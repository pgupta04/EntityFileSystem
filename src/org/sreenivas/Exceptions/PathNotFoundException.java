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
public class PathNotFoundException extends FileSystemException {

    public PathNotFoundException() {
    }

    public PathNotFoundException(String message) {
        super(message);
    }

    public PathNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PathNotFoundException(Throwable cause) {
        super(cause);
    }

    public PathNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
