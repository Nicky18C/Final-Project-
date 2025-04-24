import java.awt.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CurrencyConverterProject_JACKS
{
    static double finalValue1;
    static double rate;
    static double EndAmount;


    public static final String[] InPocket = 
    {
        "United States - $USD",
        "Brazil - R$BRL",
        "Argentina - $ARS",
        "Bolivia - BsBOB",
        "Chile - $CLP",
        "Colombia - $COP",
        "Ecuador - $USD",
        "Guyana - GY$GYD",
        "Paraguay - ₲PYG",
        "Peru - S/.PEN",
        "Suriname - $SRD",
        "Uruguay - $UUYU",
        "El Salvador - $USD",
        "Guatemala - QGTQ",
        "Honduras - LHNL",
        "Nicaragua - C$NIO",
        "Panama - B/.PAB",
        "Costa Rica - ₡CRC",
        "Belize - BZ$BZD",
        "Canada - C$CAD"
    };



    public static final String[] EndGoal = 
    {
        "United States - $USD",
        "Brazil - R$BRL",
        "Argentina - $ARS",
        "Bolivia - BsBOB",
        "Chile - $CLP",
        "Colombia - $COP",
        "Ecuador - $USD",
        "Guyana - GY$GYD",
        "Paraguay - ₲PYG",
        "Peru - S/.PEN",
        "Suriname - $SRD",
        "Uruguay - $UUYU",
        "El Salvador - $USD",
        "Guatemala - QGTQ",
        "Honduras - LHNL",
        "Nicaragua - C$NIO",
        "Panama - B/.PAB",
        "Costa Rica - ₡CRC",
        "Belize - BZ$BZD",
        "Canada - C$CAD"
    };
  
















    public static void main(String[] args)  
    {
        


        while (true)
        {
            
            
            

  

             String choose = (String) JOptionPane.showInputDialog
             (
                 null, 
                 "What type of currency do you have", 
                 "Currency converter", 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 InPocket, 
                 InPocket
                 [0]
             ); 

             switch (choose) 
             {
                case "United States - $USD" -> $USDConverter();
                case "Brazil - R$BRL" -> $BRLConverter();
                case "Argentina - $ARS" -> $ARSConverter();
                case "Bolivia - BsBOB" -> $BOBConverter();
                case "$Chile - $CLP" -> $CLPConverter();
                case "Colombia - $COP" -> $COPConverter();
                case "Ecuador - $USD" -> $ECUConverter();
                case "Guyana - GY$GYD" -> $GYDConverter();
                case "Paraguay - ₲PYG" -> $PYGConverter();
                case "Peru - S/.PEN" -> $PENConverter();
                case "Suriname - $SRD" -> $SRDConverter();
                ///case "$Uruguay - $UUYU" -> $HNLConverter();
                case "El Salvador - $USD" -> $ELSConverter();
                //case "Guatemala - QGTQ" -> ฿Converter();
                //case "Honduras - LHNL" -> ₡Converter();
                case "Nicaragua - C$NIO" -> $NIOConverter();
                case "Panama - B/.PAB" -> $PABConverter();
                case "Costa Rica - ₡CRC" -> $CRCConverter();
                case "Belize - BZ$BZD" -> $BZConverter();
                case "Canada - C$CAD" -> $CADConverter();
                



                //case "$C" -> $CConverter();
                
                default -> JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
             }




            String[] options = 
            {
            "Convert Again",
            "Exit"
            };

            int choice = JOptionPane.showOptionDialog(null, "Would you like to convert more currency?",
                    
            "Repeat Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


            switch (choice) 
            {
                case 0:    continue;

                case 1: 
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Exiting...");
                    System.exit(0);
            }
        }
        
    }

    public static void $USDConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "United States - $USD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1072.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 979.5058;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 4274.03;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guyana - GY$GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.51;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.71611;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  24.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.35;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }
// fix the names and rates logic already done
    public static void $BRLConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "United States - $USD": 
                
                rate = 0.1669;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Argentina - $ARS": 
                rate = 172;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL             \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - $BOB": 
                rate = 1.21;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL             \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " BOB          \n"
                               + "Converted Amount:  $" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 166.95;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 733.95;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $ECU": 
                
                rate = 0.20;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "The official currency for Ecuador is the US dollar" );   
                  
                

                break;

                case "Guyana - $GYD": 
                rate = 35.57;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " GYD          \n"
                               + "Converted Amount:  $" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - $PYG": 
                rate = 1362.28;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " PYG          \n"
                               + "Converted Amount:  $" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - $PEN": 
                rate =  0.634;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " PEN          \n"
                               + "Converted Amount:  $" + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  6.21;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL             \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UYU": 
                rate =  7.3270;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " UYU          \n"
                               + "Converted Amount:  $" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $SVC": 
                rate =   0.1683;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " BRL          \n"
                               + "Converted Amount:  $" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - $GTQ": 
                rate =  1.30476;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " GTQ          \n"
                               + "Converted Amount:  $" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - $HNL": 
                rate =  1.3120694;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " HNL          \n"
                               + "Converted Amount:  $" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - $NIO": 
                rate =  6.25;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " NIO          \n"
                               + "Converted Amount:  $" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - $PAB": 
                rate =  0.1583;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " PAB          \n"
                               + "Converted Amount:  $" + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - $CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " CRC          \n"
                               + "Converted Amount:  $" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - $BZD": 
                rate =  0.40;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " BRL              \n"
                               + "Conversion Rate: $1 BRL  =  $" + rate + " BZD          \n"
                               + "Converted Amount:  $" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - $CAD": 
                rate =  0.2363;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CAD          \n"
                               + "Converted Amount:  $" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $ARSConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "United States - $USD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1072.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 979.5058;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 4274.03;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guyana - GY$GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.51;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.71611;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  24.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.35;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $BOBConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "United States - $USD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1072.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 979.5058;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 4274.03;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guyana - GY$GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.51;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.71611;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  24.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.35;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $CLPConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "United States - $USD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1072.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 979.5058;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 4274.03;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guyana - GY$GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.51;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.71611;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  24.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.35;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $COPConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Colombia - $COP": JOptionPane.showMessageDialog(null, "You already have that currency");
           
                case "United States - $USD": 
            
                rate = .0002297;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Brazil - R$BRL": 
            
                rate = .001362;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = .2473;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = .001582;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = .2275;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = .001362;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = .04810;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 1.838;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  .0008578;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  .008416;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  .009963;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = .001362;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " COP              \n"
                               + "Conversion Rate: $1 COP  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
                case "Guatemala - QGTQ": 
                rate =  .001771;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  .005922;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  .008454;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .0002297;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Costa Rica - ₡CRC": 
                rate =  .1170;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  .0004593;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  .0003214;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $ECUConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Ecuador - $USD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1072.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 979.5058;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 4274.03;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.51;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "United States - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.71611;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  24.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.35;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $ELSConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "El Salvador - $USD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1072.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 979.5058;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 4274.03;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.51;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "United States - $USD": 
                
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.71611;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  24.82;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  556;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.35;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $GYDConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Guyana - GY$GYD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
                case "United States - $USD": 
            
                rate = .004776;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Brazil - R$BRL": 
            
                rate = .02823;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 5.142;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = .03290;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 4.726;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = .004776;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 38.22;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  .01782;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  .1750;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  .2053;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = .004776;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - QGTQ": 
                rate =  .03683;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  .1231;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  .1758;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .004776;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Costa Rica - ₡CRC": 
                rate =  2.443;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  .009551;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  .006674;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Colombia - $COP": 
                rate = 20.66;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }
        
    public static void $PYGConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Paraguay - ₲PYG": JOptionPane.showMessageDialog(null, "You already have that currency");
           
                case "United States - $USD": 
            
                rate = .0001249;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Brazil - R$BRL": 
            
                rate = .000737;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = .1345;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = .0008607;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = .1235;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = .0001249;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = .02616;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
                case "Peru - S/.PEN": 
                rate =  .0004657;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  .004578;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  .005367;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = .0001249;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - QGTQ": 
                rate =  .0009635;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  .003222;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  .004599;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .0001249;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Costa Rica - ₡CRC": 
                rate =  .06392;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  .0002499;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  .0001744;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₲" + finalValue1 + " PYG              \n"
                               + "Conversion Rate: ₲1 PYG  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Colombia - $COP": 
                rate = .5414;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: GY$" + finalValue1 + " GYD              \n"
                               + "Conversion Rate: GY$1 GYD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }
    
    public static void $PENConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Peru - S/.PEN": JOptionPane.showMessageDialog(null, "You already have that currency");
           
                case "United States - $USD": 
            
                rate = .2680;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Brazil - R$BRL": 
            
                rate = 1.586;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 288.6;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 1.846;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 264.7;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = .2680;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = 56.12;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 2145;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  9.821;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  11.52;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = .2680;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - QGTQ": 
                rate =  2.067;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  6.910;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  9.866;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .2680;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Costa Rica - ₡CRC": 
                rate =  136.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  .536;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  .3745;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Colombia - $COP": 
                rate = 1161;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: S/." + finalValue1 + " PEN             \n"
                               + "Conversion Rate: S/.1 PEN  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }

    public static void $SRDConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Suriname - $SRD": JOptionPane.showMessageDialog(null, "You already have that currency");
           
           
                case "Brazil - R$BRL": 
            
                rate = .1558;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 29.73;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = .187;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 25.62;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 116.5;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = .02715;
                EndAmount = finalValue1 * rate; 

                receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = 5.683;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 217.3;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  .1004;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "United States - $USD": 
            
                rate = .02715;
                EndAmount = finalValue1 * rate; 

                receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  1.138;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = .02715;
                EndAmount = finalValue1 * rate; 

                receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - QGTQ": 
                rate =  .2091;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  .702;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .02715;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  13.65;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  .0543;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  .03751;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " SRD              \n"
                               + "Conversion Rate: $1 SRD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }
    public static void $NIOConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Nicaragua - C$NIO": JOptionPane.showMessageDialog(null, "You already have that currency");
                
                case "United States - $USD": 
            
                rate = .02714;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Brazil - R$BRL": 
            
                rate = .1557;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 29.93;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = .1870;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 25.61;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = .02714;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = 5.682;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 217.3;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  .9998;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  1.139;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = .02714;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - QGTQ": 
                rate =  .2090;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  .7019;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .02714;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Costa Rica - ₡CRC": 
                rate =  13.67;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  .05429;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  .03749;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Colombia - $COP": 
                rate = 116.6;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$NIO" + finalValue1 + " NIO             \n"
                               + "Conversion Rate: C$1 NIO =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
}
public static void $PABConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Panama - B/.PAB": JOptionPane.showMessageDialog(null, "You already have that currency");
                
                case "United States - $USD": 
            
                rate = 1;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/. 1 PAB  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Brazil - R$BRL": 
            
                rate = 5.729;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 1103;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 6.91;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 943.0;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD": 
                           
                rate = 1;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guyana - GY$GYD": 
                rate = 209.4;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 8005;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  36.81;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  42.47;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $USD": 
                
                rate = 1;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  $" + rate + " USD         \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Guatemala - QGTQ": 
                rate =  7.703;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  25.91;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  36.88;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB              \n"
                               + "Conversion Rate: B/.1 PAB =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  503.2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Belize - BZ$BZD": 
                rate =  2;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  BZ$" + rate + " BZD          \n"
                               + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Canada - C$CAD": 
                rate =  1.38;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "Colombia - $COP": 
                rate = 4294;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: B/." + finalValue1 + " PAB             \n"
                               + "Conversion Rate: B/.1 PAB =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
}
public static void $CRCConverter()
{
    
    CALCULATIONSDialog();

    String[] EndGoal = 
    {
            "United States - $USD",
            "Brazil - R$BRL",
            "Argentina - $ARS",
            "Bolivia - BsBOB",
            "Chile - $CLP",
            "Colombia - $COP",
            "Ecuador - $USD",
            "Guyana - GY$GYD",
            "Paraguay - ₲PYG",
            "Peru - S/.PEN",
            "Suriname - $SRD",
            "Uruguay - $UUYU",
            "El Salvador - $USD",
            "Guatemala - QGTQ",
            "Honduras - LHNL",
            "Nicaragua - C$NIO",
            "Panama - B/.PAB",
            "Costa Rica - ₡CRC",
            "Belize - BZ$BZD",
            "Canada - C$CAD"
    };

    String choice = (String) JOptionPane.showInputDialog
    (
        null, 
        "Choose the target currency", 
        "Currency converter", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        EndGoal, 
        EndGoal[0]
    ); 

    switch (choice) 
    {

            case "Costa Rica - ₡CRC": JOptionPane.showMessageDialog(null, "You already have that currency");

            case "United States - $USD": 
            
                rate = .001987;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: ₡CRC" + finalValue1 + " CRC              \n"
                               + "Conversion Rate: ₡1 CRC  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
       
       
            case "Brazil - R$BRL": 
        
            rate = .01131;
            EndAmount = finalValue1 * rate; 

             receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡CRC" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  R$" + rate + " BRL          \n"
                           + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Argentina - $ARS": 
            rate = 2.304;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡CRC" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  $" + rate + " ARS          \n"
                           + "Converted Amount:  $" + EndAmount + " ARS             \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Bolivia - BsBOB": 
            rate = .01369;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡CRC" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  Bs" + rate + " BOB          \n"
                           + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Chile - $CLP": 
            rate = 1.867;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡CRC" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  $" + rate + " CLP          \n"
                           + "Converted Amount:  $" + EndAmount + " CLP              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Colombia - $COP": 
            rate = 8.533;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC =  $" + rate + " COP          \n"
                           + "Converted Amount:  $" + EndAmount + " COP              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Ecuador - $USD":
                rate = .001987;
               EndAmount = finalValue1 * rate;


                       receipt = "=======================================================\n"
                              + "                  Successful Transaction               \n"
                              + "=======================================================\n"
                              + ""
                              + "Starting Amount: ₡" + finalValue1 + " CRC             \n"
                              + "Conversion Rate: ₡1 CRC  =  $" + rate + " USD         \n"
                              + "Converted Amount:  $" + EndAmount + " USD              \n"
                              + ""
                              + "=======================================================\n"
                              + "               Thanks for using our converter          \n"
                              + "=======================================================\n";
             
                             
               JOptionPane.showMessageDialog(null, receipt );

               break;


            case "Guyana - GY$GYD": 
            rate = .001987;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  GY$" + rate + " GYD          \n"
                           + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Paraguay - ₲PYG": 
            rate = 15.90;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  ₲" + rate + " PYG          \n"
                           + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Peru - S/.PEN": 
            rate =  .007339;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  S/." + rate + " PEN          \n"
                           + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Suriname - $SRD": 
            rate =  .07306;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  $" + rate + " SRD         \n"
                           + "Converted Amount:  $" + EndAmount + " SRD              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Uruguay - $UUYU": 
            rate = .08422;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  $U" + rate + " UYU          \n"
                           + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "El Salvador - $USD":
               rate = .001987;
               EndAmount = finalValue1 * rate;


                       receipt = "=======================================================\n"
                              + "                  Successful Transaction               \n"
                              + "=======================================================\n"
                              + ""
                              + "Starting Amount: ₡" + finalValue1 + " CRC             \n"
                              + "Conversion Rate: ₡1 CRC  =  $" + rate + " USD         \n"
                              + "Converted Amount:  $" + EndAmount + " USD              \n"
                              + ""
                              + "=======================================================\n"
                              + "               Thanks for using our converter          \n"
                              + "=======================================================\n";
             
                             
               JOptionPane.showMessageDialog(null, receipt );

               break;

            case "Guatemala - QGTQ": 
            rate =  .001987;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  Q" + rate + " GTQ          \n"
                           + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Honduras - LHNL": 
            rate =  .05146;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  L" + rate + " HNL          \n"
                           + "Converted Amount:  L" + EndAmount + " HNL              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Nicaragua - C$NIO": 
            rate =  .07319;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  C$" + rate + " NIO          \n"
                           + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt );

            break;

            case "Panama - B/.PAB": 
            rate =  .001987;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  B/." + rate + " PAB          \n"
                           + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

            break;


            case "Belize - BZ$BZD": 
            rate =  .003975;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  BZ$" + rate + " BZD          \n"
                           + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt);

            break;

            case "Canada - C$CAD": 
            rate =  .002757;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: ₡" + finalValue1 + " CRC              \n"
                           + "Conversion Rate: ₡1 CRC  =  C$" + rate + " CAD          \n"
                           + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt);

            break;

       default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
    }
}

