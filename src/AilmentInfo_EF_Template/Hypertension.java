package AilmentInfo_EF_Template;

import DesignP_Assignment_Common.mainpage;

// Part of template pattern
public class Hypertension extends Template {
    
    @Override
    public void topic(){
        mainpage.jLabel6.setText("<html> <u>Hypertension / High Blood Pressure</u> </html>");
    }

    @Override
    public void topicinfo() {
        mainpage.jLabel7.setText("<html>Hypertension, or more commonly known as High Blood pressure is called a 'silent killer'. Most adults live out the most of their lives "
                + "without even knowing they are suffering from it.<br/> It is an ailment that shows little to no symptoms in the longrun and are common with obese or elderly people."
                + "The cause of Hypertension is when your blood pressure is higher than normal and can damage your blood vessels and arteries, which could lead to "
                + "a heart attack or stroke in the long term. However with constant monitoring & diet control with medication, it can be controlled. <br> </br> "
                + "<br> </br> Below are readings for high BP:</html>");
    }
    
    @Override
    public void furtherinfo(){
        mainpage.jPanel3.setVisible(true);
        mainpage.jLabel3.setText("<html>If your Blood Pressure readings are in the Hypertensive Crisis threshold: <b><p style=\"color:red;\">Please contact your doctor IMMEDIATELY!</p></b></html>");
    }
    
}
