/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

/**
 *
 * @author pesin
 */
public class FeedThePeopleView {
    
}

package view;

import java.util.Scanner;
/**
 *
 * @author pesin
 */
@Override
protected String getMessage() {
return "Main Menu\n"
        + "N - Start New Game\n"
        + "L - Load and Save Game/n"
        + "H - Help Menu\n"
        + "Q - Quit\n";
}

    public FeedThePeopleView() {
        
        message = "Feed The People\n"
                + "---------------------\n"
                 + "V - View list of food\n"
                + "C - View price\n"
                + "P - How many people\n"
                + "T - Total Cost to buy Food\n"
                + "H - Help\n"
                + "Q - Quit\n"
                + "R-Return To The  Main Menu\n";
}
/**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        System.out.println();
        System.out.println("Thank you."); 
         + CityofAaron.getCurrentGame().getThePlayer().getName() + "!\n");
      
}