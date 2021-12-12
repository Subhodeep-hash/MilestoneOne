package com.assignmentOne;

import Model.Show;
import Service.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.exit;


public class NetFlix {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, ParseException {
        Reader r = new Reader();
        long startTime =0;
        long endTime =0;
        long timeElapsed=0;
        List<Show> shows = r.readFromCSV("C:\\Users\\subhodghosh\\NetFlix\\src\\Resources\\netflix_titles.csv");
        String ch = null;
        do{
            System.out.println("*** WELCOME ***");
            System.out.println("Please Enter 1 to Sort by Type of Shows");
            System.out.println("Please Enter 2 to Sort by Listed In");
            System.out.println("Please Enter 3 to Sort by Type of Shows and Country");
            System.out.println("Please Enter 4 to Sort by Date");
            System.out.print("Enter Your choice : ");
            int choice = Integer.parseInt(reader.readLine());
            switch (choice){
                case 1:
                    System.out.println("Enter your choice");
                    String type = reader.readLine();
                    BasisOfType bt = new BasisOfType();
                    startTime = System.nanoTime();
                    bt.findBasisOfType(shows, type);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    System.out.println("Execution time in nanoseconds: " + timeElapsed);
                    System.out.println("To continue press 'Y' else 'N'");
                    ch = reader.readLine();
                    if("N".equalsIgnoreCase(ch))
                        exit(0);
                    break;
                case 2:
                    System.out.println("Enter your choice");
                    String listedIn = reader.readLine();
                    BasisOfListed bl = new BasisOfListed();
                    startTime = System.nanoTime();
                    bl.findBasisOfListedIn(shows,listedIn);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    System.out.println("Execution time in nanoseconds: " + timeElapsed);
                    System.out.println("To continue press 'Y' else 'N'");
                    ch = reader.readLine();
                    if("N".equalsIgnoreCase(ch))
                        exit(0);
                    break;
                case 3:
                    System.out.println("Enter Type");
                    String typeofShow = reader.readLine();
                    System.out.println("Enter Country");
                    String country = reader.readLine();
                    startTime = System.nanoTime();
                    BasisOfTypeAndCountry btc = new BasisOfTypeAndCountry();
                    btc.findBasisOfTypeAndCountry(shows, typeofShow, country);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    System.out.println("Execution time in nanoseconds: " + timeElapsed);
                    System.out.println("To continue press 'Y' else 'N'");
                    ch = reader.readLine();
                    if("N".equalsIgnoreCase(ch))
                        exit(0);
                    break;
                case 4:
                    System.out.println("Enter start date in \"dd-MMM-yyyy\" format");
                    String startDate = reader.readLine();
                    System.out.println("Enter end date in \"dd-MMM-yyyy\" format");
                    String endDate = reader.readLine();
                    BasisOfDate bd = new BasisOfDate();
                    startTime = System.nanoTime();
                    bd.findBasisOfDate(shows,startDate, endDate);
                    endTime = System.nanoTime();
                    timeElapsed = endTime - startTime;
                    System.out.println("Execution time in nanoseconds: " + timeElapsed);
                    System.out.println("To continue press 'Y' else 'N'");
                    ch = reader.readLine();
                    if("N".equalsIgnoreCase(ch))
                        exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println("To continue press 'Y' else 'N'");
                    ch = reader.readLine();
            }
        }while("Y".equalsIgnoreCase(ch));

    }
}
