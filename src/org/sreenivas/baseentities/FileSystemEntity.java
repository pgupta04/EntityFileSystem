/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.baseentities;

/**
 *
 * @author sreenivas
 */
public abstract class FileSystemEntity {

    private FileTypes type;
    private String name;
    private String path;
    private double size;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public FileTypes getType() {
        return type;
    }

    public void setType(FileTypes type) {
        this.type = type;
    }

    
    
}
