package org.hecsit.medcenter.domain;

import java.util.Date;

/**
 * Created by Наталья on 01.03.2016.
 */
public class Passport extends Document {
    private String _issuingDepartment;
    private Date _issueDate;

    public Passport(String series, String number, String issuingDepartment, Date issueDate){
        super._series = series;
        super._number = number;
        _issuingDepartment = issuingDepartment;
        _issueDate = issueDate;
    }

    public String GetIssuingDepartment(){
        return _issuingDepartment;
    }

    public void SetIssuingDepartment(String issuingDepartment){
        _issuingDepartment = issuingDepartment;
    }

    public Date GetIssueDate(){
        return _issueDate;
    }

    public void SetIssueDate(Date issueDate){
        _issueDate = issueDate;
    }
}
