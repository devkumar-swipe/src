import java.util.Scanner;
public class webprotocol {
    public static void main(String[]args){

    System.out.println("Website checker ");
    System.out.println("http , https , ftp ,tcp");
    System.out.println(".com , .in , .org , .net , .uk ");
    System.out.println("it will also check the subdomain");
    System.out.println("paste your link below ");

    Scanner sc = new Scanner(System.in);

    String url = sc.nextLine();
    String protocol = url.substring(0, url.indexOf(":"));

    if (protocol.equals("http")){
        System.out.println("hyper protocol");
    }
    else if (protocol.equals("tcp")){
        System.out.println("tcp protocol");

    }

    else if (protocol.equals("ftp")){
        System.out.println("file transfer protocol");

    }
    else if (protocol.equals("udp")){
        System.out.println("mail protocol");
    }
    else if (protocol.equals("https")){
        System.out.println("secure hyper protocol");
    }
    else{
        System.out.println("i dont know just google it ");

    }
    
    String exe = url.substring(url.lastIndexOf(".")+1);
    System.out.println("About domain : ");



    if (exe.equals("com")){
        System.out.println("commercial site");
    }

    else if (exe.equals("org")){
        System.out.println("organization site");
    }

    else if(exe.equals("net")){
        System.out.println("network site");
    }

    else if (exe.equals("in")){
        System.out.println("indian site");
    }

    else{
        System.out.println("i dont know google it ");
    }


    sc.close();



    


    }
    
}
