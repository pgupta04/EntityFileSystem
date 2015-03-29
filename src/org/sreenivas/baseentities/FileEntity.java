/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.baseentities;

/**
 *
 * @author ashwinisreenivas
 */
public abstract class FileEntity extends FileSystemEntity {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public double getSize() {
        return (double)content.length();
    }
    
    
}
