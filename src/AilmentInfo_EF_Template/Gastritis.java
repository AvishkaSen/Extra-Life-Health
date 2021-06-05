
package AilmentInfo_EF_Template;
 
import DesignP_Assignment_Common.mainpage;


public class Gastritis extends Template {

    @Override
    public void topic() {
        mainpage.jLabel6.setText("<html> <u> Gastritis </u> </html>");
    }

    @Override
    public void topicinfo() {
        mainpage.jLabel7.setText("<html> Gastritis is an inflammation or irritation of the stomach and can bring pain or discomfort to the person experiencing it. <br></br>"
                + "It can be caused by excessive alcohol consumtion, stress, stomach infections or incorrect use of medicine or even consumption of food that didn't sit well.<br></br>"
                + "Gastritis is diagnosed from your doctor after viewing relecant family and medical history with a physical examination. "
                + " <br></br> <br></br> <i> The tests are an Upper Endoscopy, Blood test and a Fecal occult blood test.</i> </html>");
    }

    @Override
    public void furtherinfo() {
        mainpage.jPanel3.setVisible(false);
        mainpage.jLabel3.setText("<html> <u> Gastritis Symptoms </u> "
                + "<ul><li> Abdominal Pain</li>"
                + "<li> Vomiting</li>"
                + "<li> Abdominal Bloating</li>"
                + "<li> Burning sensation in the stomach</li>"
                + "<li> Loss of appetite</li>"
                + "<li> Nausea or upset stomach</li></ul>"
                + "<br></br>"
                + "Treatment for Gastritis usually includes taking Antiacids or avoiding the consumption of spicy or hot food. <br></br>"
                + "Medication is also recommended to recover during time at home.</html>");
    }
    
}
