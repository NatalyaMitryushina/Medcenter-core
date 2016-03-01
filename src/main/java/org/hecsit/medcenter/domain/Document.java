package org.hecsit.medcenter.domain;

/**
 * Created by Наталья on 01.03.2016.
 */
public abstract class Document {
    protected String _series;
    protected String _number;


    public String GetSeries(){
        return _series;
    }

    public void SetSeries(String series){
        _series = series;
    }

    public String GetNumber(){
        return _number;
    }

    public void SetNumber(String number){
        _number = number;
    }
}

