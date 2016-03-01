package org.hecsit.medcenter.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Наталья on 01.03.2016.
 */
public class Patient extends Entity {
    private String _fullName;
    private Date _birthDate;
    private Contact _contact;
    private ArrayList<AdditionalInfo> _additionalInfo;

    public  Patient(String fullName, Date birthDate, Contact contact){
        _fullName = fullName;
        _birthDate = birthDate;
        _contact = contact;

        _additionalInfo = new ArrayList<AdditionalInfo>();
    }

    public String GetFullName(){
        return  _fullName;
    }

    public void  SetFullName(String fullName){
        _fullName = fullName;
    }

    public Date GetBirthDate(){
        return _birthDate;
    }

    public void SetBirthDate(Date birthDate){
        _birthDate = birthDate;
    }

    public  Contact GetContact(){
        return _contact;
    }

    public void SetContact(Contact contact){
        _contact = contact;
    }

}
