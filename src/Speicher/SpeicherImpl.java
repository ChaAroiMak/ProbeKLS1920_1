package Speicher;

import java.io.*;

public class SpeicherImpl implements Speicher{
    @Override
    public int getErgebnis() {
        return 0;
    }

    @Override
    public void setzeZuruck() {

    }

    @Override
    public int returnWert() {
        return 0;
    }

    @Override
    public void vorherigerWert() {

    }

    public void addToFile(int result) {
        String filename = "filename";

        try {
            OutputStream os = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(os);

            try {
                dos.writeInt(result);
            }
            catch (IOException e) {
                System.err.println("couldn't write data");
            }
        }
        catch (FileNotFoundException f) {
            System.err.println("file not found");
            System.exit(0);
        }


    }
}
