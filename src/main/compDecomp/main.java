package compDecomp;


public class main {

    public static void main(String[] args) {

        FileCompDecompeFacade facade = new FileCompDecompeFacade();
        String filename = "testfile";
        String dest = "/Desktop/Downloads/";
        String algorithm = "rar";
        String action = "compress";
        System.out.println("Find your file here: "+facade.compressdecFile(filename,algorithm,action,dest));

    }
}
