package numbercheck;

import java.util.Scanner;

public class Menu
{
    public void Menu()
    {
	int option;
        Scanner sc = new Scanner(System.in);	

        System.out.println("---------Menu---------");
        System.out.println("1. Check Odd or Even");
        System.out.println("2. Check Prime");
        System.out.println("3. Exit");
        System.out.print("\nChoose the option: ");
                
        option = sc.nextInt();
	
	// Switch Case
        
        switch(option)
        {
            case 1: CheckOddOrEven();
                    break;
            case 2: CheckPrimeNumber();
                    break;
            case 3: Exit();
                    break;
            default: System.out.println("Incorrect menu option");
                     Menu();
                    break;
       }
    	   
    }

    // Methods definition
    public void CheckOddOrEven() 
    {
	OddOrEven obj = new OddOrEven();
        obj.CheckOddOrEven();
    }
    public void CheckPrimeNumber() 
    {
        CheckPrime obj = new CheckPrime();
        obj.CheckPrime();
    }

    public void Exit() 
    {
        System.exit(0);
    } 
    public static void main(String[] args)
    {
      Menu obj = new Menu();
        obj.Menu();
}
   }