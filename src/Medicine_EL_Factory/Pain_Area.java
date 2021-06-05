package Medicine_EL_Factory;

import DesignP_Assignment_Common.mainpage;
import static DesignP_Assignment_Common.mainpage.jRadioButton1;
import static DesignP_Assignment_Common.mainpage.jRadioButton2;
import static DesignP_Assignment_Common.mainpage.jRadioButton3;

public class Pain_Area
{

    // Basic Patient Information 
    int patient_age_group;
    char patient_gender;

    // Patient Pain Information 
    int patient_pain_area;
    int patient_pain_time;
    int patient_pain_level;

    // Temp Medical Message Store 
    public String medicalMessage;

    public Pain_Area(int patient_age_group, char patient_gender, int patient_pain_area)
    {
        this.patient_age_group = patient_age_group;
        this.patient_gender = patient_gender;
        this.patient_pain_area = patient_pain_area;
    }

    // Question 4 //////////////////////////////
    public void getUserPainTime()
    {
        if (mainpage.jRadioButton9.isSelected() == true) {
            patient_pain_time = 1;
            
        } else if (mainpage.jRadioButton10.isSelected() == true) {
            patient_pain_time = 2;
            
        } else if(mainpage.jRadioButton11.isSelected() == true) {
            patient_pain_time = 3;     
        }
        
    }

    // Question 5 //////////////////////////////
    public void getUserPainLevel()
    {   
        if (mainpage.jRadioButton12.isSelected() == true) {
            patient_pain_level = 1;
            
        } else if (mainpage.jRadioButton13.isSelected() == true) {
            patient_pain_level = 2;
            
        } else if(mainpage.jRadioButton14.isSelected() == true) {
            patient_pain_level = 3;     
        }
        
    }


    public Patient getPatientMedication(int age_group, char gender)
    {
        if (patient_pain_area == 1)
        {
            Patient_Head obj = new Patient_Head(patient_age_group, patient_gender, patient_pain_time, patient_pain_level);
            medicalMessage = obj.getMedical_message();
            return obj;
        }
        else if (patient_pain_area == 2)
        {
            Patient_Upper_Body obj = new Patient_Upper_Body(patient_age_group, patient_gender, patient_pain_time, patient_pain_level);
            medicalMessage = obj.getMedical_message();
            return obj;
        }
        else if (patient_pain_area == 3)
        {
            Patient_Lower_Body obj = new Patient_Lower_Body(patient_age_group, patient_gender, patient_pain_time, patient_pain_level);
            medicalMessage = obj.getMedical_message();
            return obj;
        }
        else
        {
            return null;
        } 
    }   
}


