/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.awt.event.MouseEvent;

/**
 *
 * @author hossam
 */
public interface MouseChangedObserver {

    /**
     *
     * @param state
     * @param e
     */
    void MouseStateChanged(String state,MouseEvent e);
    
}
