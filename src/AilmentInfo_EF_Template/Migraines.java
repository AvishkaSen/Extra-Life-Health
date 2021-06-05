
package AilmentInfo_EF_Template;

import DesignP_Assignment_Common.mainpage;


public class Migraines extends Template {

    @Override
    public void topic() {
        mainpage.jLabel6.setText("<html> <u> Migraines </u> </html>");    
    }

    @Override
    public void topicinfo() {
        mainpage.jLabel7.setText("<html> Migraine is a hightened form of a headache that brings feelings of nausea, or vomiting and can go on for many hours or even days. It is very common "
                + "among people who have a very stressful day to day life to experience constant migraines. "
                + "<br></br><br></br> The causes of migraines are related to changes in your brain's activity and can "
                + "even be triggered through other means such as blood flow to the brain. This can also be involved with fatigue or exposure to changing weather conditions such as a low humidity"
                + "and sunny morning.</html>");
    }

    @Override
    public void furtherinfo() {
        mainpage.jPanel3.setVisible(false);
        mainpage.jLabel3.setText("<html> <u> Remedies:</u> "
                + "<br></br><br></br>"
                + "There ways to remedy having a migraine at the comfort of your home,such as:"
                + "<br></br>"
                + "<ul><li> Resting on a comfortable surface with your eyes closed in a dark surrounding</li>"
                + "<li> Consuming plenty of liquids. Especially water.</li>"
                + "<li> Placing an ice pack on your forehead for an extended period of time</li>"
                + "<li> Drinking Asprin</li></ul>"
                + "<br></br> <br></br> If the Migraine still persists:"
                + "<b><p style=\"color:red;\">Please contact your doctor IMMEDIATELY!</p></b> </html>");
    }
    
}
