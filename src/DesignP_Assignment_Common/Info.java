
package DesignP_Assignment_Common;

public class Info {
    
    //Used to display the medical description of Aspirin in the mainpage
    public String Aspr() {
        return "<html> <p style=\"text-align:center;\"> The Aspirin medication is used to reduce or momentairily eliminate the sense of pain such as headaches or fever. <br></br> It can be used for many mild "
                + "to moderate pain symptoms as is very common in the day to day household.<br></br> Recommended dosage per day is 1 tablet for children and 2 for adults. </p> </html>";
    }
    
    //Used to display the medical description of Abenol in the mainpage
    public String Abeno() {
        return "<html> <p style=\"text-align:center;\"> Abenol is a pain relever called 'analgescics' for minor discomforts. It takes about 1-2 hours to take "
                + "action after consumption. </p> </html>";
    }
    
    // Used to display the medical description of Ibuprofen in the mainpage
    public String Ibupro() {
        return "<html> <p style=\"text-align:center;\"> Ibuprofen is a strong pain reliever drug that targets pain and inflammation.<br></br> This medication can be used for menstrual discomfort, migraines, "
                + "and arthritis.<br></br> Side effects can include nausea or an upset stomach and also runs the risk of increasing your blood pressure. </p></html>";
    }
    
    
    
    // Used for about tab in the application's mainpage
    public String About(){
        return "<html> <p style=\"text-align:center;\"> This assignment was created by Aviska Dimal Senanayake (CB007077) for the Object Oriented Application Engineering Java module"
                + " at APIIT Sri Lanka. We were tasked with creating an application of our choice with the Gang of Four Design Patterns. "
                + " <br><br/>"
                + " <br><br/>"
                + " For this health application and the information it provides, the reputable online sources are listed in the images below. </p> </html>";
        
    }
    
}
