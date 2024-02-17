import Q4.*;
import java.util.*;

public class FileDriver {
    public static void main(String[] args) {

        Folder php_demo1 = new Folder("php_demo1");

        php_demo1.addFolder("Source Files");
        php_demo1.addFile("New File");

        for(int i = 0; i < php_demo1.getFolderList().size(); i++){
            if(php_demo1.getFolderList().get(i).getFolderName().equals("Source Files")){
                php_demo1.getFolderList().get(i).addFolder("phalcon");
                php_demo1.getFolderList().get(i).addFolder("app");
                php_demo1.getFolderList().get(i).addFolder("cache");
                php_demo1.getFolderList().get(i).addFolder("public");
                php_demo1.getFolderList().get(i).addFolder("Include Path");
                php_demo1.getFolderList().get(i).addFolder("Remote Files");
            }
            else if(php_demo1.getFolderList().get(i).getFolderName().equals("app")){
                php_demo1.getFolderList().get(i).addFolder("config");
                php_demo1.getFolderList().get(i).addFolder("controllers");
                php_demo1.getFolderList().get(i).addFolder("library");
                php_demo1.getFolderList().get(i).addFolder("migrations");
                php_demo1.getFolderList().get(i).addFolder("models");
                php_demo1.getFolderList().get(i).addFolder("views");
            }
            else if(php_demo1.getFolderList().get(i).getFolderName().equals("public")){
                php_demo1.getFolderList().get(i).addFile(".htaccess");
                php_demo1.getFolderList().get(i).addFile(".htrouter.php");
                php_demo1.getFolderList().get(i).addFile("index.html");
            }
        }
        php_demo1.printAllFolders();
    }
}
