package Medicine_EL_Factory;

public class Patient_Lower_Body implements Patient
{
    // Basic Patient Information 
    private int patient_age_group;
    private char patient_gender;

    // Upper Body based values 
    private int lower_body_pain_time;
    private int discomfort_level;

    // Variable to hold message 
    private String medical_message;

    // Constructor 
    public Patient_Lower_Body(int patient_age_group, char patient_gender, int lower_body_pain_time, int discomfort_level)
    {
        this.patient_age_group = patient_age_group;
        this.patient_gender = patient_gender;
        this.lower_body_pain_time = lower_body_pain_time;
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

    // Setters for lower body Based Questions 

    public void set_Lower_Body_Pain_Time(int time)
    {
        this.lower_body_pain_time = time;
    }

    public void set_Lower_Body_Discomfort_Level(int level)
    {
        this.discomfort_level = level;
    }

    // Getter for the Health Message //
    public String getMedical_message()
    {
        return medical_message;
    }

    // Assign Lower Body Pain Choices 
    @Override
    public void generateHealthMessage()
    {
        switch (patient_gender)
        {
            case 'M':
                switch (patient_age_group)
                {
                    case 1:
                        switch (lower_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend naproxen";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend acetaminophen";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend  ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend diclofenac";
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
                                        medical_message = "Based on your choice's we recommend Voltaren";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Advil";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (lower_body_pain_time)
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
                                        medical_message = "Based on your choice's we recommend ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Anaprox";
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
                                        medical_message = "Based on your choice's we recommend Naprelan";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Mapap";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (lower_body_pain_time)
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
                                        medical_message = "Based on your choice's we recommend ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend acetaminophen";
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
                                        medical_message = "Based on your choice's we recommend Advil";
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
                        switch (lower_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend  ibuprofen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend diclofenac";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend acetaminophenn";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Paracetamol";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Aleve";
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
                                        medical_message = "Based on your choice's we recommend Voltaren";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Motrin";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (lower_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Abenol";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Actamin";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Addaprin";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Apra";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Cetafen";
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
                                        medical_message = "Based on your choice's we recommend Genpril";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Nuprin";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend Visiting a doctor for further diagnosis";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        switch (lower_body_pain_time)
                        {
                            case 1:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Aflaxen";
                                        break;
                                    case 2:
                                        medical_message = "Based on your choice's we recommend Nuprin";
                                        break;
                                    case 3:
                                        medical_message = "Based on your choice's we recommend EC-Naprosyn";
                                        break;
                                }
                                break;
                            case 2:
                                switch (discomfort_level)
                                {
                                    case 1:
                                        medical_message = "Based on your choice's we recommend Aflexeryl-MC";
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
                                        medical_message = "Based on your choice's we recommend Nuprin";
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
