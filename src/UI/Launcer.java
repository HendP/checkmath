/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author My PC
 */
public class Launcer {
    public static void main(String[] args) {
        Player player = new Player();
        player.set_nama();
        if (player.get_nama() == null){
            inputnamaawal nama= new inputnamaawal();
            nama.setVisible(true);
        }else{
            new MainMenu().setVisible(true);     
        }
    }
}