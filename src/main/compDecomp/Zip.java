package compDecomp;

public class Zip implements CompressDecompress{

    @Override
    public String compress(String filename) {
        System.out.println("Compressing file " +filename+" to Zip file");
        return filename.concat(".zip");
    }

    @Override
    public void decompress() {
        System.out.println("Decompressing Zip file");
    }
}
