package Q4;
import java.util.ArrayList;

public class Folder {

    private String folderName;
    private Folder newFolder;
    private File newFile;
    private ArrayList<File> fileList = new ArrayList<>();
    private ArrayList<Folder> folderList = new ArrayList<>();

    public Folder(String folderName){
        this.setFolderName(folderName);
    }

    public void setFolderName(String folderName){
        this.folderName = folderName;
    }
    public String getFolderName(){
        return this.folderName;
    }

    public void addFolder(String folderName){
        this.newFolder = new Folder(folderName);
        this.folderList.add(newFolder);
    }
    public void addFile(String fileName){
        this.newFile = new File(fileName);
        this.fileList.add(newFile);
    }

    public ArrayList<Folder> getFolderList(){
        return this.folderList;
    }
    public ArrayList<File> getFileList(){
        return this.fileList;
    }

    public void printAllFolders(){
        System.out.println(this.getFolderName());
        for(Folder currFolder : this.folderList){
            System.out.println("    " + currFolder.getFolderName());
            for(int i = 0; i < currFolder.getFolderList().size(); i++){
                System.out.println("    " + currFolder.getFolderList().get(i).getFolderName());
            }
            if(!currFolder.fileList.isEmpty()){
                for(File currFile : currFolder.fileList){
                    System.out.println("    " + currFile.getFileName());
                }
            }
        }
        for(File currFile : this.fileList){
            System.out.print("    " + currFile.getFileName());
        }
    }
}
