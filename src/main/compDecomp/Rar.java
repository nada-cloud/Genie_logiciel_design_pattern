package compDecomp;

public class Rar  implements CompressDecompress{
    @Override
    public String compress(String filename) {
        System.out.println("Compressing file " +filename+" to rar file");
        return filename.concat(".rar");
    }

    @Override
    public void decompress() {
        System.out.println("Decompressing Zip file");
    }

}
