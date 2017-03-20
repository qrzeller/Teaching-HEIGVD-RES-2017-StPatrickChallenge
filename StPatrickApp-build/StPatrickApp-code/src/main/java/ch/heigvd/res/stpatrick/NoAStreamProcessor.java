package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by qtask on 20.03.2017.
 */
public class NoAStreamProcessor implements IStreamDecoratorController{


    @Override
    public Reader decorateReader(Reader inputReader) {
        return inputReader;
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {
        return new FilterWriter(outputWriter) {
            @Override
            public void write(int c) throws IOException {
                if(c!=97&&c!=65){
                    super.write(c);}
            }

        };
    }
}
