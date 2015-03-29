/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.baseentities;

import java.util.Set;
import java.util.TreeSet;
import org.sreenivas.Exceptions.PathAlreadyExistsException;

/**
 *
 * @author sreenivas
 */
public abstract class NonFileEntity extends FileSystemEntity {
    private Set<NonFileEntity> folderList;
    private Set<NonFileEntity> zipFileList;
    private Set<FileEntity> textFilesList;

    public Set<NonFileEntity> getFolderList() {
        return folderList;
    }

    public void setFolderList(Set<NonFileEntity> folderList) {
        this.folderList = folderList;
    }

    public Set<NonFileEntity> getZipFileList() {
        return zipFileList;
    }

    public void setZipFileList(Set<NonFileEntity> zipFileList) {
        this.zipFileList = zipFileList;
    }

    public Set<FileEntity> getTextFilesList() {
        return textFilesList;
    }

    public void setTextFilesList(Set<FileEntity> textFilesList) {
        this.textFilesList = textFilesList;
    }

    @Override
    public double getSize() {
        double totalSize = 0;
        if(getFolderList()!=null && !getFolderList().isEmpty()){
            for(NonFileEntity nonFileEntity:getFolderList()){
                totalSize+=nonFileEntity.getSize();
            }
        }
        if(getZipFileList()!=null && !getZipFileList().isEmpty()){
            for(NonFileEntity nonFileEntity:getZipFileList()){
                totalSize+=nonFileEntity.getSize();
            }
        }
        if(getTextFilesList()!=null && !getTextFilesList().isEmpty()){
            for(FileEntity fileEntity:getTextFilesList()){
                totalSize+=fileEntity.getSize();
            }
        }
        return totalSize;
    }
    
    public boolean addFolder(NonFileEntity folder) {
        if (folderList == null) {
            folderList = new TreeSet<>();
        }
        else {
            if (!folderList.add(folder)) {
                throw new PathAlreadyExistsException("Folder Already Exists");
            }
            else {
                return true;
            }
        }
        return false;
    }
    
}
