package compDecomp;

public class Z7 implements CompressDecompress{

    @Override
    public String compress(String filename) {
        System.out.println("CCompressing file " +filename+" to 7z file");
        return filename.concat(".7z");
    }

    @Override
    public void decompress() {
        System.out.println("Decompressing Zip file");
    }

}
