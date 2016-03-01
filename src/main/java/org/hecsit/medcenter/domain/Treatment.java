package org.hecsit.medcenter.domain;

/**
 * Created by Наталья on 01.03.2016.
 */
public class Treatment extends Entity {
    public enum ProgressType{
        Awaiting,
        InProgress,
        Completed,
        Uncompleted,
        Cancelled
    }

    private TreatmentType _treatmentType;
    private HealthProfessional _healthProfessional;
    private ProgressType _progress;

    public  Treatment(TreatmentType treatmentType, HealthProfessional healthProfessional,
                      ProgressType progress){
        _treatmentType = treatmentType;
        _healthProfessional = healthProfessional;
        _progress = progress;
    }

    public TreatmentType GetTreatmentType(){
        return  _treatmentType;
    }

    public void SetTreatmentType(TreatmentType treatmentType){
        _treatmentType = treatmentType;
    }

    public HealthProfessional GetHealthProfessional(){
        return _healthProfessional;
    }

    public void SetHealthProfessional(HealthProfessional healthProfessional){
        _healthProfessional = healthProfessional;
    }

    public ProgressType GetProgress(){
        return _progress;
    }

    public void SetProgress(ProgressType progress){
        _progress = progress;
    }
}
