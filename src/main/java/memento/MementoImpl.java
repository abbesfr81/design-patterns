/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbesbelhoul
 */
public class MementoImpl implements Memento {

    protected List<OptionVehicule> options = new ArrayList<OptionVehicule>();

    public void setEtat(List<OptionVehicule> optionsparam) {
        this.options.clear();
        this.options.addAll(optionsparam);
    }

    public List<OptionVehicule> getEtat() {
        return options;
    }
}
