/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package headquaterwithevent;

import java.util.ArrayList;

/**
 *
 * @author methanolkaeokrachang
 */
public class ScoreSoure {
    private String source;
	private ArrayList<SocreListener> listeners;
	public ScoreSoure() {
		listeners = new ArrayList<>();
	}
	public void setScoreSoure(String val) {
		source = val;
		fireScoreEvent(new ScoreEvent(this, source));
	}
	public void addScoreListener(SocreListener l) {
		listeners.add(l);
	}
	public void removeScoreListener(SocreListener l) {
		listeners.remove(l);
	}
	public void fireScoreEvent(ScoreEvent e) {
              for(int i = 0; i < listeners.size(); i++) {
			SocreListener l = listeners.get(i);
			l.scoreChange(e);
		}
	}
}
