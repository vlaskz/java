/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Scanner;
/**
 *
 * @author Sam Velasquez
 */
public class SistemaInterno {
    
    void login(Autenticavel a){
        Scanner s = new Scanner(System.in);
        int senha = s.nextInt();
        boolean ok = a.autenticar(senha);
    }
    
}
