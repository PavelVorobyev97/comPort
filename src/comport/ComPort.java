package comport;

import javax.swing.JOptionPane;
import jssc.SerialPortException;

public class ComPort {
    
    public static void main(String[] args) throws SerialPortException, InterruptedException {
        ComConnection cc = new ComConnection();
        String str = "";
        //while ("0".equals(str)) {            
            str = JOptionPane.showInputDialog("Enter Input:");
            cc.send(str);
        //}
        
    }
    
}
