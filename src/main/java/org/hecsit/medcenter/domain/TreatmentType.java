package org.hecsit.medcenter.domain;

/**
 * Created by Наталья on 01.03.2016.
 */
public class TreatmentType {
    private String _name;
    private String _description;

    public TreatmentType(String name, String description){
        _name = name;
        _description = description;
    }

    public String GetName(){
        return  _name;
    }

    public void SetName(String name){
        _name = name;
    }

    public String GetDescription(){
        return _description;
    }

    public void SetDescription(String description){
        _description = description;
    }
}
