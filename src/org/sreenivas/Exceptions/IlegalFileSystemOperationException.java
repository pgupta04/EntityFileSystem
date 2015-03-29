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
public class IlegalFileSystemOperationException extends FileSystemException {

    public IlegalFileSystemOperationException() {
    }

    public IlegalFileSystemOperationException(String message) {
        super(message);
    }

    public IlegalFileSystemOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlegalFileSystemOperationException(Throwable cause) {
        super(cause);
    }

    public IlegalFileSystemOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
