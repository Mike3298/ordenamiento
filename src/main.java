
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int datos[]= new int [10];
        for(int i=0 ; i<=9;i++)
        {
           datos[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero "+(i+1)));
        }   
        
      
        {
            System.out.println("Los valores sin ordenar son:");
            
            int aux;
            for (int i=0;i<=10;i++)
                
                
            {
                System.out.println(datos[i]);
                
            }
            for(int i=0;i<=10;i++)
            {
                for(int j=0;j==(10-i-2);j++)
                {
                    if(datos[j]>datos[j+1])
                    {
                        aux = datos[j];
                        datos[j]=datos[j+1];
                        datos[j+1]= aux;
                    }
                }
            }
            System.out.println("Asi quedan los datos ya ordenados");
              for (int i=0;i<=9;i++)
              {
    
             System.out.println(datos[i]);
    
              }

        }
        
    }
    
   
}
