/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dessinateur;

/**
 *
 * @author macbookpro
 */
public class DessinateurDAOFactory {
      public static DessinateurDAO createDessinateur()
    {
        return new DessinateurDAOImpl();
    }
    
    
}
