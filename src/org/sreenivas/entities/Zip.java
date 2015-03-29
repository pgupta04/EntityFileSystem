/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.entities;

import java.util.Set;
import org.sreenivas.Exceptions.IlegalFileSystemOperationException;
import org.sreenivas.baseentities.NonFileEntity;
import org.sreenivas.baseentities.ParentInterface;

/**
 *
 * @author sreenivas
 */
public class Zip extends NonFileEntity implements ParentInterface{

    @Override
    public NonFileEntity getParent() {
        throw new IlegalFileSystemOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSize() {
        return (super.getSize()/2); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Set<NonFileEntity> getZipFileList() {
        return super.getZipFileList(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
