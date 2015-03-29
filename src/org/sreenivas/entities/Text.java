/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sreenivas.entities;

import org.sreenivas.baseentities.FileEntity;
import org.sreenivas.baseentities.NonFileEntity;
import org.sreenivas.baseentities.ParentInterface;

/**
 *
 * @author sreenivas
 */
public class Text extends FileEntity implements ParentInterface {

    @Override
    public NonFileEntity getParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
