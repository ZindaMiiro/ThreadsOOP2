/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadindDEMO;
import java.applet.Applet;
/**
 *
 * @author jorda
 */
public class OurApplet extends Applet {
    public void init() {
OurClass oc = new OurClass();
   oc.run();
}
}
