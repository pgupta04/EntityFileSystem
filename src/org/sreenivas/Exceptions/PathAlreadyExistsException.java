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
public class PathAlreadyExistsException extends FileSystemException {

    public PathAlreadyExistsException() {
    }

    public PathAlreadyExistsException(String message) {
        super(message);
    }

    public PathAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PathAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public PathAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
