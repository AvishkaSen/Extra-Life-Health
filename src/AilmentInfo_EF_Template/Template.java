package AilmentInfo_EF_Template;


import DesignP_Assignment_Common.mainpage;
import static DesignP_Assignment_Common.mainpage.jLabel3;
import static DesignP_Assignment_Common.mainpage.jLabel4;
import static DesignP_Assignment_Common.mainpage.jLabel5;
import static DesignP_Assignment_Common.mainpage.jLabel6;
import static DesignP_Assignment_Common.mainpage.jLabel7;


public abstract class Template {
    
    // Methods to be used for Template design pattern
    public final void Info(){
        setvisible(); // To set the invisible lables and table as visible
        topic();
        topicinfo();       
        furtherinfo();
        source();
        contact();   
    }
    
    // COMMON FOR ALL
    public void setvisible(){
        mainpage.jLabel3.setVisible(true);
        mainpage.jLabel4.setVisible(true);
        mainpage.jLabel5.setVisible(true);
        mainpage.jLabel6.setVisible(true);
        mainpage.jLabel7.setVisible(true);
    }
    
    public void source() {
        mainpage.jLabel4.setText("<html>All information is provided by valid medical sources, for Cardiovascular, hereditary diseases and other Physciological illnesses. "
                + "Sources such as WEBMD and the American Heart Health Association were used.</html>");
    }
    
    public void contact(){
        mainpage.jLabel5.setText("Please contact us at support@extralife.org to provide feedback on '" + mainpage.jComboBox1.getSelectedItem().toString() + "' information accuracy.");
    }

    // Unique methods per class
    public abstract void topic();
    public abstract void topicinfo();
    public abstract void furtherinfo();
}

