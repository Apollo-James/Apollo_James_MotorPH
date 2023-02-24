
//Import Scanner from java.util
import java.util.Scanner;

public class CalculatedHours {
	
	public static void main(String[] args) {
		
            int EmpNumber;
            int hoursWorked;
            try ( //create Scanner object to read keyboard
                    Scanner keyboard = new Scanner(System.in)) {
                hoursWorked = 45; //hours worked in 5 days
                //Prompt the user to enter the hourly rate
                System.out.print("Please enter Employee Number:");
                EmpNumber = EmpNumber = keyboard.nextInt();
            }
			
		switch (EmpNumber)
		{
		case 10001 -> {
                    String EmpFname,EmpLname,Position;
                    double Hoursworked1= 45;
                    double hourlyRate1 = 373.04;                 //Hourly rate of each employee
                    double Salary = Hoursworked1*hourlyRate1;    //store regular pay for the week			
                    EmpFname="Jose";
                    EmpLname="Crisostomo";
                    Position="HR Manager";
                    //display result
                    System.out.println("Calculated Salary of Employee 10002");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked1);
                    System.out.println("weeklyPay:" + Salary);
                    //Determine if employee has completed the work hours using if statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10002 -> {
                    double Hoursworked2= 45;
                    double hourlyRate2 = 255.80;                   //Hourly rate
                    double Salary2 = Hoursworked2*hourlyRate2;    //store regular pay for the week			
                    String EmpFname = "Christian";
                    String EmpLname = "Mata";
                    String Position = "Account Team Leader";
                    //display result
                    System.out.println("Calculated Salary of Employee 10002");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked2);
                    System.out.println("weeklyPay:" + Salary2);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10003 -> {
                    double Hoursworked3= 41.95;
                    double hourlyRate3 = 255.80 ;    //Hourly rate
                    double Salary3= Hoursworked3*hourlyRate3;    //store regular pay for the week			
                    String EmpFname = "Brad ";
                    String EmpLname = "San Jose";
                    String Position = "HR Team Leader";
                    //display result
                    System.out.println("Calculated Salary of Employee 10003");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked3);
                    System.out.println("weeklyPay:" + Salary3);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10004 -> {
                    double Hoursworked4= 45;
                    double hourlyRate4 = 362.05;    //Hourly rate
                    double Salary4 = Hoursworked4*hourlyRate4;    //store regular pay for the week			
                    String EmpFname = "Anthony";
                    String EmpLname = "Salcedo";
                    String Position = "Payroll Manager";
                    //display result
                    System.out.println("Calculated Salary of Employee 10004");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked4);
                    System.out.println("weeklyPay:" + Salary4);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10005 -> {
                    double Hoursworked5= 44.75;
                    double hourlyRate5= 133.93;    //Hourly rate
                    double Salary5 = Hoursworked5*hourlyRate5;    //store regular pay for the week			
                    String EmpFname = "Alice";
                    String EmpLname = "Romualdez";
                    String Position = "HR Rank and File";
                    //display result
                    System.out.println("Calculated Salary of Employee 10005");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked5);
                    System.out.println("weeklyPay:" + Salary5);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10006 -> {
                    double Hoursworked6= 45;
                    double hourlyRate6= 133.93;    //Hourly rate
                    double Salary6 = Hoursworked6*hourlyRate6;    //store regular pay for the week			
                    String EmpFname = "Rosie";
                    String EmpLname = "Atienza";
                    String Position = "HR Rank and File";
                    //display result
                    System.out.println("Calculated Salary of Employee 10006");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked6);
                    System.out.println("weeklyPay:" + Salary6);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10007 -> {
                    double Hoursworked7= 45;
                    double hourlyRate7= 142.86;    //Hourly rate
                    double Salary7 = Hoursworked7*hourlyRate7;    //store regular pay for the week			
                    String EmpFname = "Martha";
                    String EmpLname = "Farala";
                    String Position = "HR Rank and File";
                    //display result
                    System.out.println("Calculated Salary of Employee 10007");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked7);
                    System.out.println("weeklyPay:" + Salary7);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
		
		case 10008 -> {
                    double Hoursworked8= 44.833;
                    double hourlyRate8= 142.86;    //Hourly rate
                    double Salary8 = Hoursworked8*hourlyRate8;    //store regular pay for the week			
                    String EmpFname = "Leila";
                    String EmpLname = "Martinez";
                    String Position = "Payroll Rank and File";
                    //display result
                    System.out.println("Calculated Salary of Employee 10008");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked8);
                    System.out.println("weeklyPay:" + Salary8);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10009 -> {
                    double Hoursworked9= 45;
                    double hourlyRate9= 133.93;    //Hourly rate
                    double Salary9 = Hoursworked9*hourlyRate9;    //store regular pay for the week			
                    String EmpFname = "Allison";
                    String EmpLname = "San Jose";
                    String Position = "Account Rank and File";
                    //display result
                    System.out.println("Calculated Salary of Employee 10009");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked9);
                    System.out.println("weeklyPay:" + Salary9);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
			
		case 10010 -> {
                    double Hoursworked10= 45;
                    double hourlyRate10= 133.93;    //Hourly rate
                    double Salary10 = Hoursworked10*hourlyRate10;    //store regular pay for the week			
                    String EmpFname = "Cydney";
                    String EmpLname = "Rosario";
                    String Position = "Account Rank and File";
                    //display result
                    System.out.println("Calculated Salary of Employee 10009");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked10);
                    System.out.println("weeklyPay:" + Salary10);
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }
                }
                case 10011 -> {
                    double Hoursworked11= 42.5;
                    double hourlyRate11= 229.02;                   //Hourly rate
                    double Salary11= Hoursworked11*hourlyRate11;    //store regular pay for the week
                    
                    String EmpFname = "Josie";
                    String EmpLname="Lopez";
                    String Position="Payroll Team Leader";
                    
                    //display result
                    System.out.println("Calculated Salary of Employee 10002");
                    System.out.println("First Name:" + EmpFname);
                    System.out.println("Last Name:" + EmpLname);
                    System.out.println("Position:" + Position);
                    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked11);
                    System.out.println("weeklyPay:" + Salary11);
                    
                    //Determine if employee has completed/not the work hours using if-else statement
                    if (hoursWorked>=45)
                    {
                        System.out.println("Employee has completed the work hours");
                    }
                    else
                    {
                        System.out.println("Employee did not completed the work hours");
                    }       }
        
    case 10012 -> {
        double Hoursworked12= 45;
        double hourlyRate12= 249.11;                   //Hourly rate
        double Salary12= Hoursworked12*hourlyRate12;    //store regular pay for the week            
        
        String EmpFname="Selena";
        String EmpLname="De Leon";
        String Position="Account Team Leader";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked12);
        System.out.println("weeklyPay:" + Salary12);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
        
    case 10013 -> {
        double Hoursworked13= 43;
        double hourlyRate13= 377.98;                   //Hourly rate
        double Salary13= Hoursworked13*hourlyRate13;    //store regular pay for the week            
        
        String EmpFname="Fredrick";
        String EmpLname="Romualdez";
        String Position="Account Manager";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked13);
        System.out.println("weeklyPay:" + Salary13);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
