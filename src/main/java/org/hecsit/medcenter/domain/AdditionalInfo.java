package org.hecsit.medcenter.domain;

/**
 * Created by Наталья on 01.03.2016.
 */
public class AdditionalInfo {
    public enum AdditionalInfoType{
        BloodGroup,
        AllergicResponse,
        Intolerance
    }

    private AdditionalInfoType _type;
    private String _info;

    public AdditionalInfo(AdditionalInfoType type, String info){
        _type = type;
        _info = info;
    }

    public AdditionalInfoType GetType(){
        return _type;
    }

    public void SetType(AdditionalInfoType type){
        _type = type;
    }

    public String GetInfo(){
        return _info;
    }

    public  void SetInfo(String info){
        _info = info;
    }

}
