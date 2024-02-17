package Q4;
public class File {
    private String fileName;

    public File(String fileName){
        this.setFileName(fileName);
    }
    protected void setFileName(String fileName){
        this.fileName = fileName;
    }
    protected String getFileName(){
        return this.fileName;
    }

    protected void printFileName(){
        System.out.println(this.getFileName());
    }
}
