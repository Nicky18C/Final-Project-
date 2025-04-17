import java.awt.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CurrencyConverterProject
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

                //case "Guyana - GY$GYD" -> $GYDConverter();
                //case "Paraguay - ₲PYG" -> $UYUConverter();
                //case "Peru - s/.PEN" -> $BsConverter();
               // case "Suriname - $SRD" -> $GTQConverter();
                ///case "$Uruguay - $UUYU" -> $HNLConverter();
               // case "El Salvador - $USD" -> $NIOConverter();
                //case "Guatemala - QGTQ" -> ฿Converter();
               //case "Honduras - LHNL" -> ₡Converter();
                //case "Nicaragua - C$NIO" -> $BZConverter();
                //case "Panama - B/.PAB" -> $BZConverter();
                //case "Costa Rica - ₡CRC" -> $BZConverter();
                //case "Belize - BZ$BZD" -> $BZConverter();
                //case "Canada - C$CAD" -> $BZConverter();
                



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

                case "United States - $USD": 
                
                rate = 0.000879;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " ARS              \n"
                               + "Conversion Rate: $1 ARS  =  $" + rate + " USD          \n"
                               + "Converted Amount:  $" + EndAmount + " USD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;
           
                case "Argentina - $ARS": 
                JOptionPane.showMessageDialog(null, "This is the currency you currently hold." );

                break;

                case "Bolivia - $BOB": 
                rate = 0.0061;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " ARS              \n"
                               + "Conversion Rate: $1 ARS  =  $" + rate + " BOB          \n"
                               + "Converted Amount:  $" + EndAmount + " BOB              \n"
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