case 10014 ->   {
    double Hoursworked14= 43;
    double hourlyRate14= 138.39;                   //Hourly rate
    double Salary14= Hoursworked14*hourlyRate14;    //store regular pay for the week
    
    String EmpFname="Mark";
    String EmpLname="Bautista";
    String Position="Account Rank and File";
    
    //display result
    System.out.println("Calculated Salary of Employee 10002");
    System.out.println("First Name:" + EmpFname);
    System.out.println("Last Name:" + EmpLname);
    System.out.println("Position:" + Position);
    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked14);
    System.out.println("weeklyPay:" + Salary14);
    
    //Determine if employee has completed/not the work hours using if-else statement
    if (hoursWorked>=45)
    {
        System.out.println("Employee has completed the work hours");
    }
    else
    {
        System.out.println("Employee did not completed the work hours");
    }       }
        
    case 10015 -> {
        double Hoursworked15= 43;
        double hourlyRate15= 138.39;                   //Hourly rate
        double Salary15= Hoursworked15*hourlyRate15;    //store regular pay for the week            
        
        String EmpFname="Darlene";
        String EmpLname="Lazaro";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked15);
        System.out.println("weeklyPay:" + Salary15);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
        
    case 10016 -> {
        double Hoursworked16= 43;
        double hourlyRate16= 142.86;                   //Hourly rate
        double Salary16= Hoursworked16*hourlyRate16;    //store regular pay for the week            
        String EmpFname="Kolby";
        String EmpLname="Delos Santos";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked16);
        System.out.println("weeklyPay:" + Salary16);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
