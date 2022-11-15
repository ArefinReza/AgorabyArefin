import java.nio.channels.ScatteringByteChannel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Agora {
    private String A;

    Agora() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd:MM:uuuu hh:mm:ss");
        String timeFormate = time.format(formater);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t D/Time :- " + timeFormate);

    }

    Agora(String A) {
        this.A = A;
        System.out.println(A);
    }
    void login(int x){
        String user = "Arefin";
        int password =1234;

        Display dis = new Display();
        Input in = new Input();

        Scanner u = new Scanner(System.in);
        System.out.print("  Enter User Name : ");
        String use = u.next();
        Scanner p = new Scanner(System.in);
        System.out.print("  Enter Password : ");
        int pass = p.nextInt();

        if(x==1){
            if(user==use || pass==password){
                dis.display();
                in.Object();
    
            }
        }
        if(x==2){
            if(user==use || pass==password){
                OnlineShopping on = new OnlineShopping();
                on.ShopingMain();
    
            }
        }
        
        else{
            System.out.println(" Run Again ! ");
            System.out.println(" User Name : "+user+" Password : "+password);
            login(x);
        }
    }
    void choice(){
        System.out.println(" 1. Admin \n 2. Online Shopping ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Log In As : ");
        int cho = sc.nextInt();
        switch (cho) {
            case 1:
                login(cho);
                break;
            case 2:
                login(cho);
                break;
        
            default:
                break;
        }

    }
    public static void main(String[] args) {

        Agora ag = new Agora();
        Agora ago = new Agora("\t\t\t\t\t\t\t\t Agora is Your Best Choice");
        
        System.out.println(" 1. Admin \n 2. Online Shopping ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Log In As : ");
        int cho = sc.nextInt();
        switch (cho) {
            case 1:
                ag.login(cho);
                break;
            case 2:
                ag.login(cho);
                break;
        
            default:
                break;
        }
        
        System.out.println("Agora is Going ON");
        System.out.println("By Arefin Reza (64)");
    }
}

// -----------Display
class Display {
    void display() {
        System.out.println("\t\t\t\t\t\t Admin Interface");
        System.out.println("1. Product List ");
        System.out.println("2. Customer List ");
        System.out.println("3. Staff List ");
        System.out.println("4. Billing ");
        System.out.println("5. Account ");
        System.out.println("6. Log Out ");
        System.out.print("Enter Your Choice : ");
    }
}

// Here Take Input and get Display recall
class Input {
    public void Object() {
        Product pro = new Product();
        // pro.prod();
        Staf staff = new Staf();
        // staff.stafName();
        Customer cus = new Customer();
        Billing bi = new Billing();
        Account ac = new Account();
        int x;
        Scanner ch = new Scanner(System.in);
        x = ch.nextInt();
        switch (x) {
            case 1:
                pro.prod();
                break;
            case 2:
                cus.customerList();
                break;
            case 3:
                staff.stafName();

            case 4:
                bi.bill();
                break;
            case 5:
                ac.acco();
                break;
            case 6:
                Agora ag = new Agora();
                ag.choice();;
                break;
            default:
                System.out.println("Please Enter Number ");
                break;
        }
    }
}

// All Product Item are Here And include any Item in Array
class Product {
    String name[] = { "\t1. Biskut = 20 TK", "\t2. Foog Perfume = 350 TK", "\t3. Nuduls = 60 Tk",
            "\t4. Chocolate = 400tk" };
    int price[];
    String expir;

    void prod() {

        System.out.println("Display Agora Product");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("Enter 0 Go to Home ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 0:
                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                break;
        }

    }
}

// Here Staf List
class Staf {
    void stafName() {
        System.out.println("The List Of Agora Staff");
        String stafList[] = { "\tOwner : Arefin ", "\tManager : Jalal Unus", "\tSales Man : Papon",
                "\tSales Man : Nannu", "\tSales Man : Khaled Sujon" };

        for (int i = 0; i < stafList.length; i++) {
            System.out.println(stafList[i]);
        }
        System.out.println(" 88. Staf Join Time !");
        System.out.println(" Enter 0 Go to Home ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 88:
                joinStaf();
                break;
            case 0:
                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                System.out.println("Run Again !!!");
                break;
        }
    }

