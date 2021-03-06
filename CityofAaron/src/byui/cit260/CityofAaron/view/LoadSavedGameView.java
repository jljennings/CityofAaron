/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.exceptions.*;
import byui.cit260.CityofAaron.control.GameControl;
import byui.cit260.CityofAaron.model.*;
import cityofaaron.CityofAaron;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jennings
 */
public class LoadSavedGameView extends ViewBase {

    /*
    *Constructor
     */
    public LoadSavedGameView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "To load a saved Game you must know the exact file location in\n"
                + "which it is saved.";
    }

    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the file location.");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /*
    *This will be coded to find the saved data andload it.
     */
    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        try {
            try {
                GameControl.getGame(filePath);
            } catch (GameControlExceptions ie) {
                ErrorView.display(filePath, "The file is incorrect.");
            }
        } catch (IOException ex) {
            ErrorView.display(filePath, "I/O error");
        }
        this.console.println("The game has been loaded from " + filePath);
        return false;
    }

}
