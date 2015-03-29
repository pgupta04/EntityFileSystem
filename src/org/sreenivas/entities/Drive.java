/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.entities;

import java.util.Set;
import org.sreenivas.baseentities.ChildInterface;
import org.sreenivas.baseentities.DriveEntity;
import org.sreenivas.baseentities.FileEntity;
import org.sreenivas.baseentities.FileTypes;
import org.sreenivas.baseentities.NonDriveEntity;
import org.sreenivas.baseentities.NonFileEntity;

/**
 *
 * @author ashwinisreenivas
 */
public class Drive extends DriveEntity implements ChildInterface{
    
    @Override
    public NonDriveEntity getChild() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addFolder(NonFileEntity folder) {
        return super.addFolder(folder); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSize() {
        return super.getSize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTextFilesList(Set<FileEntity> textFilesList) {
        super.setTextFilesList(textFilesList); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<FileEntity> getTextFilesList() {
        return super.getTextFilesList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setZipFileList(Set<NonFileEntity> zipFileList) {
        super.setZipFileList(zipFileList); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<NonFileEntity> getZipFileList() {
        return super.getZipFileList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFolderList(Set<NonFileEntity> folderList) {
        super.setFolderList(folderList); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<NonFileEntity> getFolderList() {
        return super.getFolderList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setType(FileTypes type) {
        super.setType(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FileTypes getType() {
        return super.getType(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSize(double size) {
        super.setSize(size); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPath(String path) {
        super.setPath(path); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPath() {
        return super.getPath(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

  
}
