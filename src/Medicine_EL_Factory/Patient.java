package Medicine_EL_Factory;

public interface Patient
{
    // Setters for common Patient Questions
    void setAgeGroup(int age);

    void setGender(char gender);

    // Message Generating
    void generateHealthMessage();
}

