import java.awt.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CurrencyConverterProject
{
    static double finalValue1;
    static double rate;
    static double EndAmount;

    public static final String[] InPocket = 
    {
        "United States - $USD",
        "Brazil - $BRL",
        "Argentina - $ARS",
        "Bolivia - $BOB",
        "Chile - $CLP",
        "Colombia - $COP",
        "Ecuador - $ECU",
        "Guyana - $GYD",
        "Paraguay - $PYG",
        "Peru - $PEN",
        "Suriname - $SRD",
        "Uruguay - $UYU",
        "El Salvador - $SVC",
        "Guatemala - $GTQ",
        "Honduras - $HNL",
        "Nicaragua - $NIO",
        "Panama - $PAB",
        "Costa Rica - $CRC",
        "Belize - $BZD",
        "Canada - $CAD"
    };



    public static final String[] EndGoal = 
    {
        "United States - $USD",
        "Brazil - $BRL",
        "Argentina - $ARS",
        "Bolivia - $BOB",
        "Chile - $CLP",
        "Colombia - $COP",
        "Ecuador - $ECU",
        "Guyana - $GYD",
        "Paraguay - $PYG",
        "Peru - $PEN",
        "Suriname - $SRD",
        "Uruguay - $UYU",
        "El Salvador - $SVC",
        "Guatemala - $GTQ",
        "Honduras - $HNL",
        "Nicaragua - $NIO",
        "Panama - $PAB",
        "Costa Rica - $CRC",
        "Belize - $BZD",
        "Canada - $CAD"
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
                case "United States - $USD" : $USDConverter();
                case "Brazil - $BRL" : $BRLConverter();
                case "Argentina - $ARS" : $ARSConverter();
                case "Bolivia - $BOB" : $BOBConverter();
                case "$Chile - $CLP" : $CLPConverter();
                case "Colombia - $COP" : $COPConverter();
                case "Ecuador - $ECU" : $ECUConverter();
                case "Guyana - $GYD" : $GYDConverter();
                case "Paraguay - $PYG" : $UYUConverter();
                case "Peru - $PEN" : $BsConverter();
                case "Suriname - $SRD" : $GTQConverter();
                case "$Uruguay - $UYU" : $HNLConverter();
                case "El Salvador - $SVC" : $NIOConverter();
                case "Guatemala - $GTQ" : ฿Converter();
                case "Honduras - $HNL" : ₡Converter();
                case "Nicaragua - $NIO" : $BZConverter();
                case "Panama - $PAB" : $BZConverter();
                case "Costa Rica - $CRC" : $BZConverter();
                case "Belize - $BZD" : $BZConverter();
                case "Canada - $CAD" : $BZConverter();
                



                case "$C" : $CConverter();
                
                default : JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
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
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
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
           
           
                case "Brazil - $BRL": 
            
                rate = 5.82081;
                EndAmount = finalValue1 * rate; 

                String receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " BRL          \n"
                               + "Converted Amount:  $" + EndAmount + " BRL              \n"
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

                case "Bolivia - $BOB": 
                rate = 6.925;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " BOB          \n"
                               + "Converted Amount:  $" + EndAmount + " BOB             \n"
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

                case "Ecuador - $ECU": 
                           
                JOptionPane.showMessageDialog  (null, "This country uses your current currency" );

                break;

                case "Guyana - $GYD": 
                rate = 210.18;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " GYD          \n"
                               + "Converted Amount:  $" + EndAmount + " GYD              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Paraguay - $PYG": 
                rate = 8054.0361;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " PYG          \n"
                               + "Converted Amount:  $" + EndAmount + " PYG              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "Peru - $PEN": 
                rate =  3.6785;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " PEN          \n"
                               + "Converted Amount:  $" + EndAmount + " PEN              \n"
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

                case "Uruguay - $UYU": 
                rate =  42.13;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " UYU          \n"
                               + "Converted Amount:  $" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                case "El Salvador - $SVC": 
                rate =  8.75;
                EndAmount = finalValue1 * rate; 

                       receipt = "=======================================================\n"
                               + "                  Successful Transaction               \n"
                               + "=======================================================\n"
                               + ""
                               + "Starting Amount: $" + finalValue1 + " USD              \n"
                               + "Conversion Rate: $1 USD  =  $" + rate + " UYU          \n"
                               + "Converted Amount:  $" + EndAmount + " UYU              \n"
                               + ""
                               + "=======================================================\n"
                               + "               Thanks for using our converter          \n"
                               + "=======================================================\n";
               
                               
                JOptionPane.showMessageDialog(null, receipt );

                break;

                










/* 
                
                case "Bolivia - $BOB" -> $BOBConverter();
                case "$Chile - $CLP" -> $CLPConverter();
                case "Colombia - $COP" -> $COPConverter();
                case "Ecuador - $ECU" -> $ECUConverter();
                case "Guyana - $GYD" -> $GYDConverter();
                case "Paraguay - $PYG" -> $UYUConverter();
                case "Peru - $PEN" -> $BsConverter();
                case "Suriname - $SRD" -> $GTQConverter();
                case "$Uruguay - $UYU" -> $HNLConverter();
                case "El Salvador - $SVC" -> $NIOConverter();
                case "Guatemala - $GTQ" -> ฿Converter();
                case "Honduras - $HNL" -> ₡Converter();
                case "Nicaragua - $NIO" -> $BZConverter();
                case "Panama - $PAB" -> $BZConverter();
                case "Costa Rica - $CRC" -> $BZConverter();
                case "Belize - $BZD" -> $BZConverter();
                case "Canada - $CAD" -> $BZConverter();
           */
           default: JOptionPane.showMessageDialog(null, "Error: Unknown currency selected.");
        }

























       
            
        
























       
            
        }

    public static void $BRLConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }
    
    public static void $ARSConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $BOBConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $CLPConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $COPConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $ECUConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $GYDConverter()
    {
        String[] options = 
        {
            "United States - $USD",
            "Brazil - $BRL",
            "Argentina - $ARS",
            "Bolivia - $BOB",
            "$Chile - $CLP",
            "$Colombia - $COP",
            "Ecuador - $ECU",
            "Guyana - $GYD",
            "$Paraguay - $PYG",
            "$Peru - $PEN",
            "Suriname - $SRD",
            "$Uruguay - $UYU",
            "$El Salvador - $SVC",
            "Guatemala - $GTQ",
            "Honduras - $HNL",
            "Nicaragua - $NIO",
            "Panama - $PAB",
            "Costa Rica - $CRC",
            "Belize - $BZD",
            "Canada - $CAD"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $UYUConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $BsConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $GTQConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $HNLConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $NIOConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void ฿Converter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void ₡Converter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $BZConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }

    public static void $CConverter()
    {
        String[] options = 
        {
            "$USD",
            "$R",
            "$ARS",
            "$b",
            "$CLP",
            "$COP",
            "$S/.",
            "$SRD",
            "$UYU",
            "$Bs",
            "$GTQ",
            "$HNL",
            "$NIO",
            "฿",
            "₡",
            "$BZ",
            "$C"
        };


        String choice = (String) JOptionPane.showInputDialog
        (
            null, 
            "Choose the target currency", 
            "Currency converter", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]
        );
    }
   
    public static void CALCULATIONSDialog() 
    {

        JDialog dialog = new JDialog();
        dialog.setTitle("Ammount");
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
            int response = JOptionPane.showConfirmDialog(dialog, "Confirm Ammount: " + input, "Confirmation", JOptionPane.YES_NO_OPTION);
            

            if (response == JOptionPane.YES_OPTION) 
            {


                try 
                {
                    finalValue1 = Double.parseDouble(input);
                    JOptionPane.showMessageDialog(null, "Final Stored Value: " + finalValue1);
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
