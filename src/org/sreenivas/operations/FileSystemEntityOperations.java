/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.operations;

import org.sreenivas.Exceptions.IlegalFileSystemOperationException;
import org.sreenivas.Exceptions.NotATextFileException;
import org.sreenivas.Exceptions.PathAlreadyExistsException;
import org.sreenivas.Exceptions.PathNotFoundException;
import org.sreenivas.baseentities.FileTypes;

/**
 *
 * @author sreenivas
 */
public class FileSystemEntityOperations implements FileSystemEntityOperationsInterface {

    @Override
    public boolean create(FileTypes type, String name, String pathOfParent) throws PathNotFoundException, PathAlreadyExistsException, IlegalFileSystemOperationException {
        if ((name == null || name.trim().length() == 0)) {
            throw new IlegalFileSystemOperationException("Cannot create a drive");
        }
        
        return true;
    }

    @Override
    public boolean delete(String path) throws PathNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean move(String sourcePath, String destinationPath) throws PathNotFoundException, PathAlreadyExistsException, IlegalFileSystemOperationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeToFile(String path, String content) throws PathNotFoundException, NotATextFileException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
