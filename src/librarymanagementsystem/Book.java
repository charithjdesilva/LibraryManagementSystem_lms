/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static librarymanagementsystem.bookSearchResult.scaleImage;

/**
 *
 * @author Charith
 */
public class Book {
    String uname = "";
    String user = "";
    String utype = "";
    String isbn = "";
    String bookName = "";
    String bookAuthor = "";
    String currentAv = "";
    
    void openBookIamge(String isbn, JLabel imgBook) throws Exception {
        this.isbn = isbn;
        try {
            ImageIcon bookImage = new ImageIcon(scaleImage(260, 350, ImageIO.read((new File("bookImages\\" + isbn + ".jpg")))));
            imgBook.setIcon(bookImage); //change image icon
            
        } catch (IOException e) {
            String workingDir = System.getProperty("user.dir");
            System.out.println("Current working directory : " + workingDir);
            e.printStackTrace();
        }
    }
}
