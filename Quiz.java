import java.util.*;
class Quiz {
    static String Yellow = "\u001b[33m";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("\n");
        loading();
        boolean exit=false;
        while (!exit) {
        System.out.println("\n");
        System.out.println(Yellow+"**** Welcome to java Quiz game ****");
        System.out.println(Yellow+"***********************************");
        System.out.println(Yellow+"** 1. Play                       **");
        System.out.println(Yellow+"** 2. About                      **");
        System.out.println(Yellow+"** 3. About me                   **");
        System.out.println(Yellow+"** 4. exit                       **");
        System.out.println(Yellow+"***********************************");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                play();
                break;
            case 2:
                about(sc);
                break;
            case 3:
                aboutme(sc);
                break;
            case 4:
                exit=true;
                System.out.println("Exiting game. Bye Bye !!");
                sleep();
                break;
            default:
            System.out.println("Please enter valid choice");
                break;
        }
    }
    sc.close();    
}
    //about
    private static void about(Scanner sc) {
        System.out.println(Yellow+"________________________________________________________________");
        System.out.println(Yellow+"|This is a basic console quiz game created by San Desh          |");
        System.out.println(Yellow+"|To check you have a big brain or a small one try this game     |");
        System.out.println(Yellow+"|                    Quiz v1.0                                  |");
        System.out.println(Yellow+"|_______________________________________________________________|");
        System.out.println(Yellow+"Press Enter to return to the main menu...");
        sc.nextLine();
        sc.nextLine();
    }
    //aboutme
    private static void aboutme(Scanner sc) {
        System.out.println(Yellow+"________________________________________________________________");
        System.out.println(Yellow+"|             Hello i am Sandesh !!                             |");
        System.out.println(Yellow+"|             A normie java programmer !!!                      |");
        System.out.println(Yellow+"|             i am not Rasist :)                                |");
        System.out.println(Yellow+"|_______________________________________________________________|");
        System.out.println(Yellow+"Press Enter to return to the main menu...");
        sc.nextLine();
        sc.nextLine();
    }
    private static void play(){
        String Question1="\nIn which planet do you live ?";
        String Question2="\nWhen was Hitler was born ? (year only)";
        String Question3="\n___ I am gay.";
        System.out.println("Hey ! Lets play now ");
        sleep();
        System.out.println(Question1);
        Scanner sc=new Scanner(System.in);
        String ans=sc.nextLine();
            if (ans.equalsIgnoreCase("earth")) {
                System.out.println("Right answer");
                
            }else{
                System.out.println("wrong answer");
            }
        System.out.println(Question2);
        int z=1889;
        int ans1=sc.nextInt();
            if (ans1==z) {
                System.out.println("Right answer");
                    
            }else{
                 System.out.println("Damm bruh! you don't even know that. stupid nigga !!!");
            }
        sleep();
        System.out.println("This is the easyest question. if you can't even answer this you need to check up yr brain damm seriously ");
        sleep();
        System.out.println(Question3);
        System.out.println("1. yes    2. no   3. maybe    4. leave it blank");
        int q=sc.nextInt();
        if (q==1) {
            System.out.println("I knew it ");
        }else if(q==2){
            System.out.println("Ur right ");
        }else if(q==3){
            System.out.println("it might be");
        }else{
            System.out.println("you really are!!!!");
        }
        System.out.println("nice play see u later 🤣");
    }
    private static void sleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("oops error at sleep method *_*");
        }
    }
    private static void loading() {
        System.out.print("Loading");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("oops!!! error at loading *_*");
        }
        System.out.println();
    }
}