package Medicine_EL_Factory;

public class Patient_Upper_Body implements Patient
{
    // Basic Patient Information 
    private int patient_age_group;
    private char patient_gender;

    // Upper Body based values 
    private int upper_body_pain_time;
    private int discomfort_level;

    // Variable to hold message 
    private String medical_message;

    // Constructor 
    public Patient_Upper_Body(int patient_age_group, char patient_gender, int upper_body_pain_time, int discomfort_level)
    {
        this.patient_age_group = patient_age_group;
        this.patient_gender = patient_gender;
        this.upper_body_pain_time = upper_body_pain_time;
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

    // Setters for upper Based Questions 

    public void set_Upper_Body_Pain_Time(int time)
    {
        this.upper_body_pain_time = time;
    }

    public void set_Upper_Body_Discomfort_Level(int level)
    {
        this.discomfort_level = level;
    }

    // Getter for the Health Message //
    public String getMedical_message()
    {
        return medical_message;
    }


    // Assign Upper Body Pain Choices 
    @Override
    public void generateHealthMessage()
    {
        switch (patient_gender)
        {
            case 'M':
                switch (patient_age_group)
                {
                    case 1:
                        switch (upper_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Nitroglycerin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Clopidogrel";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Dipyridamole";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Nitroglycerin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Dipyridamole";
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
                                        medical_message = "Based on your choice's we recommend Nitroglycerin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Prasugrel";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (upper_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Benazepril";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Captopril";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Enalapril";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Fosinopril ";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Lisinopril";
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
                                        medical_message = "Based on your choice's we recommend Perindopril";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Moexipril";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (upper_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Quinapril";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Ramipril";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Trandolapril ";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Azilsartan";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Candesartane";
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
                                        medical_message = "Based on your choice's we recommend Telmisartan";
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
                        switch (upper_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Valsartan";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Azilsartan";
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
                                        medical_message = "Based on your choice's we recommend Eprosartan";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Irbesartan ";
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
                                        medical_message = "Based on your choice's we recommend Azilsartan";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Telmisartan";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (upper_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Benazepril";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Captopril";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Enalapril";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Fosinopril";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Prinivil";
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
                                        medical_message = "Based on your choice's we recommend Lotensin";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Capoten";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (upper_body_pain_time)
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
                                        medical_message = "Based on your choice's we recommend Vasotec";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Monopril";
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
                                        medical_message = "Based on your choice's we recommend Lotensin";
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
