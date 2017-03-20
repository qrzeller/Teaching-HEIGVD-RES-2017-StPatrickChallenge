package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by qtask on 20.03.2017.
 */
public class NoEStreamProcessor implements IStreamProcessor{

    @Override
    public void process(Reader in, Writer out) throws IOException {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c = br.read();
        while (c != -1) {
            if(c!=101&&c!=69){
                //System.out.printf("%c",c);
                bw.write(c);}
            c = br.read();
        }
        bw.flush();
    }

}
