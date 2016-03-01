package org.hecsit.medcenter.domain;

/**
 * Created by Наталья on 01.03.2016.
 */
public class Policy extends Document {
    private String _company;

    public Policy(String series, String number, String company){
        super._series = series;
        super._number = number;
        _company = company;
    }

    public String GetCompany(){
        return _company;
    }

    public void SetCompany(String company){
        _company = company;
    }
}