public static void $BZConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Belize - BZ$BZD": JOptionPane.showMessageDialog(null, "You already have that currency");

                case "United States - $USD": 
                
                rate = .5000;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
           
                case "Brazil - R$BRL": 
            
                rate = 2.854;
                EndAmount = finalValue1 * rate; 

                 receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD             \n"
                               + "Conversion Rate: BZ$1 BZD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 581.3;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 3.455;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 471.1;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 2153;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD":
                rate = .5000;
               EndAmount = finalValue1 * rate;


                       receipt = "=======================================================\n"
                              + "                  Successful Transaction               \n"
                              + "=======================================================\n"
                              + ""
                              + "Starting Amount: BZ$" + finalValue1 + " BZD             \n"
                              + "Conversion Rate: BZ$1 BZD  =  $" + rate + " USD         \n"
                              + "Converted Amount:  $" + EndAmount + " USD              \n"
                              + ""
                              + "=======================================================\n"
                              + "               Thanks for using our converter          \n"
                              + "=======================================================\n";
             
                             
               JOptionPane.showMessageDialog(null, receipt );


               break;

                case "Guyana - GY$GYD": 
                rate = 104.7;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 4001;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  1.846;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  18.38;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  21.19;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;


                case "Guatemala - QGTQ": 
                rate =  3.851;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  12.94;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  18.43;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .5000;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  251.6;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "El Salvador - $USD": 
                
                rate = .5000;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Canada - C$CAD": 
                rate =  .6934;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: BZ$" + finalValue1 + " BZD              \n"
                               + "Conversion Rate: BZ$1 BZD  =  C$" + rate + " CAD          \n"
                               + "Converted Amount:  C$" + EndAmount + " CAD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }
    public static void $CADConverter()
    {
        
        CALCULATIONSDialog();

        String[] EndGoal = 
        {
                "United States - $USD",
                "Brazil - R$BRL",
                "Argentina - $ARS",
                "Bolivia - BsBOB",
                "Chile - $CLP",
                "Colombia - $COP",
                "Ecuador - $USD",
                "Guyana - GY$GYD",
                "Paraguay - ₲PYG",
                "Peru - S/.PEN",
                "Suriname - $SRD",
                "Uruguay - $UUYU",
                "El Salvador - $USD",
                "Guatemala - QGTQ",
                "Honduras - LHNL",
                "Nicaragua - C$NIO",
                "Panama - B/.PAB",
                "Costa Rica - ₡CRC",
                "Belize - BZ$BZD",
                "Canada - C$CAD"
        };

        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            EndGoal, 
            EndGoal[0]
        ); 

        switch (choice) 
        {

                case "Canada - C$CAD": JOptionPane.showMessageDialog(null, "You already have that currency");

                case "United States - $USD": 
                
                rate = .7204;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
           
                case "Brazil - R$BRL": 
            
                rate = 4.088;
                EndAmount = finalValue1 * rate; 

                 receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD             \n"
                               + "Conversion Rate: C$1 CAD  =  R$" + rate + " BRL          \n"
                               + "Converted Amount:  R$" + EndAmount + " BRL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Argentina - $ARS": 
                rate = 837.9;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $" + rate + " ARS          \n"
                               + "Converted Amount:  $" + EndAmount + " ARS             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Bolivia - BsBOB": 
                rate = 4.962;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  Bs" + rate + " BOB          \n"
                               + "Converted Amount:  Bs" + EndAmount + " BOB             \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Chile - $CLP": 
                rate = 674.4;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $" + rate + " CLP          \n"
                               + "Converted Amount:  $" + EndAmount + " CLP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Colombia - $COP": 
                rate = 3073;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $" + rate + " COP          \n"
                               + "Converted Amount:  $" + EndAmount + " COP              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Ecuador - $USD":
                rate = .7203;
               EndAmount = finalValue1 * rate;


                       receipt = "=======================================================\n"
                              + "                  Successful Transaction               \n"
                              + "=======================================================\n"
                              + ""
                              + "Starting Amount: C$" + finalValue1 + " CAD             \n"
                              + "Conversion Rate: C$1 CAD  =  $" + rate + " USD         \n"
                              + "Converted Amount:  $" + EndAmount + " USD              \n"
                              + ""
                              + "=======================================================\n"
                              + "               Thanks for using our converter          \n"
                              + "=======================================================\n";
             
                             
               JOptionPane.showMessageDialog(null, receipt );


               break;

                case "Guyana - GY$GYD": 
                rate = 150.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  GY$" + rate + " GYD          \n"
                               + "Converted Amount:  GY$" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - ₲PYG": 
                rate = 5764;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  ₲" + rate + " PYG          \n"
                               + "Converted Amount:  ₲" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - S/.PEN": 
                rate =  2.644;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  S/." + rate + " PEN          \n"
                               + "Converted Amount:  S/." + EndAmount + " PEN              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Suriname - $SRD": 
                rate =  26.52;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $" + rate + " SRD         \n"
                               + "Converted Amount:  $" + EndAmount + " SRD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Uruguay - $UUYU": 
                rate =  30.17;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $U" + rate + " UYU          \n"
                               + "Converted Amount:  $U" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;


                case "Guatemala - QGTQ": 
                rate =  5.549;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  Q" + rate + " GTQ          \n"
                               + "Converted Amount:  Q" + EndAmount + " GTQ              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Honduras - LHNL": 
                rate =  18.62;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  L" + rate + " HNL          \n"
                               + "Converted Amount:  L" + EndAmount + " HNL              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Nicaragua - C$NIO": 
                rate =  26.54;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  C$" + rate + " NIO          \n"
                               + "Converted Amount:  C$" + EndAmount + " NIO              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Panama - B/.PAB": 
                rate =  .7205;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  B/." + rate + " PAB          \n"
                               + "Converted Amount:  B/." + EndAmount + " PAB              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt + "This country also uses your current currency" );

                break;

                case "Costa Rica - ₡CRC": 
                rate =  363.8;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  ₡" + rate + " CRC          \n"
                               + "Converted Amount:  ₡" + EndAmount + " CRC              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt);

                break;

                case "El Salvador - $USD": 
                
                rate = .7205;
                EndAmount = finalValue1 * rate; 

                        receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                               + "Conversion Rate: C$1 CAD  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Belize - BZ$BZD": 
            rate =  1.441;
            EndAmount = finalValue1 * rate; 

                   receipt = "=======================================================\n"
                           + "                  Successful Transaction               \n"
                           + "=======================================================\n"
                           + ""
                           + "Starting Amount: C$" + finalValue1 + " CAD              \n"
                           + "Conversion Rate: C$1 CAD  =  BZ$" + rate + " BZD          \n"
                           + "Converted Amount:  BZ$" + EndAmount + " BZD              \n"
                           + ""
                           + "=======================================================\n"
                           + "               Thanks for using our converter          \n"
                           + "=======================================================\n";
           
                           
            JOptionPane.showMessageDialog(null, receipt);

            break;

           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }
      
    }










    public static void CALCULATIONSDialog() 
    {

        JDialog dialog = new JDialog();
        dialog.setTitle("Amount");
        dialog.setModal(true);
        dialog.setSize(300, 150);
        dialog.setLayout(new FlowLayout());



        JTextField numberField = new JTextField("0", 5);
        numberField.setHorizontalAlignment(JTextField.CENTER);



        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");



        plusButton.addActionListener(e -> 
        {
            int num = Integer.parseInt(numberField.getText());
            numberField.setText(String.valueOf(num + 1));
        });



        minusButton.addActionListener(e -> 
        {
            int num = Integer.parseInt(numberField.getText());
            numberField.setText(String.valueOf(num - 1));
        });



        JButton okButton = new JButton("OK");


        okButton.addActionListener(e -> 
        {
        String input = numberField.getText();
        int response = JOptionPane.showConfirmDialog(dialog, "Confirm Amount:  $" + input, " Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) 
        {
                try 
                {
                finalValue1 = Double.parseDouble(input);
                
                if (finalValue1 <= 0) 
                {
                        JOptionPane.showMessageDialog(dialog, "Negative numbers are not allowed!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                }

                JOptionPane.showMessageDialog(null, "Final Stored Value  $" + finalValue1);
                dialog.dispose();
                } 
                catch (NumberFormatException ex) 
                {
                JOptionPane.showMessageDialog(dialog, "Invalid number format!", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        });

        dialog.add(minusButton);
        dialog.add(numberField);
        dialog.add(plusButton);
        dialog.add(okButton);

        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    






}

