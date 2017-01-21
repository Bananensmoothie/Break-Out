package interfaces;

import java.awt.Font;

/**
 * Im Interface <i>"<b>ISchriften</b>"</i> werden die "<i><b>Standardwerte</b></i>" für <br>
 * den <i>späteren Gebrauch</i> <b>getroffen und festgehalten</b>.<br>
 * <br>
 * Bei der Schriftart handelt es sich immer um die Gleiche,<br>
 * es ändert sich lediglich die Grösse und der Style.
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public interface ISchriften
{
	/**
	 * Die "<i><b>SCHRIFT_GROSS_FETT</b></i>" wird <b>fett</b> geschrieben und auf eine Groesse von <b>30</b> gesetzt.
	 */
	Font SCHRIFT_GROSS_FETT = new Font("Tempus Sans ITC", Font.BOLD, 30);
	/**
	 * Die "<i><b>SCHRIFT_MITTEL_FETT</b></i>" wird <b>fett</b> geschrieben und auf eine Groesse von <b>20</b> gesetzt.
	 */
	Font SCHRIFT_MITTEL_FETT = new Font("Tempus Sans ITC", Font.BOLD, 20);
	/**
	 * Die "<i><b>SCHRIFT_NORMAL_FETT</b></i>" wird <b>fett</b> geschrieben und auf eine Groesse von <b>15</b> gesetzt.
	 */
	Font SCHRIFT_NORMAL_FETT = new Font("Tempus Sans ITC", Font.BOLD, 15);
	/**
	 * Die "<i><b>SCHRIFT_GROSS</b></i>" wird auf eine Groesse von <b>30</b> gesetzt.
	 */
	Font SCHRIFT_GROSS = new Font("Tempus Sans ITC", Font.PLAIN, 30);
	/**
	 * Die "<i><b>SCHRIFT_MITTEL</b></i>" wird auf eine Groesse von <b>20</b> gesetzt.
	 */
	Font SCHRIFT_MITTEL = new Font("Tempus Sans ITC", Font.PLAIN, 20);
	/**
	 * Die "<i><b>SCHRIFT_NORMAL</b></i>" wird auf eine Groesse von <b>15</b> gesetzt.
	 */
	Font SCHRIFT_NORMAL = new Font("Tempus Sans ITC", Font.PLAIN, 15);
}