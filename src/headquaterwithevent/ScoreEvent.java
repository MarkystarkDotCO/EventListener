/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package headquaterwithevent;

import java.util.EventObject;

/**
 *
 * @author methanolkaeokrachang
 */
public class ScoreEvent extends EventObject{
    private String someData;
    public ScoreEvent(Object o, String val){
    super(o);
    someData= val;
    }
    public String getSomeData(){
    
    return someData ;
     }
}
