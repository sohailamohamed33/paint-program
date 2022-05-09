/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.ArrayList;

/**
 *
 * @author hossam
 */
public class DrawAreaCaretaker {

    private ArrayList<DrawAreaMemento> mementoList = new ArrayList<>();
    private int index = -1;

    /**
     *
     * @param m
     */
    public void save(DrawAreaMemento m) {
        index++;
        mementoList.add(index, m);
    }

    /**
     *
     * @return
     */
    public DrawAreaMemento undo() {
       if (index != 0) {
        index--;
       }
        return mementoList.get(index);
        
    }

    /**
     *
     * @return
     */
    public DrawAreaMemento redo() {
        if (index >= mementoList.size()-1) {
            return mementoList.get(mementoList.size() - 1);
        } else {
            index++;
            return mementoList.get(index);
        }
    }

    /**
     *
     * @return
     */
    public DrawAreaMemento getLast() {
        return mementoList.get(index);
    }

}
