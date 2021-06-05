package Medicine_EL_Factory;

import java.util.Scanner;

public class Patient_Head implements Patient{


    // Basic Patient Information 
    private int patient_age_group;
    private char patient_gender;

    // Head based values 
    private int head_pain_time;
    private int discomfort_level;

    // Variable to hold message 
    private String medical_message;

    // Constructor 
    public Patient_Head(int patient_age_group, char patient_gender, int head_pain_time, int discomfort_level)
    {
        this.patient_age_group = patient_age_group;
        this.patient_gender = patient_gender;
        this.head_pain_time = head_pain_time;
        this.discomfort_level = discomfort_level;
        generateHealthMessage();
    }

    // Setters for Common Patient Questions 
    @Override
    public void setAgeGroup(int age)
    {
        this.patient_age_group = age;
    }

    @Override
    public void setGender(char gender)
    {
        this.patient_gender = gender;
    }

    // Setters for Head Based Questions 

    public void set_Head_Pain_Time(int time)
    {
        this.head_pain_time = time;
    }

    public void set_Head_Discomfort_Level(int level)
    {
        this.discomfort_level = level;
    }

    // Getter for the Health Message //
    public String getMedical_message()
    {
        return medical_message;
    }

    // Assign Head Pain Choices 
    @Override
    public void generateHealthMessage()
    {
        switch (patient_gender)
        {
            case 'M':
                switch (patient_age_group)
                {
                    case 1:
                        switch (head_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Aspirin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Naproxen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Fenoprofen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                            case 3:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Methocarbomol";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (head_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Aspirin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Acetaminophen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Naproxen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                            case 3:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Methocarbomol";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (head_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Carisprodol";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Acetaminophen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Cybclobenzaprine";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                            case 3:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;

                }
                break;
            case 'F':
            {
                switch (patient_age_group)
                {
                    case 1:
                        switch (head_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Aspirin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Naproxen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Ketoprofen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                            case 3:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Ketorolac";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (head_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Diclofenac";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Acetaminophen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Methocarbomol";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                            case 3:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Meclofenamate";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (head_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Carisprodol";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Acetaminophen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Cybclobenzaprine";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                            case 3:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;

                }
                break;
            }

        }

    }

}
