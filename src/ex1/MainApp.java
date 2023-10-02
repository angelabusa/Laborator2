package ex1;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import static java.util.Arrays.binarySearch;

public class MainApp {
    public static void main(String[] args)throws FileNotFoundException
    {
        String jud[]=new String[4];
        String nume_fisier="judet_in.txt";
        Scanner read=new Scanner(new File("judet_in.txt"));
        int i=0;
        while(read.hasNext())
        {
            jud[i]=read.nextLine();
            i++;
        }
        Arrays.sort(jud);
        for(int j=0;j<i;j++)
            System.out.println(jud[j]);
        System.out.println("Introduceti judetul: ");
        Scanner judet=new Scanner(System.in);
        String nume_judet=judet.nextLine();

int poz=binarySearch(jud,nume_judet);
        System.out.println("Judetul este pe poz: "+(poz+1));

    }
}




























































