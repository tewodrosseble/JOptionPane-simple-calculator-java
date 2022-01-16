import javax.swing.JOptionPane;
public class Addition{
    public static void main(String... args){
        String first = JOptionPane.showInputDialog("Enter the first no: ");
        String second = JOptionPane.showInputDialog("Enter the second no: ");
        String oper = JOptionPane.showInputDialog("Enter the operation: ");

        int firstno = Integer.parseInt(first);
        int secondno = Integer.parseInt(second);
            int result = 0;
        switch (oper){
            case "+":
                result = firstno + secondno;
                break;
            case "-":
                 result= secondno-firstno;
                break;
            case "*":
                result= secondno*firstno;
                break;
            case "/":
                result= secondno/firstno;
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "The result is :"+result);

    }

}