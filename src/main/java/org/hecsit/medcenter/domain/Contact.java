package org.hecsit.medcenter.domain;

/**
 * Created by Наталья on 01.03.2016.
 */
public class Contact {
    private String _phoneNumber;
    private  String _email;

    public Contact(String phoneNumber, String email){
        _phoneNumber = phoneNumber;
        _email = email;
    }

    public String PhoneNumber(){
        return _phoneNumber;
    }

    public  String Email(){
        return _email;
    }
}
