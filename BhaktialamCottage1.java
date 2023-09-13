import java.util.Scanner;

public class BhaktialamCottage1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


    
        System.out.println(" Jenis pilihan kamar: ");
        System.out.println("1. Duku");
        System.out.println("2. Jeruk");
        System.out.println("3. Alpukat");
        System.out.println("4. Jambu air");
        System.out.println("5. Durian");
        System.out.println("6. Melon");
        System.out.println("7. Belimbing");
        System.out.println("8. Nangka");
        System.out.println("9. Kedondong");

        int y = input.nextInt();

         if (y >= 1 && y <=9){
            switch (y) {

                //<!-- kamar duku --> 
                case 1: 
                    System.out.println("");
                    System.out.println("MEMILIH JENIS KAMAR DUKU");
                    System.out.println("Pilih waktu menginap anda : ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");
                   
                    
                    int a = input.nextInt();

                if (a >=1 && a <=3){
                    switch(a){
                        case 1: 
                            System.out.println("");
                            System.out.println("KAMAR DUKU WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam = input.nextInt();
                            int harga = 915000 * malam;
                            System.out.println("KAMAR DUKU WEEKDAY UNTUK " + malam + " MALAM");
                            System.out.println("Harga:" + harga);
                            break;
                        
                        
                        case 2: 
                            System.out.println("KAMAR DUKU WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam1 = input.nextInt();
                            int harga1 = 1025000 * malam1;
                            System.out.println("KAMAR DUKU WEEKEND UNTUK " + malam1 + " MALAM");
                            System.out.println("Harga:" + harga1);
                           break;

                        case 3: 
                            
                            System.out.println("KAMAR DUKU HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam2 = input.nextInt();
                            int harga2 = 1225000 * malam2;
                            System.out.println("KAMAR DUKU HOLIDAY UNTUK " + malam2 + " MALAM");
                            System.out.println("Harga:" + harga2);
                            break;
                        }
                    }

                
                    break;
                

                //<!-- kamar jeruk--> 
                case 2:
                    System.out.println("KAMAR JERUK");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");

                    int b = input.nextInt();

                if(b >=1 && b <=3){
                    switch(b){
                        case 1: 
                            System.out.println("KAMAR JERUK WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam = input.nextInt();
                            int harga = 915000 * malam;
                            System.out.println("KAMAR JERUK WEEKDAY UNTUK " + malam + " MALAM");
                            System.out.println("Harga:" + harga);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR JERUK WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam1 = input.nextInt();
                            int harga1 = 1025000 * malam1;
                            System.out.println("KAMAR JERUK WEEKEND UNTUK " + malam1 + " MALAM");
                            System.out.println("Harga:" + harga1);
                            break;
            
                        case 3: 
                            System.out.println("KAMAR JERUK HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam2 = input.nextInt();
                            int harga2 = 1225000 * malam2;
                            System.out.println("KAMAR JERUK HOLIDAY UNTUK " + malam2 + " MALAM");
                            System.out.println("Harga:" + harga2);
                            break;
                        }
                    }

                
                    break;
                
                
                //<!-- kamar alpukat--> 
                case 3:
                    System.out.println("KAMAR ALPUKAT");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");
                    
                    int c = input.nextInt();
                
                if(c >= 1 && c <= 4){
                    switch(c){
                        case 1: 
                            System.out.println("KAMAR ALPUKAT WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam = input.nextInt();
                            int harga = 575000 * malam;
                            System.out.println("KAMAR ALPUKAT WEEKDAY UNTUK " + malam + " MALAM");
                            System.out.println("Harga:" + harga);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR ALPUKAT WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam1 = input.nextInt();
                            int harga1 = 695000 * malam1;
                            System.out.println("KAMAR ALPUKAT WEEKEND UNTUK " + malam1 + " MALAM");
                            System.out.println("Harga:" + harga1);
                            break;
 
                        case 3: 
                            System.out.println("");
                            System.out.println("KAMAR ALPUKAT HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam2 = input.nextInt();
                            int harga2 = 895000 * malam2;
                            System.out.println("KAMAR Alpukat HOLIDAY UNTUK " + malam2 + " MALAM");
                            System.out.println("Harga:" + harga2);
                            break;
                        }
                    }

                
                    break;
                
                
                //<!-- kamar jambu air --> 
                case 4:
                    System.out.println("KAMAR JAMBU AIR");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");

                    int d = input.nextInt();

                if(d >= 1 && d <=3){
                    switch(d){
                        case 1: 
                            System.out.println("KAMAR JAMBU AIR WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam3 = input.nextInt();
                            int harga3 = 575000 * malam3;
                            System.out.println("KAMAR JAMBU AIR WEEKDAY UNTUK " + malam3 + " MALAM");
                            System.out.println("Harga:" + harga3);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR JAMBU AIR WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam4 = input.nextInt();
                            int harga4 = 695000 * malam4;
                            System.out.println("KAMAR JAMBU AIR WEEKEND UNTUK " + malam4 + " MALAM");
                            System.out.println("Harga:" + harga4);
                            break;

                        case 3: 
                            System.out.println("KAMAR JAMBU AIR HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam5 = input.nextInt();
                            int harga5 = 895000 * malam5;
                            System.out.println("KAMAR JAMBU AIR HOLIDAY UNTUK " + malam5 + " MALAM");
                            System.out.println("Harga:" + harga5);
                            break;
                        }
                    }

                
                    break;
                
                
                //<!-- kamar durian --> 
                case 5:
                    System.out.println("KAMAR DURIAN");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");

                    int e = input.nextInt();

                if(e >= 1 && e <= 3){
                    switch(e){
                        case 1: 
                            System.out.println("KAMAR DURIAN WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam3 = input.nextInt();
                            int harga3 = 595000 * malam3;
                            System.out.println("KAMAR DURIAN WEEKDAY UNTUK " + malam3 + " MALAM");
                            System.out.println("Harga:" + harga3);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR DURIAN WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam4 = input.nextInt();
                            int harga4 = 715000 * malam4;
                            System.out.println("KAMAR DURIAN WEEKEND UNTUK " + malam4 + " MALAM");
                            System.out.println("Harga:" + harga4);
                           break;

                        case 3: 
                            System.out.println("==KAMAR DURIAN HOLiDAY==");
                            System.out.println("Berapa malam anda menginap?");

                            int malam5 = input.nextInt();
                            int harga5 = 915000 * malam5;
                            System.out.println("KAMAR DURIAN HOLYDAY UNTUK " + malam5 + " MALAM");
                            System.out.println("Harga:" + harga5);
                           break;
                        }
                    }

                
                    break;
                
                
                //<!-- kamar melon --> 
                case 6:
                    System.out.println("KAMAR MELON");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");
                    
                    int f = input.nextInt();

                if(f >= 1 && f <= 3){
                    switch(f){
                        case 1: 
                            System.out.println("KAMAR MELON WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam3 = input.nextInt();
                            int harga3 = 595000 * malam3;
                            System.out.println("KAMAR MELON WEEKDAY UNTUK " + malam3 + " MALAM");
                            System.out.println("Harga:" + harga3);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR MELON WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam4 = input.nextInt();
                            int harga4 = 715000 * malam4;
                            System.out.println("KAMAR MELON WEEKEND UNTUK " + malam4 + " MALAM");
                            System.out.println("Harga:" + harga4);
                            break;

                        case 3: 
                            System.out.println("KAMAR MELON HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam5 = input.nextInt();
                            int harga5 = 915000 * malam5;
                            System.out.println("KAMAR MELON HOLIDAY UNTUK " + malam5 + " MALAM");
                            System.out.println("Harga:" + harga5);
                            break;
                        }
                    }

                
                    break;
                

                //<!-- kamar belimbing --> 
                case 7:
                    System.out.println("KAMAR BELIMBING");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");

                    int g = input.nextInt();

                if(g >= 1 && g <= 3){
                    switch(g){
                        case 1: 
                            System.out.println("KAMAR BELIMBING WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam3 = input.nextInt();
                            int harga3 = 495000 * malam3;
                            System.out.println("KAMAR BELIMBING WEEKDAY UNTUK " + malam3 + " MALAM");
                            System.out.println("Harga:" + harga3);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR BELIMBING WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam4 = input.nextInt();
                            int harga4 = 575000 * malam4;
                            System.out.println("KAMAR BELIMBING WEEKEND UNTUK " + malam4 + " MALAM");
                            System.out.println("Harga:" + harga4);
                            break;

                        case 3: 
                            System.out.println("KAMAR BELIMBING HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam5 = input.nextInt();
                            int harga5 = 755000 * malam5;
                            System.out.println("KAMAR BELIMBING HOLIDAY UNTUK " + malam5 + " MALAM");
                            System.out.println("Harga:" + harga5);
                            break;
                        }
                    }
                
                
                    break;
                

                //<!-- kamar mangga --> 
                case 8:
                    System.out.println("KAMAR MANGGA");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");

                    int h = input.nextInt();

                if(h >= 1 && h <= 3){
                    switch(h){
                        case 1: 
                            System.out.println("KAMAR BELIMBING WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam3 = input.nextInt();
                            int harga3 = 495000 * malam3;
                            System.out.println("KAMAR BELIMBING WEEKDAY UNTUK " + malam3 + " MALAM");
                            System.out.println("Harga:" + harga3);
                            break;
                        
                        case 2: 
                            System.out.println("KAMAR BELIMBING WEEKEND");
                            System.out.println("Berapa malam anda menginap");

                            int malam4 = input.nextInt();
                            int harga4 = 575000 * malam4;
                            System.out.println("KAMAR BELIMBING WEEKEND UNTUK " + malam4 + " MALAM");
                            System.out.println("Harga:" + harga4);
                           break;

                        case 3: 
                            System.out.println("KAMAR BELIMBING HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam5 = input.nextInt();
                            int harga5 = 755000 * malam5;
                            System.out.println("KAMAR BELIMBING HOLIDAY UNTUK " + malam5 + " MALAM");
                            System.out.println("Harga:" + harga5);
                            break;
                        }
                    }
                
                
                    break;
                

                //<!-- kamar kedondong --> 
                case 9:
                    System.out.println("KAMAR KEDONDONG");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holiday ");
                    
                    int i = input.nextInt();

                if(i >= 1 && i <= 3){
                    switch(i){
                        case 1: 
                            System.out.println("KAMAR KEDONDONG WEEKDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam3 = input.nextInt();
                            int harga3 = 495000 * malam3;
                            System.out.println("KAMAR KEDONDONG WEEKDAY UNTUK " + malam3 + " MALAM");
                            System.out.println("Harga:" + harga3);
                           break;
                        
                        case 2: 
                            System.out.println("KAMAR KEDONDONG WEEKEND");
                            System.out.println("Berapa malam anda menginap?");

                            int malam4 = input.nextInt();
                            int harga4 = 575000 * malam4;
                            System.out.println("KAMAR KEDONDONG WEEKEND UNTUK " + malam4 + " MALAM");
                            System.out.println("Harga:" + harga4);
                            break;

                        case 3: 
                            System.out.println("");
                            System.out.println("KAMAR KEDONDONG HOLIDAY");
                            System.out.println("Berapa malam anda menginap?");

                            int malam5 = input.nextInt();
                            int harga5 = 755000 * malam5;
                            System.out.println("KAMAR KEDONDONG HOLIDAY UNTUK " + malam5 + " MALAM");
                            System.out.println("Harga:" + harga5);
                            break;
                        }
                    }
                
                
                    break;
                

            }

        }

        }
    }

