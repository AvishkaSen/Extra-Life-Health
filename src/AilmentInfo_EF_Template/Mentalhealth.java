
package AilmentInfo_EF_Template;

import DesignP_Assignment_Common.mainpage;

public class Mentalhealth extends Template {

    @Override
    public void topic() {
        mainpage.jLabel6.setText("<html> <u> Mental Health </u> </html>");
    }

    @Override
    public void topicinfo() {
        mainpage.jLabel7.setText("<html> Mental health is something majority of people in the world today suffer from be it either emotional, psycholgical or social well-being. It plays a "
                + "big part in stress and influences our ability to carry out day to day tasks and emotional activities. Due to that, having a good mental health standing is vital for "
                + "any growing human being. <br></br><br></br>Most common of all the causes is due to life experiences but other biological factors can play into this as well. <br></br> "
                + "Because its a condition that can effect a person's day to day life it is vital that you get professional assistance as soon as possible if you are showing early"
                + " signs of a mental health issue. </html>");
    }

    @Override
    public void furtherinfo() {
        mainpage.jPanel3.setVisible(false);
        mainpage.jLabel3.setText("<html><u><b>What are the early warning signs?</b></u> <br></br>"
                + "<ul><li> Constant Quarelling with family or friends.</li>"
                + "<li> Considering self harm.</li>"
                + "<li> Feeling of helplessness of hopelessness.</li>"
                + "<li> Experiencing random mood swings.</li>"
                + "<li> Inability to perform daily tasks.</li>"
                + "<li> Feeling of numbness.</li></ul>"
                + "<br></br>"
                + "To overcome these feelings it is recommended to see a medical professional at your earliest convienience to get proper medication and guidance on how to proceed with this. "
                + "It helps to also practice with mediation and other recriational activities to circumvent mental health issues and better your daily health.</html>");
    }
     
}
