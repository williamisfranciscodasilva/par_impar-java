import javax.swing.JOptionPane;
class par_impar
{
    public static void main(String args[])
    {
     int num1;

     num1 = Integer.parseInt(
     JOptionPane.showInputDialog("Digite um n�mero"));

     if(num1 % 2==0)
     {
         JOptionPane.showMessageDialog(null,"O n�mero � par");
         System.out.println("O n�mero � par");
     }
     else
     {
          JOptionPane.showMessageDialog(null,"O n�mero � impar");
          System.out.println("O n�mero � impar");
     }
    }
}