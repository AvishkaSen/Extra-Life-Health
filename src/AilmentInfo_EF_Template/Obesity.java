
package AilmentInfo_EF_Template;

import DesignP_Assignment_Common.mainpage;


public class Obesity extends Template{

    @Override
    public void topic() {
        mainpage.jLabel6.setText("<html> <u> Overweight and Obesity </u> </html>");
    }

    @Override
    public void topicinfo() {
        mainpage.jLabel7.setText("<html>The term 'Obesity' describes a person that is overweight in terms of body fat. A person is usually diagnosed with obesity by checking their height "
                + "and weight on a BMI (Body Mass Index) and seeing if they are overweight. <br></br> <br></br> "
                + "The main cause of obesity is consuming high fatty and calorie foods with sugar and not having enough physical activity throughout the day. Suffering from obesity can bring "
                + "long term issues such as High Blood Pressure, Cardiovascular diseases, stroke or heart attack, liver and kidney diseses asthma, sleep apnea, etc. "
                + "<br></br>"
                + "If nothing is done to circumvent or work towards losing weight, there is very high risk of permanent damage to your body, or even loss of life. "
                + "<br></br> "
                + "<b><i> It is vital for any person to be within' the healthy position of the BMI scale to avoid any of these issues further in life.</i></b></html>");
    }

    @Override
    public void furtherinfo() {
        mainpage.jPanel3.setVisible(false);
        mainpage.jLabel3.setText("<html><u>How to overcome Obesity</u>"
                + "<br></br> <br></br> "
                + "There are many ways to treat obesity to get to a better heathy healthy standing in weight. Such as: "
                + "<ul><li> Take part in more physically active activities such as jogging or walking for up to 1-2 hours a day.</li>"
                + "<li> Go on a balanced diet and monitor your calorie intake and eat more veggies.</li>"
                + "<li> Consume less processed or sugar filled junk foods</li>"
                + "<li> Enroll in a weight loss regiment</li></ul>"
                + "<br></br>"
                + "Preventing obesity can keep you in good health and can also avoid long term chronic health conditions. "
                + "<br></br>"
                + "Even getting to a healthy standing might also result in the control of other Cardiovascular diseases such as High Blood Pressure.<html>");
    } 
}
