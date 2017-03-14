import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class CdApp {
 public static void main(String[] args) {
   Console myConsole = System.console();

   CdObj Backstreetboys = new CdObj("The Backstreet Boys", "Backstreets Back", "1993", 10);
   CdObj Nirvana = new CdObj("Nirvana", "Nevermind", "1991", 15);
   CdObj EazyE = new CdObj("Eazy-E", "It's On", "1993", 20);
   CdObj DrDre = new CdObj("Dr Dre", "2001", "1999", 20);
   CdObj Eminem = new CdObj("Eminem", "The Marshall Mathers LP", "2001", 10);
   CdObj NotoriousBig = new CdObj("Notorious B.I.G.", "Ready to Die", "1994", 15);
   CdObj Outkast = new CdObj("Outkast", "Speakerboxxx", "2000", 15);
   CdObj Gorillaz = new CdObj("Gorillaz", "Gorillaz", "2001", 15);
   CdObj Limpbizkit = new CdObj("Limp Bizkit", "Significant Other", "2003", 10);
   CdObj Paparoach = new CdObj("Papa Roach", "Infest", "2000", 10);

   CdObj[] allCDs = {Backstreetboys, Nirvana, EazyE, DrDre, Eminem, NotoriousBig, Outkast, Gorillaz, Limpbizkit, Paparoach};

   System.out.println("-----------------------");
   System.out.println("Here are all of our CDs");

   for (CdObj individualCD : allCDs) {
     System.out.println("-----------------------");
     System.out.println(individualCD.mArtist);
     System.out.println(individualCD.mAlbum);
     System.out.println(individualCD.mYear);
     System.out.println(individualCD.mPrice);
   }

  }
}
