/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.saljex.terasaki.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.ArrayList;

/**
 *
 * @author Ulf
 */
public class KundList implements IsSerializable{
	public KundList() {}

	public ArrayList<Kund> kunder = new ArrayList();

}
