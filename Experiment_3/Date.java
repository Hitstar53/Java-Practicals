import java.util.*;
class Date {
    int year,month,date;
    int hrs,min,sec;
    Date() {
        year = 2000;
        month = 01;
        date = 01;
        hrs = 00;
        min = 00;
        sec = 00;
    }
    //setters
    void setDate(int y,int m,int d) {year = y;month = m;date = d;};
    void setDate(int y,int m,int d,int h,int mi) {year = y;month = m;date = d;hrs = h;min = mi;};
    void setDate(int y,int m,int d,int h,int mi,int s) {year = y;month = m;date = d;hrs = h;min = mi;sec = s;};
    //Utility methods
    void displayDate(int n) {
        if(n==1) {
            System.out.printf("Date: %d/%d/%d\n",date,month,year);
        }
        else if(n==2) {
            System.out.printf("Date: %d/%d/%d, %d:%d\n",date,month,year,hrs,min);
        }
        else if(n==3) {
            System.out.printf("Date: %d/%d/%d, %d:%d:%d\n",date,month,year,hrs,min,sec);
        }
    }        
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        Date d1= new Date();
        Date d2= new Date();
        Date d3= new Date();
        int choice,flag;
        int year,month,date,hrs,min,sec;
        while(true) {
            System.out.println("Welcome to Date Fomatter");
            System.out.println("Select 1 Format\n1 -> DD/MM/YYYY\n2 -> DD/MM/YYYY, HH:MM\n3 -> DD/MM/YYYY, HH:MM:SS");
            choice = sc.nextInt();
            System.out.println("Enter Year,Month and Date: ");
            year = sc.nextInt();
            month = sc.nextInt();
            date = sc.nextInt();
            if(month>12) {
                System.out.println("Invalid Month(1-12)");
                break;
            }
            else if(date>31) {
                System.out.println("Invalid Date(1-31)");
                break;
            }
            switch(choice) {
                case 1:
                    d1.setDate(year, month, date);
                    d1.displayDate(choice);
                    break;
                case 2:
                    System.out.println("Enter Hours and Minutes: ");
                    hrs = sc.nextInt();
                    min = sc.nextInt();
                    if(hrs>23) {
                        System.out.println("Invalid Hours(0-23)");
                        break;
                    }
                    else if(min>59) {
                        System.out.println("Invalid Minutes(0-59)");
                        break;
                    }
                    d2.setDate(year, month, date, hrs, min);
                    d2.displayDate(choice);
                    break;
                case 3:
                    System.out.println("Enter Hours,Minutes and Seconds: ");
                    hrs = sc.nextInt();
                    min = sc.nextInt();
                    sec = sc.nextInt();
                    if(hrs>23) {
                        System.out.println("Invalid Hours(0-23)");
                        break;
                    }
                    else if(min>59) {
                        System.out.println("Invalid Minutes(0-59)");
                        break;
                    }
                    else if(sec>59) {
                        System.out.println("Invalid Seconds(0-59)");
                        break;
                    }
                    d3.setDate(year, month, date, hrs, min, sec);
                    d3.displayDate(choice);
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.println("Do you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            } 
        }
        sc.close();
    } 
}