case 10017 ->   {
    double Hoursworked17= 42.917;
    double hourlyRate17= 133.93;                   //Hourly rate
    double Salary17= Hoursworked17*hourlyRate17;    //store regular pay for the week
    
    String EmpFname="Vella";
    String EmpLname="Santos";
    String Position="Account Rank and File";
    
    //display result
    System.out.println("Calculated Salary of Employee 10002");
    System.out.println("First Name:" + EmpFname);
    System.out.println("Last Name:" + EmpLname);
    System.out.println("Position:" + Position);
    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked17);
    System.out.println("weeklyPay:" + Salary17);
    
    //Determine if employee has completed/not the work hours using if-else statement
    if (hoursWorked>=45)
    {
        System.out.println("Employee has completed the work hours");
    }
    else
    {
        System.out.println("Employee did not completed the work hours");
    }       }
        
    case 10018 -> {
        double Hoursworked18= 36;
        double hourlyRate18= 133.93;                   //Hourly rate
        double Salary18= Hoursworked18*hourlyRate18;    //store regular pay for the week            
        
        String EmpFname="Tomas";
        String EmpLname="Del Rosario";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked18);
        System.out.println("weeklyPay:" + Salary18);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
        
    case 10019 -> {
        double Hoursworked19= 43;
        double hourlyRate19= 142.86;                   //Hourly rate
        double Salary19= Hoursworked19*hourlyRate19;    //store regular pay for the week            
        
        String EmpFname="Jacklyn";
        String EmpLname="Tolentino";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked19);
        System.out.println("weeklyPay:" + Salary19);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
case 10020 ->   {
    double Hoursworked20= 43;
    double hourlyRate20= 147.32;                   //Hourly rate
    double Salary20= Hoursworked20*hourlyRate20;    //store regular pay for the week
    
    String EmpFname="Percival";
    String EmpLname="Gutierrez";
    String Position="Account Rank and File";
    
    //display result
    System.out.println("Calculated Salary of Employee 10002");
    System.out.println("First Name:" + EmpFname);
    System.out.println("Last Name:" + EmpLname);
    System.out.println("Position:" + Position);
    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked20);
    System.out.println("weeklyPay:" + Salary20);
    
    //Determine if employee has completed/not the work hours using if-else statement
    if (hoursWorked>=45)
    {
        System.out.println("Employee has completed the work hours");
    }
    else
    {
        System.out.println("Employee did not completed the work hours");
    }       }
        
    case 10021 -> {
        double Hoursworked21= 38;
        double hourlyRate21= 147.32;                   //Hourly rate
        double Salary21= Hoursworked21*hourlyRate21;    //store regular pay for the week            
        
        String EmpFname="Garfield";
        String EmpLname="Manalaysay";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked21);
        System.out.println("weeklyPay:" + Salary21);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
        
    case 10022 -> {
        double Hoursworked22= 43;
        double hourlyRate22= 142.86;                   //Hourly rate
        double Salary22= Hoursworked22*hourlyRate22;    //store regular pay for the week            
        
        String EmpFname="Lizeth";
        String EmpLname="Villegas";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked22);
        System.out.println("weeklyPay:" + Salary22);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
case 10023 ->   {
    double Hoursworked23= 42;
    double hourlyRate23= 133.93;                   //Hourly rate
    double Salary23= Hoursworked23*hourlyRate23;    //store regular pay for the week
    
    String EmpFname="Carol";
    String EmpLname="Ramos";
    String Position="Account Rank and File";
    
    //display result
    System.out.println("Calculated Salary of Employee 10002");
    System.out.println("First Name:" + EmpFname);
    System.out.println("Last Name:" + EmpLname);
    System.out.println("Position:" + Position);
    System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked23);
    System.out.println("weeklyPay:" + Salary23);
    
    //Determine if employee has completed/not the work hours using if-else statement
    if (hoursWorked>=45)
    {
        System.out.println("Employee has completed the work hours");
    }
    else
    {
        System.out.println("Employee did not completed the work hours");
    }       }
        
    case 10024 -> {
        double Hoursworked24= 43;
        double hourlyRate24= 133.93;                   //Hourly rate
        double Salary24= Hoursworked24*hourlyRate24;    //store regular pay for the week            
        
        String EmpFname="Emelia";
        String EmpLname="Maceda";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked24);
        System.out.println("weeklyPay:" + Salary24);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }       }
        
    case 10025 -> {
        double Hoursworked25= 43;
        double hourlyRate25= 133.93;                   //Hourly rate
        double Salary25= Hoursworked25*hourlyRate25;    //store regular pay for the week            
        
        String EmpFname="Delia";
        String EmpLname="Aguilar";
        String Position="Account Rank and File";
        
        //display result
        System.out.println("Calculated Salary of Employee 10002");
        System.out.println("First Name:" + EmpFname);
        System.out.println("Last Name:" + EmpLname);
        System.out.println("Position:" + Position);
        System.out.println("hoursWorked from 10/24/22 to 10/28/22:" + Hoursworked25);
        System.out.println("weeklyPay:" + Salary25);
        
        //Determine if employee has completed/not the work hours using if-else statement
        if (hoursWorked>=45)
        {
            System.out.println("Employee has completed the work hours");
        }
        else
        {
            System.out.println("Employee did not completed the work hours");
        }
        break;
    }

        
    
        }
}

	}