    void joinStaf() {
        System.out.print("Enter your Name: ");
        Scanner so = new Scanner(System.in);
        String name = so.nextLine();

        System.out.print("Enter your join time : ");
        Scanner sc = new Scanner(System.in);
        float ti = sc.nextFloat();

        System.out.print("Name : " + name);
        System.out.println("  YOur join Time is : " + ti);
        System.out.println(" 88. Add more Staf Join Time ");
        System.out.println(" 0 Go Home ! ");
        Scanner js = new Scanner(System.in);
        int jns = js.nextInt();
        switch (jns) {
            case 88:
                joinStaf();
                break;
            case 0:
                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                break;
        }
    }
}

// Here Customer List
class Customer {
    String name[] = { "\tSela \tMO- 6858655", "\tBela \tMO- 345565", "\tAriyana \tMo- 5633435" };
    void customerList() {

        System.out.println("The List Of out Customer ");
        

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        System.out.println(" 88. Add more Customer !");
        System.out.println(" Enter 0 Go to Home ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 0:
                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;
            case 88:
                Customer cu = new Customer();
                cu.newCustomer();
                break;

            default:
                break;
        }
    }

    void newCustomer() {
        int n;

        Scanner nn =new Scanner(System.in);
        System.out.print("Enter How Much Customer Add : ");
        n= nn.nextInt();

        String[] nam = new String[n];
        int [] t = new int[n];
        Scanner ss = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter Customer Name: ");
            nam [i]= ss.nextLine();
            System.out.print("Enter Phone Number : ");
            t[i] = sc.nextInt();
        }
        System.out.println("\t\t Total lis of Customer ! ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        for(int i = 0;i<n;i++){
            System.out.println("\t"+nam[i]+"\tMO - "+t[i]);
        }
        

        System.out.println(" 88 Add More Customer ");
        System.out.println(" 0 for Go Home ");
        Scanner uu = new Scanner(System.in);
        int nC = uu.nextInt();
        switch (nC) {
            case 88:
                newCustomer();
                break;
            case 0:
                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                break;
        }
    }
}

// this is Billing sector
class Billing extends Product {
    void bill() {
        System.out.println("Enter Item Do you Want to Buy : ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        
        System.out.println("\t 0. Go to HOme");
        int y;
        Scanner bil = new Scanner(System.in);
        y = bil.nextInt();

        switch (y) {
            case 1:
                System.out.println("Thanks for Purchase Butter");
                System.out.println("Your bill is 130Tk");
                Buy_more();
                break;
            case 2:
                System.out.println("Thanks for Purchase FooG Perfume");
                System.out.println("Your bill is 350 Tk");
                Buy_more();
                break;
            case 3:
                System.out.println("Thanks for Purchase Nuds Perfume");
                System.out.println("Your bill is 60 Tk");
                Buy_more();
                break;
            case 4:
                System.out.println("Thanks for Purchase Chocolate");
                System.out.println("Your bill is 400 Tk");
                Buy_more();
                break;
            
            case 0:
                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;
            

            default:
                System.out.println("Thanks for Purchase");
                break;
        }
    }
    void Buy_more(){
        System.out.println("\t 99. More Buy");
        System.out.println("\t 0. GO Home ");
        Scanner bil = new Scanner(System.in);
        int e = bil.nextInt();
        switch (e) {
            case 99:
                Billing bi = new Billing();
                bi.bill();
                break;
            case 0:
            Display dis = new Display();
            dis.display();
            Input in = new Input();
            in.Object();
        
            default:
                break;
        }
        
    }
}

class Account {
    int asset = 64000;
    static int liability = 20;
    static int stockHolderEquity = 40;

    void acco() {

        System.out.print("\tAsset : " + asset);
        System.out.print("\tLiability : " + liability);
        System.out.println("\tStock Holder Equity : " + stockHolderEquity);
        System.out.println("1 Add Asset: ");
        System.out.println("2 Add Liability: ");
        System.out.println("3 Add Stock Holder Equity: ");
        int A;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        switch (A) {
            case 1:
                System.out.print("Enter Amount : ");
                Scanner inn = new Scanner(System.in);
                int aa = inn.nextInt();
                Asset(aa);
                break;
            case 2:
                System.out.print("Enter Amount : ");
                Scanner innn = new Scanner(System.in);
                int li = innn.nextInt();
                Liability(li);
                break;
            case 3:
                System.out.print("Enter Amount : ");
                Scanner innnn = new Scanner(System.in);
                int st = innnn.nextInt();
                SHE(st);
                break;

            default:
                break;
        }
    }

