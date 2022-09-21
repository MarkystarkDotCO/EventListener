/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package headquaterwithevent;
import java.util.Scanner;
/**
 *
 * @author methanolkaeokrachang
 */
public class MainFootballScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSoure source = new ScoreSoure();
        ChanalB chanalB = new ChanalB();
        ChanalA chanalA = new ChanalA();
        source.addScoreListener(chanalB);
        source.addScoreListener(chanalA);
        
        while(true){
        
        String scoreLine = sc.nextLine();
        if(scoreLine.equals("-1")){
            break;
        }
        source.setScoreSoure(scoreLine);
        }
        source.removeScoreListener(chanalA);
        source.removeScoreListener(chanalB);
        

    }
    
}
