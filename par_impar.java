import javax.swing.JOptionPane;
class par_impar
{
    public static void main(String args[])
    {
     int num1;

     num1 = Integer.parseInt(
     JOptionPane.showInputDialog("Digite um número"));

     if(num1 % 2==0)
     {
         JOptionPane.showMessageDialog(null,"O número é par");
         System.out.println("O número é par");
     }
     else
     {
          JOptionPane.showMessageDialog(null,"O número é impar");
          System.out.println("O número é impar");
     }
    }
}