    int Asset(int asse) {
        asse = asset + asse;
        System.out.println("\t Asset : " + asse);
        System.out.println(" 0 : Go to Home ");
        System.out.println(" 99 : Go to Account ");
        Scanner qq = new Scanner(System.in);
        int aa = qq.nextInt();
        switch (aa) {
            case 99:

                acco();
                break;
            case 0:

                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                break;
        }
        return 0;
    }

    int Liability(int libi) {
        libi = liability + libi;
        System.out.println("\t Liability : " + libi);
        System.out.println(" 0 : Go to Home ");
        System.out.println(" 99 : Go to Account ");
        Scanner aq = new Scanner(System.in);
        int aa = aq.nextInt();
        switch (aa) {
            case 99:

                acco();
                break;
            case 0:

                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                break;
        }
        return 0;
    }

    int SHE(int stock) {
        stock = stockHolderEquity + stock;
        System.out.println("\t Stock Holder Equity : " + stock);
        System.out.println(" 0 : Go to Home ");
        System.out.println(" 99 : Go to Account ");
        Scanner qq = new Scanner(System.in);
        int aa = qq.nextInt();
        switch (aa) {
            case 99:

                acco();
                break;
            case 0:

                Display dis = new Display();
                dis.display();
                Input in = new Input();
                in.Object();
                break;

            default:
                break;
        }
        return 0;
    }

}
class OnlineShopping {
    void forloop(String[]loop){
        for(int i=0;i<loop.length;i++){
            System.out.println(loop[i]);
        }
    }
    int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your Choice : ");
        int in;
        return in = sc.nextInt();
    }
    
    int inputin(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter How Much : ");
        int in;
        return in = sc.nextInt();
    }
    void Buy_more(){
        System.out.println("\t 99. More Buy");
        System.out.println("\t 0. GO Online Shopping ");
        Scanner bil = new Scanner(System.in);
        int e = bil.nextInt();
        switch (e) {
            case 99:
                ShopingMain();
                break;
            case 0:
                ShopingMain();
                break;
        
            default:
                break;
        }
        
    }
    void Fruit(){
        String [] Fruit ={ " 1. Orange 120tk/KG"," 2. Apple 270tk/KG"," 3. Grapes 400tk/KG"};
        forloop(Fruit);
        switch (input()) {
            case 1:
                
                System.out.println(inputin()*120);
                Buy_more();
                break;
            case 2:
                
                System.out.println(inputin()*270);
                Buy_more();
                break;
            case 3:
               
                System.out.println(inputin()*400);
                Buy_more();
                break;
        
            default:
                break;
        }

    }
    void Meat(){
        String [] meat = { " 1. Beef 600tk/KG", " 2. Chicken 240tk/KG", " 3. Lamb 800tk/KG"};
        forloop(meat);
        switch (input()) {
            case 1:
                
                System.out.println(inputin()*600);
                Buy_more();
                break;
            case 2:
                
                System.out.println(inputin()*240);
                Buy_more();
                break;
            case 3:
               
                System.out.println(inputin()*800);
                Buy_more();
                break;
        
            default:
                break;
        }
    }
    void FastFood(){
        String [] FFood = { " 1. Burger 200tk/pice", " 2. Sandwich 90tk/pice", " 3. Pizza 1000tk/pice"};
        forloop(FFood);
        switch (input()) {
            case 1:
                
                System.out.println(inputin()*200);
                Buy_more();
                break;
            case 2:
                
                System.out.println(inputin()*90);
                Buy_more();
                break;
            case 3:
               
                System.out.println(inputin()*1000);
                Buy_more();
                break;
            
        
            default:
                break;
        }
    }
    void ShopingMain (){
        System.out.println(" \t\t\t\t\t\t\tWelcome to Agora Online Shopping");
        String [] productType = {" 1. Fruit "," 2. Meat "," 3. Fast Food "," 0. Log Out "};
        forloop(productType);
        switch (input()) {
            case 1:
                Fruit();
                break;
            case 2:
                Meat();
                break;
            case 3:
                FastFood();
                break;
            case 0:
                Agora ag = new Agora();
                ag.choice();
                break;
            default:
                break;
        }
        System.out.println(" Run Again ");
    }
}