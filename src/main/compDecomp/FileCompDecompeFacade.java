package compDecomp;

import java.io.File;

public class FileCompDecompeFacade {

    public String compressdecFile(String filename, String algorithm, String action, String dest){
        CompressDecompress compDecomp ;
        if (action.equals("compress")){
            if (algorithm.equalsIgnoreCase("zip")){
                compDecomp = new Zip();
            }else if (algorithm.equalsIgnoreCase("rar")){
                compDecomp = new Rar();

            }else{
                compDecomp = new Z7();
            }
            return dest.concat( compDecomp.compress(filename));
        }
        else{
            if (algorithm.equalsIgnoreCase("zip")){
                compDecomp = new Zip();
            }else if (algorithm.equalsIgnoreCase("rar")){
                compDecomp = new Rar();
            }else{
                compDecomp = new Z7();
            }
            compDecomp.decompress();
            return dest.concat(filename);
        }

    }
}
