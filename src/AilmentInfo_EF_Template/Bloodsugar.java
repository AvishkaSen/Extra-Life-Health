
package AilmentInfo_EF_Template;

import DesignP_Assignment_Common.mainpage;

// Part of template pattern
public class Bloodsugar extends Template{
    
    @Override
    public void topic(){
        mainpage.jLabel6.setText("<html> <u>Blood Sugar Management</u> </html>");
    }

    @Override
    public void topicinfo() {
        mainpage.jLabel7.setText("<html> Also known as Blood Glucose, this can damage the person overtime along the years if they have a history of diabetes. </br> It can cause problems such as "
                + "kidney failiure, weakened immune system, nerve damage strokes, vision loss etc. It is imperitive to control your blood sugar levels through dieting with lesss carbohydrates intake"
                + " and constant exercise to keep yourself at a stable level to prevent long term damage to your body. "
                + "<br></br> <br></br> Doctors diagnose a paient with diabetes by checking 3 types of tests called: "
                + " <ul><li>Fasting plasma glucose test - Tests are carried out to check if your blood sugar levels after are higher than 126mg/dL after 8 hours</li> "
                + "<li>Oral glucose tolerance test - The patient is given a sugar heavy drink after 8 hours of fasting to check if the sugar level is over 200</li> "
                + "<li>Random check - It is checked if the patient is urinating more, constantly thirsty or lost a lot of weight, and will be done a random of the two above tests.</li></ul></html>");
    }
    
    @Override
    public void furtherinfo(){
        mainpage.jPanel3.setVisible(false);
        mainpage.jLabel3.setText("<html><u><b>How do I control my Blood Sugar levels?</b></u><br></br><br></br> It is possible to test your blood sugar yourself at home by using a Glucometer and providing a blood sample to it."
                + "It is considered to be a normal level if your readings are below 100mg/dL after fasting for 8 hours and less than 140mg/DL after 2 hours after eating. "
                + "<br></br><br></br>Levels tend to be the lowest before their meal routine per day, and varies with normal levels for people that do not suffer with diabetes.</html>");
    }
    
}
