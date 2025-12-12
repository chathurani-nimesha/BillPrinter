import java.util.Scanner;

public class BillPrint{
	public static void main(String[] args){
	System.out.println("=================================================================================");	
	System.out.println("__          __  _                            _          _ __  __            _");
	System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |");
	System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_ ");
	System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| \'_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|"); 
	System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_");
	System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
	System.out.println("=================================================================================");	

	System.out.println("\n");
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Customer Phone Number - ");
	String Pnum = input.nextLine();
	System.out.print("Enter Customer Name         - ");
	String name = input.nextLine();
	System.out.println("\n");

	System.out.println("=================================================================================");	
	//Unit Prices

	double B = 250.00;
	double D = 180.00;
	double S = 150.00;
	double H = 1200.00;
	double Y = 50.00;
	double F = 120.00;
	double So = 160.00;

	//Getting Qty:

	System.out.println("\n");

	System.out.print("Basmathi Qty(kg) - ");
	int Basmathi = input.nextInt();

	System.out.print("Dhal Qty(kg)     - ");
	int Dhal = input.nextInt();

	System.out.print("Sugar Qty(kg)    - ");
	int Sugar = input.nextInt();

	System.out.print("Highland Qty(kg) - ");
	int Highland = input.nextInt();

	System.out.print("Yoghurt Qty(kg)  - ");
	int Yoghurt = input.nextInt();

	System.out.print("Floar Qty(kg)    - ");
	int Floar = input.nextInt();

	System.out.print("Soap Qty(kg)     - ");
	int Soap = input.nextInt();


		//Prices:
	
	double p1 = B*Basmathi;
	double p2 = D*Dhal;
	double p3 = S*Sugar;
	double p4 = H*Highland;
	double p5 = Y*Yoghurt;
	double p6 = F*Floar;
	double p7 = So*Soap;

	double total = p1+p2+p3+p4+p5+p6+p7;
	double discount = 0.1;
	
	double CalDiscount = discount*total;
	double Price = total - CalDiscount;

	System.out.println("+---------------------------------------------------------------+");
	System.out.println("|		     _	 __  __          ______ _______         |");
	System.out.println("|		    (_) |  \\/  |   /\\   |  __  \\__   __|        |");
	System.out.println("|		     _  | \\  / |  /  \\  | |__) |  | |           |");
	System.out.println("|		    | | | |\\/| | / /\\ \\ |  _  /   | |	        |");
	System.out.println("|		    | | | |  | |/ ____ \\| | \\ \\   | |           |");
	System.out.println("|		    |_| |_|  |_/_/    \\_\\_|  \\_\\  |_|           |");
	System.out.println("|                        225,Galle Road,Panadura.               |");
	System.out.println("|                                                               |");
	System.out.println("+---------------------------------------------------------------+");
	System.out.println("|                       # Tel   : 0703859855                    |");
	System.out.println("|                       # Name  : Kasun                         |");
	System.out.println("+-----------------+-------------+---------------+---------------+");
	System.out.println("|                 |    Qty      |   unit price  |     Price     |");
	System.out.println("+-----------------+-------------+---------------+---------------+");
	System.out.println("| # Basmathi      |     "+Basmathi+"      |       "+B+"   |       "+p1+"  |");
        System.out.println("|                 |             |               |               |");
	System.out.println("| # Dhal          |     "+Dhal+"       |       "+D+"   |       "+p2+"   |");
        System.out.println("|                 |             |               |               |");
	System.out.println("| # Sugar         |     "+Sugar+"       |       "+S+"   |       "+p3+"   |");
        System.out.println("|                 |             |               |               |");
	System.out.println("| # Highland      |     "+Highland+"       |       "+H+"  |      "+p4+"   |");
        System.out.println("|                 |             |               |               |");
	System.out.println("| # Yoghurt       |     "+Yoghurt+"       |       "+Y+"    |       "+p5+"   |");
        System.out.println("|                 |             |               |               |");
	System.out.println("| # flour         |     "+Floar+"       |       "+F+"   |       "+p6+"   |");
        System.out.println("|                 |             |               |               |");
	System.out.println("| # Soap          |     "+Soap+"       |       "+So+"   |       "+p7+"   |");
        System.out.println("|                 |             |               |               |");
	System.out.println("+-----------------+-------------+---------------+---------------+");
	System.out.println("|                               |  Total        |       "+total+"  |"); 
	System.out.println("|                               +---------------+---------------+");
	System.out.println("|                               |  discount(10%)|       "+CalDiscount+"   |");
	System.out.println("|                               +---------------+---------------+");
	System.out.println("|                               |  Price        |       "+Price+"  |");
	System.out.println("+-------------------------------+---------------+---------------+");


	//BillPrint Part 2.

	System.out.println("\n");
	System.out.print("Enter the Cash Who given by customer: ");
	double cash = input.nextDouble();
	int Change = (int)(cash - Price);

	System.out.println("\n");

	System.out.println("+-----------------+-------------------+");
	System.out.println("|    Net Amount   |    "+Price+"         |");
	System.out.println("+-----------------+-------------------+");
	System.out.println("|    Cash         |    "+cash+"        |");
	System.out.println("+-----------------+-------------------+");
	System.out.println("|    Change       |    "+Change+"           |");
	System.out.println("+-----------------+-------------------+");	

	System.out.println("\n");
	
	int N5000 = Change%5000;
	int N2000 = N5000%2000;
	int N1000 = N2000%1000;
	int N500 = N1000%500;
	int N100 = N500%100;
	int N50 = N100%50;
	int N20 = N50%20;
	int N10 = N20%10;
	int C5 = N10%5;
	int C2 = C5%2;
	
	int Tnotes = Change/5000+ N5000/2000+ N2000/1000+ N1000/500+ N500/100+N100/50+N50/20+N20/10;
	int Tcoins = N10/5+ C5/2+C2;

	System.out.println("+-----------------+-------------+");
	System.out.println("|      Values     |      No     |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|     Rs.5000     |     "+Change/5000+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.2000     |     "+N5000/2000+"       |"); 
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.1000     |     "+N2000/1000+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.500      |     "+N1000/500+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.100      |     "+N500/100+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.50       |     "+N100/50+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.20       |     "+N50/20+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.10       |     "+N20/10+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.5        |     "+N10/5+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.2        |     "+C5/2+"       |");
	System.out.println("|-----------------|-------------|");
	System.out.println("|     Rs.1        |     "+C2+"       |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   No of Notes   |     "+Tnotes+"       |");
	System.out.println("+-----------------+-------------+");
	System.out.println("|   No of Coins   |     "+Tcoins+"       |");
	System.out.println("+-----------------+-------------+");

	System.out.println("\n");
	System.out.println("----------------------------------------------");
	System.out.println("        THANK YOU FOR SHOPPING WITH US");
	System.out.println("----------------------------------------------");
	}
}
















