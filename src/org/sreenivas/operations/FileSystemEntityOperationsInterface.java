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
public interface FileSystemEntityOperationsInterface {
    
    public boolean create(FileTypes type, String name, String pathOfParent) throws PathNotFoundException, PathAlreadyExistsException, IlegalFileSystemOperationException;
    public boolean delete(String path) throws PathNotFoundException;
    public boolean move(String sourcePath, String destinationPath) throws PathNotFoundException, PathAlreadyExistsException, IlegalFileSystemOperationException;
    public boolean writeToFile(String path, String content) throws PathNotFoundException, NotATextFileException;
}
