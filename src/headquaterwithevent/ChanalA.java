/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package headquaterwithevent;

/**
 *
 * @author methanolkaeokrachang
 */
public class ChanalA implements SocreListener{

    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("live result: Thai "+ e.getSomeData() +" UAE");
    }
    
}
